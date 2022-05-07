
package ch04.MiniPizzaStore;

public class VeggiePizza extends Pizza {
  public void prepare() { System.out.println("VeggiePizza 준비 중..."); }
  public void bake() { System.out.println("VeggiePizza 굽는 중..."); }
  public void cut() { System.out.println("VeggiePizza 자르는 중..."); }
  public void box() { System.out.println("VeggiePizza 포장 중...\n"); }
}
