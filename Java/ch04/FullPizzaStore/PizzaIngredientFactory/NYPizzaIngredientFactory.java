//PizzaIngredientFactory을 구현하는 미국식 Pizza 팩토리 클래스
package ch04.FullPizzaStore.PizzaIngredientFactory;

import ch04.FullPizzaStore.Cheese.Cheese;
import ch04.FullPizzaStore.Cheese.ShredCheese;
import ch04.FullPizzaStore.Dough.Dough;
import ch04.FullPizzaStore.Dough.ThickDough;
import ch04.FullPizzaStore.Sauce.Sauce;
import ch04.FullPizzaStore.Sauce.TomatoSauce;
import ch04.FullPizzaStore.Topping.BaconTopping;
import ch04.FullPizzaStore.Topping.Topping;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
  public Dough createDough() {
    Dough dough = new ThickDough();
    return dough;
  }

  public Sauce createSauce() {
    Sauce sauce = new TomatoSauce();
    return sauce;
  }

  public Cheese createCheese() {
    Cheese cheese = new ShredCheese();
    return cheese;
  }

  public Topping createTopping() {
    Topping topping = new BaconTopping();
    return topping;
  }
}
