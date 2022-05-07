
package ch01.Duck;

class RubberDuck extends Duck {
  public RubberDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }
  public void display() { System.out.println("Call to RubberDuck.display()"); }
}
