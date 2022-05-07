
package ch04.MiniPizzaStore;

public class PepperoniPizza extends Pizza {
  public void prepare() { System.out.println("PepperoniPizza 준비 중..."); }
  public void bake() { System.out.println("PepperoniPizza 굽는 중..."); }
  public void cut() { System.out.println("PepperoniPizza 자르는 중..."); }
  public void box() { System.out.println("PepperoniPizza 포장 중...\n"); }
}
