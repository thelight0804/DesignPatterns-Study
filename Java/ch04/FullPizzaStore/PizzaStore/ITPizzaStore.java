//이탈리아 피자 가게
package ch04.FullPizzaStore.PizzaStore;

import ch04.FullPizzaStore.Pizza.ITPizza;
import ch04.FullPizzaStore.Pizza.Pizza;

public class ITPizzaStore extends PizzaStore {
  protected Pizza createPizza(String type) {
      pizza = new ITPizza(type);
      return pizza;
  }
}
