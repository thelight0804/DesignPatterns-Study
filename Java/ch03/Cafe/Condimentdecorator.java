
package ch03.Cafe;

public abstract class Condimentdecorator extends Beverage {
  public abstract String getDescription();
}
/*
* getDescription()
* Beverage의 추상클래스를 다시 한번 추상클래스로 선언이 가능하다
* 하지만, 맨 마지막 하위에서 반드시 오버라이딩(구현)해야 한다
* */
