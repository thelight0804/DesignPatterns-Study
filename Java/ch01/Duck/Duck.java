package ch01.Duck;

class Duck {
  protected FlyBehavior flyBehavior;
  protected QuackBehavior quackBehavior;

  public void swim() { System.out.println("수영 중 (Duck.swim)"); }
  public void display() { System.out.println("표시 중 (Duck.display)"); }
  public void performQuack(String duck) { quackBehavior.quack(duck); }
  public void performFly(String duck) { flyBehavior.fly(duck); }
  public void setFlyBehavior(FlyBehavior fb) { System.out.println("Call to Duck.setFlyBehavior()"); }
  public void setQuackBehavior(FlyBehavior qb) { System.out.println("Call to Duck.setQuackBehavior()"); }
}
