package duongdt3.dagger2demo.demo2_with_module.model;

import dagger.Component;

@Component(modules = CoffeeModule.class)
public interface CoffeeComponent {
    void inject(CoffeeShop coffeeShop);
}
