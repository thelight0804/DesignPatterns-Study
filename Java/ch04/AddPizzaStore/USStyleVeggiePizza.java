//Pizza를 상속 받는 피자 클래스
package ch04.AddPizzaStore;

public class USStyleVeggiePizza extends Pizza {
  public USStyleVeggiePizza() {
    name = "미국형 채소 피자";
    dough = "오레오 도우";
    sauce = "핫소스";
    toppings.add("아스파라거스");
  }
}
