package ga.guicearmory;

import com.google.inject.AbstractModule;

public class AppConfig extends AbstractModule {
    @Override
    protected void configure() {
        bind(GuiceService.class).to(GuiceServiceImpl.class);

        //bind(Key.get(String.class,new ga.guicearmory.annotations.PropertyImpl("hi"))).toInstance("suuuuper");


    }
}
