
package ch01.Duck;

class FlyNoWay implements FlyBehavior {
  public void fly(String duck) { System.out.println(duck + " : 날지 못하는 중 (FlyNoWay.fly())"); }
}
