//PizzaStore을 상속받는 지점 클래스
package ch04.AddPizzaStore;

class USPizzaStore extends PizzaStore {
  protected Pizza createPizza(String type) {
    if (type.equals("cheese"))
      pizza = new USStyleCheesePizza();
    else if (type.equals("veggie"))
      pizza = new USStyleVeggiePizza();
    return pizza;
  }
}
