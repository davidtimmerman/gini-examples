package ga.guicearmory;


import ga.guicearmory.gini.annotations.Property;

import javax.inject.Inject;
import java.util.Date;

public class GuiceMaker {

    private GuiceService guicer;
    private Date magicDate;
    private String wizandry;

    @Inject
    public GuiceMaker(GuiceService guicer, @Property(value = "juicy.key") Date magicDate, String wizandry) {
        this.guicer = guicer;
        this.magicDate = magicDate;
        this.wizandry = wizandry;

    }

    public String getGuice(){
        return guicer.guiceMe();
    }

    public Date getMagicDate() {
        return magicDate;
    }

    public String getWizandry() {
        return wizandry;
    }
}
