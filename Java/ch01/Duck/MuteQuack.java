
package ch01.Duck;

class MuteQuack implements QuackBehavior {
  public void quack(String duck) { System.out.println(duck + " : 조용... (MuteQuack.quack())"); }
}
