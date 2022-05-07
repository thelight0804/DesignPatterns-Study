//피자 지점을 관리하는 클래스
package ch04.AddPizzaStore;

public abstract class PizzaStore {
  protected Pizza pizza = null;

  protected abstract Pizza createPizza(String type) ; //추상 팩토리 메소드
  public Pizza orderPizza(String type) { //피자 주문 (요리)
    pizza = createPizza(type); //피자가 만들어진다

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }
}
