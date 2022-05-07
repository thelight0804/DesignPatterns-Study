//PizzaIngredientFactory을 구현하는 이탈리아식 Pizza 팩토리 클래스
package ch04.FullPizzaStore.PizzaIngredientFactory;

import ch04.FullPizzaStore.Cheese.Cheese;
import ch04.FullPizzaStore.Cheese.GorgonzolaCheese;
import ch04.FullPizzaStore.Dough.Dough;
import ch04.FullPizzaStore.Dough.ThinDough;
import ch04.FullPizzaStore.Sauce.CarbonaraSauce;
import ch04.FullPizzaStore.Sauce.Sauce;
import ch04.FullPizzaStore.Topping.HerbTopping;
import ch04.FullPizzaStore.Topping.Topping;

public class ITPizzaIngredientFactory implements PizzaIngredientFactory {
  public Dough createDough() {
    Dough dough = new ThinDough();
    return dough;
  }

  public Sauce createSauce() {
    Sauce sauce = new CarbonaraSauce();
    return sauce;
  }

  public Cheese createCheese() {
    Cheese cheese = new GorgonzolaCheese();
    return cheese;
  }

  public Topping createTopping() {
    Topping topping = new HerbTopping();
    return topping;
  }
}
