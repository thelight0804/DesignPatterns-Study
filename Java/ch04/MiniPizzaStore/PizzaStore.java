
package ch04.MiniPizzaStore;

public class PizzaStore {
  SimplePizzaFactory factory;
  //PizzaStore과 SimplePizzaFactory을 연결한다

  public PizzaStore (SimplePizzaFactory factory){ this.factory = factory; }

  public Pizza orderPizza(String type) { //피자 주문
    Pizza pizza;
    pizza = factory.createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}
