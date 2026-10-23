package com.example.smartpantrymanager.models;

import java.util.List;

public class Recipe {
    private String id;
    private String name;
    private String steps;
    private List<RecipeIngredient> requiredIngredients;

    public Recipe() {}

    public Recipe(String id, String name, String steps, List<RecipeIngredient> requiredIngredients) {
        this.id = id;
        this.name = name;
        this.steps = steps;
        this.requiredIngredients = requiredIngredients;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getSteps() { return steps; }
    public void setSteps(String steps) { this.steps = steps; }
    public List<RecipeIngredient> getRequiredIngredients() { return requiredIngredients; }
    public void setRequiredIngredients(List<RecipeIngredient> requiredIngredients) {
        this.requiredIngredients = requiredIngredients;
    }
}