package ch04.FullPizzaStore;

import ch04.FullPizzaStore.Pizza.Pizza;
import ch04.FullPizzaStore.PizzaStore.ITPizzaStore;
import ch04.FullPizzaStore.PizzaStore.KRPizzaStore;
import ch04.FullPizzaStore.PizzaStore.NYPizzaStore;
import ch04.FullPizzaStore.PizzaStore.PizzaStore;

public class PizzaMain {
    public static void main (String[] args){
        PizzaStore krStore = new KRPizzaStore();
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore itStore = new ITPizzaStore();

        Pizza krPizza = krStore.orderPizza("Korea");
        krPizza.prepare();
        krPizza.bake();
        krPizza.cut();
        krPizza.box();

        Pizza nyPizza = nyStore.orderPizza("NewYork");
        nyPizza.prepare();
        nyPizza.bake();
        nyPizza.cut();
        nyPizza.box();

        Pizza itPizza = itStore.orderPizza("Italia");
        itPizza.prepare();
        itPizza.bake();
        itPizza.cut();
        itPizza.box();
    }
}
