package ch04.MiniPizzaStore;

//PizzaStore에서 함깨 생성되는 Factory

public class SimplePizzaFactory {
    public Pizza createPizza(String type) { //종류에 따라 분류한다
        Pizza pizza = null; //주문 받지 않았으니 null로 초기화한다
        if (type.equals("Cheese")) {
            pizza = new CheesePizza();
        }
        else if (type.equals("Veggie")) {
            pizza = new VeggiePizza();
        }
        else if (type.equals("Clam")) {
            pizza = new ClamPizza();
        }
        else if (type.equals("Pepperoni")) {
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
