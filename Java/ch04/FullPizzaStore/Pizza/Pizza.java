//Pizza가 생성되는 Pizza 객체
package ch04.FullPizzaStore.Pizza;

import ch04.FullPizzaStore.Cheese.Cheese;
import ch04.FullPizzaStore.Dough.Dough;
import ch04.FullPizzaStore.PizzaIngredientFactory.PizzaIngredientFactory;
import ch04.FullPizzaStore.Sauce.Sauce;
import ch04.FullPizzaStore.Topping.Topping;

public class Pizza {
  protected String name = null;
  protected Dough dough = null;
  protected Sauce sauce = null;
  protected Cheese cheese = null;
  protected Topping topping = null;
  protected PizzaIngredientFactory pizzaIngredientFactory = null;

  public void prepare() {
    System.out.println("[주문 : " + name + "]");
    System.out.println("- 도우 : " + dough.getDough() );
    System.out.println("- 소스 : " + sauce.getSauce() );
    System.out.println("- 토핑 : " + topping.getTopping() );
  }
  public void bake() { System.out.println(name +" 굽는 중..."); }
  public void cut() { System.out.println(name +" 자르는 중..."); }
  public void box() { System.out.println(name +" 포장 중...\n"); }
}
