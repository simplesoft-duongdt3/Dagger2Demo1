package duongdt3.dagger2demo.demo1_without_module.model;

import android.util.Log;

import javax.inject.Inject;

public class Sword implements Weapon {

    @Inject public Sword() {
    }

    @Override
    public void hit() {
        Log.d("Sword", "hit!!!");
    }
}
