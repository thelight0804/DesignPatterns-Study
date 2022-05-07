//한국 피자 가게
package ch04.FullPizzaStore.PizzaStore;

import ch04.FullPizzaStore.Pizza.KRPizza;
import ch04.FullPizzaStore.Pizza.Pizza;

public class KRPizzaStore extends PizzaStore {
  protected Pizza createPizza(String type) {
    pizza = new KRPizza(type);
    return pizza;
  }
}