//PizzaIngredientFactory을 구현하는 한국식 Pizza 팩토리 클래스
package ch04.FullPizzaStore.PizzaIngredientFactory;

import ch04.FullPizzaStore.Cheese.Cheese;
import ch04.FullPizzaStore.Cheese.MozzarellaCheese;
import ch04.FullPizzaStore.Dough.CheeseDough;
import ch04.FullPizzaStore.Dough.Dough;
import ch04.FullPizzaStore.Sauce.GarlicSauce;
import ch04.FullPizzaStore.Sauce.Sauce;
import ch04.FullPizzaStore.Topping.PotatoTopping;
import ch04.FullPizzaStore.Topping.Topping;

public class KRPizzaIngredientFactory implements PizzaIngredientFactory {
  public Dough createDough() {
    Dough dough = new CheeseDough();
    return dough;
  }

  public Sauce createSauce() {
    Sauce sauce = new GarlicSauce();
    return sauce;
  }

  public Cheese createCheese() {
    Cheese cheese = new MozzarellaCheese();
    return cheese;
  }

  public Topping createTopping() {
    Topping topping = new PotatoTopping();
    return topping;
  }
}
