
package ch04.FullPizzaStore.Pizza;

import ch04.FullPizzaStore.PizzaIngredientFactory.KRPizzaIngredientFactory;

public class KRPizza extends Pizza {
  public KRPizza(String type) {
    name = "한국 피자";
    KRPizzaIngredientFactory pizzaIngredientFactory = new KRPizzaIngredientFactory();
    dough = pizzaIngredientFactory.createDough();
    sauce = pizzaIngredientFactory.createSauce();
    cheese = pizzaIngredientFactory.createCheese();
    topping = pizzaIngredientFactory.createTopping();
  }
}