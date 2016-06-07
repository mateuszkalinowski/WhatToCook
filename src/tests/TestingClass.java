package tests;

import auxiliary.ListHandler;
import auxiliary.PairAmountUnit;
import auxiliary.RecipeParameters;
import core.Ingredient;
import core.IngredientsList;
import core.Recipe;
import core.WhatToCook;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;

import static org.junit.Assert.*;

public class TestingClass {

    @Test
    public void testAddIngredient() throws Exception {
        ArrayList<String> collection = new ArrayList<>();
        collection.add("Banan");
        assertEquals(1, collection.size());
        collection.add("Ananas");
        assertEquals(2, collection.size());
    }

    @Test
    public void testInitialize() throws FileNotFoundException {
        TreeSet<Ingredient> IngredientsList = new TreeSet<>();
        String[] tmp;
        Scanner in = new Scanner(new File("data/Ingredients/ingredients"));
        for (int i = 0; i < 2 ; i++) {
            String line = in.nextLine();
            tmp = line.split("/");
            Ingredient toAdd = new Ingredient(tmp[0]);
            IngredientsList.add(toAdd);
            if (i == 0)
                assertEquals(new Ingredient("Ananasy"), toAdd);
            else if (i == 1)
                assertNotEquals(new Ingredient("Banany"), toAdd);
        }
    }

    @Test
    public void testRecipeParameters() throws Exception {
        int preparingEase = 0;
        int preparingTime = 0;
        boolean[] parameters = {true,true,false,false,false};
        RecipeParameters testParameters = new RecipeParameters(parameters,preparingEase,preparingTime);
        assertEquals(preparingEase,testParameters.getPreparingEase());
        assertEquals(preparingTime,testParameters.getPreparingTime());
        assertEquals(parameters,testParameters.getParameters());
    }

    @Test
    public void testPairAmountUnit() throws Exception {
        String amount = "2";
        String unit = "kg";
        PairAmountUnit testPairAmountUnit = new PairAmountUnit(amount,unit);
        assertEquals(amount,testPairAmountUnit.getAmount());
        assertEquals(unit,testPairAmountUnit.getUnit());
    }

    @Test
    public void testListHandler() throws Exception {
        String ingredient = "Ananasy";
        String amount = "2";
        String unit = "sztuki";
        ListHandler testListHandler = new ListHandler(ingredient,amount,unit);
        assertEquals(ingredient,testListHandler.getIngredient());
        assertEquals(amount,testListHandler.getAmmount());
        assertEquals(unit,testListHandler.getUnit());
    }

    @Test
    public void testIngredient() throws Exception {
        String ingredientName = "Ananasy";
        Ingredient ananasy = new Ingredient(ingredientName);
        assertEquals(ingredientName,ananasy.getName());
    }

    @Test
    public void testRecipeConstructor() throws Exception {
        String name = "Name";
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Ingredient("ingr"));
        String instructions = "instructions";
        ArrayList<PairAmountUnit> PAU = new ArrayList<>();
        PAU.add(new PairAmountUnit("amount", "unit"));
        boolean[] params = {false, false, false, false, false};
        RecipeParameters parameters = new RecipeParameters(params, 0, 0);

        Recipe recipe = new Recipe(name, ingredients, PAU, instructions, parameters);

        assertEquals(recipe.getName(), name);
        assertTrue(ingredients.equals(recipe.getIngredients()));
        assertTrue(PAU.equals(recipe.getPairAmountUnitList()));
        assertEquals(recipe.getRecipe(), instructions);
        assertTrue(recipe.getParameters().getParameters() == params);
    }
}