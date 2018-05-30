package duongdt3.dagger2demo.demo1_without_module.model;

import android.util.Log;

import javax.inject.Inject;

public class Gun implements Weapon {

    @Inject public Gun() {
    }

    @Override
    public void hit() {
        Log.d("Gun", "shot!!!");
    }
}
