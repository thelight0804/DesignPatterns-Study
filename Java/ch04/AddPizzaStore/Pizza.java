//피자 종류를 구분하는 클래스
package ch04.AddPizzaStore;

import java.util.ArrayList;

class Pizza {
  protected String name = null; //피자 이름
  protected String dough = null; //도우
  protected String sauce = null; //소스
  protected ArrayList toppings = new ArrayList(); //토핑 ArrayList

  public void prepare() {
    System.out.println("[주문 : " + name + "]");
    System.out.println("- 도우 : " + dough);
    System.out.println("- 소스 : " + sauce);

    System.out.print("- 추가 토핑 : ");
    for (int i=0;i<toppings.size();i++)
      System.out.println(toppings.get(i));
  }

  public void bake() { System.out.println(name +" 굽는 중..."); }
  public void cut() { System.out.println(name +" 자르는 중..."); }
  public void box() { System.out.println(name +" 포장 중...\n"); }
}
