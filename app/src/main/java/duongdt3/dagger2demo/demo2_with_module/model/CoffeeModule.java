package duongdt3.dagger2demo.demo2_with_module.model;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeModule {

    @Provides
    Pump createPump() {
        return new WeakPump();
    }

    @Provides
    CoffeeMachine createCoffeeMachine(Pump pump) {
        return new CoffeeMachine(pump);
    }
}
