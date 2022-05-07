
package ch03.Cafe;

public class Milk extends Condimentdecorator {
  private Beverage beverage;

  public Milk(Beverage beverage) { this.beverage = beverage; }

  public String getDescription() { return beverage.getDescription() + " + (Milk)"; }

  public double cost() { return 0.15+beverage.cost(); }

}
