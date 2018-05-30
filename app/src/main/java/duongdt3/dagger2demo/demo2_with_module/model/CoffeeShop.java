package duongdt3.dagger2demo.demo2_with_module.model;

import javax.inject.Inject;

import duongdt3.dagger2demo.App;

public class CoffeeShop {
    @Inject
    CoffeeMachine coffeeMachine;

    public void prepare(App app) {
        app.getCoffeeComponent().inject(this);
    }

    public void makeCoffee() {
        coffeeMachine.make();
    }
}
