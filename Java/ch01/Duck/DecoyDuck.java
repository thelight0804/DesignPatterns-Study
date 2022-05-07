
package ch01.Duck;

class DecoyDuck extends Duck {
  public DecoyDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new MuteQuack();
  }
  public void display() { System.out.println("Call to DecoyDuck.display()"); }
}
