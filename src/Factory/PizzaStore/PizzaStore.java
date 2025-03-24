package Factory.PizzaStore;

import Factory.Factory.PizzaFactory;
import Factory.Models.Pizza;

public class PizzaStore {
    PizzaFactory pizzaFactory;
    PizzaStore(PizzaFactory pizzaFactory){
        this.pizzaFactory = pizzaFactory;
    }
    public Pizza orderPizza(String type){
        Pizza pizza = PizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);
        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("veggie");

    }
}
