//미국 피자 가게
package ch04.FullPizzaStore.PizzaStore;

import ch04.FullPizzaStore.Pizza.NYPizza;
import ch04.FullPizzaStore.Pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
  protected Pizza createPizza(String type) {
    pizza = new NYPizza(type);
    return pizza;
  }
}
