//Pizza 클래스를 상속받아 Pizza 종류를 캡슐화한 클래스
package ch04.FullPizzaStore.Pizza;

import ch04.FullPizzaStore.PizzaIngredientFactory.NYPizzaIngredientFactory;

public class NYPizza extends Pizza {
  public NYPizza(String type) {
    name = "미국 피자";
    NYPizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
    dough = pizzaIngredientFactory.createDough();
    sauce = pizzaIngredientFactory.createSauce();
    cheese = pizzaIngredientFactory.createCheese();
    topping = pizzaIngredientFactory.createTopping();
  }
}
