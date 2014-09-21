package ga.guicearmory;

import com.google.inject.Guice;
import com.google.inject.Injector;
import ga.guicearmory.modules.DavidModule;

import java.io.IOException;


public class App {

    public static void main(String[] args) throws IOException {

        Injector injector = Guice.createInjector(new AppConfig(),new DavidModule());

        GuiceMaker guiceMaker = injector.getInstance(GuiceMaker.class);
        System.out.println(guiceMaker.getMagicDate());
    }
}
