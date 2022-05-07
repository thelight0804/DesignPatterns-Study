//PizzaStore을 상속받는 지점 클래스
package ch04.AddPizzaStore;

class KRPizzaStore extends PizzaStore {
  protected Pizza createPizza(String type) {
    if (type.equals("cheese"))
      pizza = new KRStyleCheesePizza();
    else if (type.equals("veggie"))
      pizza = new KRStyleVeggiePizza();
    return pizza;
  }
}
