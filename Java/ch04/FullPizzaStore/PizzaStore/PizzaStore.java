//피자 지점을 관리하는 클래스
package ch04.FullPizzaStore.PizzaStore;

import ch04.FullPizzaStore.Pizza.Pizza;
import ch04.FullPizzaStore.PizzaIngredientFactory.PizzaIngredientFactory;

public abstract class PizzaStore {
  protected Pizza pizza = null;
  protected PizzaIngredientFactory pizzaIngredientFactory = null;

  protected abstract Pizza createPizza(String type) ;//추상 팩토리 메소드

  public Pizza orderPizza(String type) {
    pizza = createPizza(type); //피자가 만들어진다

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }
}
