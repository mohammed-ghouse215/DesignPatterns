package Factory.Factory;

import Factory.Models.Pizza;
import Factory.PepperoniPizza.PepperonPizza;
import Factory.VegPizza.VegPizza;
import Factory.cheesePizza.cheesePizza;

public class PizzaFactory {
    public static Pizza createPizza(String type){
        if(type.equals("cheese")){
            return new cheesePizza();
        }
        if(type.equals("veggie")){
            return new VegPizza();
        }
        if(type.equals("pepperoni")){
            return new PepperonPizza();
        }
        return null;
    }
}
