
package ch01.Duck;

class MallardDuck extends Duck {
  public MallardDuck() {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
  }
  public void display() { System.out.println("Call to MallardDuck.display()"); }
}
