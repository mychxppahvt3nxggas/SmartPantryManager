# Smart Pantry Manager

## Overview
Smart Pantry Manager is an Android application designed to help users track their household food inventory, reduce food waste, and discover meals they can cook using what they already have on hand.

## GitHub Repository
- **Project Repository:** [https://github.com/mychxppahvt3nxggas/SmartPantryManager](https://github.com/mychxppahvt3nxggas/SmartPantryManager)

## Key Features
- **Pantry Inventory Tracking:** Keeps a running list of available food items and quantities.
- **Recipe Matching Algorithm (`RecipeMatcher`):** Compares pantry inventory against required recipe ingredients to suggest available meals.
- **Dynamic RecyclerViews:** Displays inventory and matched recipes using custom adapters.
- **Cloud-Ready Data Structures:** Built with extensible data models supporting local inventory lists and Firebase Firestore integration.

## Architecture & Package Structure
- `com.example.smartpantrymanager`: Core UI activities (`MainActivity`, `RecipeActivity`), adapters (`RecipeAdapter`), and data models (`Recipe`, `RecipeIngredient`, `PantryItem`).
- `com.example.smartpantrymanager.logic`: Core business logic and matching algorithm (`RecipeMatcher`).

## Setup & Installation
1. Clone or extract the project repository/zip into your workspace.
2. Open **Android Studio**.
3. Select **Open** and navigate to the root `SmartPantryManager` directory.
4. Allow Gradle to sync dependencies, then click **Run** to launch the app on an emulator or connected device.