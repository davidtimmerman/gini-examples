package ga.guicearmory;

import com.google.inject.Guice;
import com.google.inject.Injector;
import ga.guicearmory.modules.AppModule;
import ga.guicearmory.modules.HelloGiniModule;

import java.io.IOException;


public class App {

    public static void main(String[] args) throws IOException {

        Injector injector = Guice.createInjector(new AppModule(), new HelloGiniModule());

        HelloGini helloGini = injector.getInstance(HelloGini.class);
        System.out.println(helloGini.getHelloDate());
    }
}
