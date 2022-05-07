
package ch03.Cafe;

public class Whip extends Condimentdecorator {
  private Beverage beverage;

  public Whip(Beverage beverage) { this.beverage = beverage; } //beverage를 감싼다
  //Beverage beverage를 Whip의 beverage에 넣는다

  public String getDescription() { return beverage.getDescription() + " + (Whip)"; }

  public double cost() { return beverage.cost()+0.10; }
}
