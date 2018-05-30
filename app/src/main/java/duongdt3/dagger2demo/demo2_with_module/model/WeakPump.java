package duongdt3.dagger2demo.demo2_with_module.model;

import android.util.Log;

public class WeakPump implements Pump {
    @Override
    public void pump() {
        Log.d("WeakPump", "pump weak");
    }
}
