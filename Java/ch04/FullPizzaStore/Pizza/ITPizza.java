
package ch04.FullPizzaStore.Pizza;

import ch04.FullPizzaStore.PizzaIngredientFactory.ITPizzaIngredientFactory;

public class ITPizza extends Pizza {
  public ITPizza(String type) {
    name = "이탈리아 피자";
    ITPizzaIngredientFactory pizzaIngredientFactory = new ITPizzaIngredientFactory();
    dough = pizzaIngredientFactory.createDough();
    sauce = pizzaIngredientFactory.createSauce();
    cheese = pizzaIngredientFactory.createCheese();
    topping = pizzaIngredientFactory.createTopping();
  }
}
