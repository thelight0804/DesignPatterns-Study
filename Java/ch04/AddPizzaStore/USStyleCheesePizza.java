//Pizza를 상속 받는 피자 클래스
package ch04.AddPizzaStore;

public class USStyleCheesePizza extends Pizza {
  public USStyleCheesePizza() {
    name = "미국형 치즈 피자";
    dough = "치즈볼 도우";
    sauce = "머스타드";
    toppings.add("슈레드 치즈");
  }
}
