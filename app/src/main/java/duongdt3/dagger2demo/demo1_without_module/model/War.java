package duongdt3.dagger2demo.demo1_without_module.model;

import javax.inject.Inject;

import duongdt3.dagger2demo.App;

public class War {
    @Inject
    protected Sword weapon;
    @Inject
    protected Gun gun;

    public void prepare(App app) {
        app.getWeaponComponent().inject(this);
    }

    public void war() {
        weapon.hit();
        gun.hit();
    }
}
