//Pizza를 상속 받는 피자 클래스
package ch04.AddPizzaStore;

public class KRStyleVeggiePizza extends Pizza {
  public KRStyleVeggiePizza() {
    name = "한국형 채소 피자";
    dough = "감자 도우";
    sauce = "양파 소스";
    toppings.add("마늘");
  }
}
