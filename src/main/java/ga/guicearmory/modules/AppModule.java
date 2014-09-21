package ga.guicearmory.modules;

import com.google.inject.AbstractModule;
import ga.guicearmory.HelloGiniService;
import ga.guicearmory.HelloGiniServiceImpl;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(HelloGiniService.class).to(HelloGiniServiceImpl.class);
    }
}
