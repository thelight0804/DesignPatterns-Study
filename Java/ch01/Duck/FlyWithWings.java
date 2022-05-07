
package ch01.Duck;

class FlyWithWings implements FlyBehavior {
  public void fly(String duck) { System.out.println(duck + " : 나는 중 (FlyWithWings.fly())"); }
}
