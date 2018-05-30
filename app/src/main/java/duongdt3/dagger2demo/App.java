package duongdt3.dagger2demo;

import android.app.Application;

import duongdt3.dagger2demo.demo1_without_module.di.DaggerWeaponComponent;
import duongdt3.dagger2demo.demo1_without_module.di.WeaponComponent;
import duongdt3.dagger2demo.demo2_with_module.model.CoffeeComponent;
import duongdt3.dagger2demo.demo2_with_module.model.DaggerCoffeeComponent;

public class App extends Application {

    private CoffeeComponent coffeeComponent = null;
    private WeaponComponent weaponComponent = null;
    @Override
    public void onCreate() {
        super.onCreate();
        createWeaponComponent();
        createCoffeeComponent();
    }

    private void createCoffeeComponent() {
        coffeeComponent = DaggerCoffeeComponent.create();
    }

    public CoffeeComponent getCoffeeComponent() {
        return coffeeComponent;
    }

    private void createWeaponComponent() {
        weaponComponent = DaggerWeaponComponent.create();
    }

    public WeaponComponent getWeaponComponent() {
        return weaponComponent;
    }
}
