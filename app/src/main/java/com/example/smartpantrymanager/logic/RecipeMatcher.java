package com.example.smartpantrymanager.logic;

import com.example.smartpantrymanager.models.PantryItem;
import com.example.smartpantrymanager.models.Recipe;
import com.example.smartpantrymanager.models.RecipeIngredient;

import java.util.ArrayList;
import java.util.List;

public class RecipeMatcher {
    public static List<Recipe> getStrictlyMatchedRecipes(List<Recipe> allRecipes, List<PantryItem> userPantry) {
        List<Recipe> matchedRecipes = new ArrayList<>();
        if (allRecipes == null || userPantry == null) return matchedRecipes;

        for (Recipe recipe : allRecipes) {
            boolean canMake = true;
            for (RecipeIngredient req : recipe.getRequiredIngredients()) {
                boolean foundSufficient = false;
                for (PantryItem pantry : userPantry) {
                    if (normalize(pantry.getName()).equals(normalize(req.getName()))) {
                        if (pantry.getQuantity() >= req.getQuantity()) {
                            foundSufficient = true;
                            break;
                        }
                    }
                }
                if (!foundSufficient) {
                    canMake = false;
                    break;
                }
            }
            if (canMake) {
                matchedRecipes.add(recipe);
            }
        }
        return matchedRecipes;
    }

    private static String normalize(String name) {
        if (name == null) return "";
        String cleaned = name.toLowerCase().trim();
        if (cleaned.endsWith("es")) {
            cleaned = cleaned.substring(0, cleaned.length() - 2);
        } else if (cleaned.endsWith("s") && !cleaned.endsWith("ss")) {
            cleaned = cleaned.substring(0, cleaned.length() - 1);
        }
        return cleaned;
    }
}