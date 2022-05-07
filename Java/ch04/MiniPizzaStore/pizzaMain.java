package ch04.MiniPizzaStore;

public class pizzaMain {
    public static void main (String args[]){
        PizzaStore changwon = new PizzaStore(new SimplePizzaFactory());
        //SimplePizzaFactory를 가지는 PizzaStore을 생성한다

        Pizza order1 = changwon.orderPizza("Cheese");
        Pizza order2 = changwon.orderPizza("Veggie");
        Pizza order3 = changwon.orderPizza("Clam");
        Pizza order4 = changwon.orderPizza("Pepperoni");
    }
}
