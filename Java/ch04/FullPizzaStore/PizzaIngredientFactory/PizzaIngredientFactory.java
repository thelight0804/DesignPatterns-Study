//Pizza의 재료를 정하는 추상 클래스 (추상 팩토리)
package ch04.FullPizzaStore.PizzaIngredientFactory;

import ch04.FullPizzaStore.Cheese.Cheese;
import ch04.FullPizzaStore.Dough.Dough;
import ch04.FullPizzaStore.Sauce.Sauce;
import ch04.FullPizzaStore.Topping.Topping;

public interface PizzaIngredientFactory {
  public Dough createDough() ;
  public Sauce createSauce() ;
  public Cheese createCheese() ;
  public Topping createTopping() ;
}

