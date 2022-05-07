
package ch03.Cafe;

public class Mocha extends Condimentdecorator {
  private Beverage beverage;

  public Mocha(Beverage beverage) { this.beverage = beverage; }

  public String getDescription() { return beverage.getDescription() + " + (Mocha)"; }

  public double cost() { return 0.2+beverage.cost(); }
}
