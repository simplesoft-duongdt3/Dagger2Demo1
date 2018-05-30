package duongdt3.dagger2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import duongdt3.dagger2demo.demo1_without_module.model.War;
import duongdt3.dagger2demo.demo2_with_module.model.CoffeeShop;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //demo 1 without module
        War war = new War();
        war.prepare((App) getApplication());
        war.war();

        //demo 2 with module
        CoffeeShop coffeeShop = new CoffeeShop();
        coffeeShop.prepare((App) getApplication());
        coffeeShop.makeCoffee();
    }
}
