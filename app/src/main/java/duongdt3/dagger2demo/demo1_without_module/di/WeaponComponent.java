package duongdt3.dagger2demo.demo1_without_module.di;

import dagger.Component;
import duongdt3.dagger2demo.demo1_without_module.model.War;

@Component
public interface WeaponComponent {
    void inject(War war);
}
