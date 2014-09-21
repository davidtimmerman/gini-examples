package ga.guicearmory;

import javax.inject.Singleton;

@Singleton
public class HelloGiniServiceImpl implements HelloGiniService {
    @Override
    public String greeting() {
        return "Gini says: ";
    }
}
