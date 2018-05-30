package duongdt3.dagger2demo.demo2_with_module.model;

import android.util.Log;

public class CoffeeMachine {
    private Pump pump;

    public CoffeeMachine(Pump pump) {
        this.pump = pump;
    }

    public void make() {
        Log.d("CoffeeMachine", "Begin make coffee.");
        pump.pump();
        Log.d("CoffeeMachine", "End make coffee.");
    }
}
