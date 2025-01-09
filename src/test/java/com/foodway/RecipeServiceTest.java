package com.foodway.foodway;

import com.foodway.foodway.model.Recipe;
import com.foodway.foodway.service.RecipeService;
import com.foodway.foodway.repository.RecipeRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
public class RecipeServiceTest {

    @Mock
    private RecipeRepository recipeRepository;

    @InjectMocks
    private RecipeService recipeService;

    @Test
    public void testCreateRecipe() {
        Recipe recipe = new Recipe();
        recipe.setName("Pasta");
        recipe.setDescription("A delicious pasta recipe");
        recipe.setIngredients("Pasta, tomato sauce, cheese");
        recipe.setInstructions("Boil pasta, add sauce, sprinkle cheese");

        when(recipeRepository.save(any(Recipe.class))).thenReturn(recipe);

        Recipe createdRecipe = recipeService.createRecipe(recipe);

        assertNotNull(createdRecipe);
        assertEquals("Pasta", createdRecipe.getName());
        verify(recipeRepository, times(1)).save(recipe);
    }
}
