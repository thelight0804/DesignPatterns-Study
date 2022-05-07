package ch04.MiniPizzaStore;

//Pizza를 상속받는 CheesePizza
public class CheesePizza extends Pizza {
  public void prepare() { System.out.println("CheesePizza 준비 중..."); }
  public void bake() { System.out.println("CheesePizza 굽는 중..."); }
  public void cut() { System.out.println("CheesePizza 자르는 중..."); }
  public void box() { System.out.println("CheesePizza 포장 중...\n"); }
}
