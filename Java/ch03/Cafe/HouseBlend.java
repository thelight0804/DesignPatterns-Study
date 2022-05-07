
package ch03.Cafe;

//Beverage를 상속받은 HouseBlend

public class HouseBlend extends Beverage {
  public HouseBlend() { description = "House Blend Coffee"; }

  public double cost() { return 0.89; }
}
