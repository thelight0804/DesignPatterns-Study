
package ch04.MiniPizzaStore;

public class ClamPizza extends Pizza { //ClamPizza : 조개 피자...
  public void prepare() { System.out.println("ClamPizza 준비 중..."); }
  public void bake() { System.out.println("ClamPizza 굽는 중..."); }
  public void cut() { System.out.println("ClamPizza 자르는 중..."); }
  public void box() { System.out.println("ClamPizza 포장 중...\n"); }
}
