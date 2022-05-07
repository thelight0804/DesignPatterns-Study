package ch04.AddPizzaStore;

public class PizzaMain {
    public static void main (String[] args){
        PizzaStore krStore = new KRPizzaStore();
        PizzaStore usStore = new USPizzaStore();

        Pizza pizza1 = krStore.orderPizza("cheese");
        Pizza pizza2 = usStore.orderPizza("cheese");
        Pizza pizza3 = krStore.orderPizza("veggie");
        Pizza pizza4 = usStore.orderPizza("veggie");
    }
}
