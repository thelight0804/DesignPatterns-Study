
package ch01.Duck;

class RedheadDuck extends Duck {
  public RedheadDuck() {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
  }
  public void display() { System.out.println("Call to RedheadDuck.display()"); }
}
