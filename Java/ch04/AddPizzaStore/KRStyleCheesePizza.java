//Pizza를 상속 받는 피자 클래스
package ch04.AddPizzaStore;

public class KRStyleCheesePizza extends Pizza {
  public KRStyleCheesePizza() {
    name = "한국형 치즈 피자";
    dough = "쌀밥 도우";
    sauce = "고추장";
    toppings.add("모차렐라 치즈");
  }
}
