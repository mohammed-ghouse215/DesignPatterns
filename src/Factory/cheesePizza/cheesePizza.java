package Factory.cheesePizza;

import Factory.Models.Pizza;

public class cheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing cheese Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking cheese Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting cheese Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing cheese Pizza");
    }
}
