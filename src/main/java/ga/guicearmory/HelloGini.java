package ga.guicearmory;


import ga.guicearmory.gini.annotations.Property;
import org.joda.time.DateTime;

import javax.inject.Inject;
import java.util.Date;

public class HelloGini {

    private HelloGiniService giniService;

    private Date helloDate;
    private DateTime jodaDate;

    @Inject @Property("a.key") private String hello;
    @Inject @Property("b.key") private int two;
    @Inject @Property("c.key") private String world;

    @Inject
    public HelloGini(HelloGiniService giniService, @Property(value = "d.key") Date helloDate, @Property(value = "d.key") DateTime jodaDate) {
        this.giniService = giniService;
        this.helloDate = helloDate;
        this.jodaDate = jodaDate;
    }

    public String Greet(){
        return giniService.greeting()+hello+" "+two+" "+world;
    }

    public Date getHelloDate() {
        return helloDate;
    }

    public DateTime getJodaDate() {
        return jodaDate;
    }
}
