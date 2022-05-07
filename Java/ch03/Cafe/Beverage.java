
package ch03.Cafe;

public abstract class Beverage { //abstract : 추상클래스
  public String description = "No menu";

  public abstract double cost(); //각 메뉴에서 각자의 가격을 구현해야 한다
  public String getDescription() { return description; }
}
