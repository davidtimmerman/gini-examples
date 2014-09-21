package ga.guicearmory;


import ga.guicearmory.gini.annotations.Property;

import javax.inject.Inject;
import java.util.Date;

public class HelloGini {

    private HelloGiniService giniService;

    private Date helloDate;

    @Inject @Property("a.key") private String hello;
    @Inject @Property("b.key") private int two;
    @Inject @Property("c.key") private String world;

    @Inject
    public HelloGini(HelloGiniService giniService, @Property(value = "d.key") Date helloDate) {
        this.giniService = giniService;
        this.helloDate = helloDate;
    }

    public String Greet(){
        return giniService.greeting()+hello+" "+two+" "+world;
    }

    public Date getHelloDate() {
        return helloDate;
    }

}
