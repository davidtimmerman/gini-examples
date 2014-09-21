package ga.guicearmory;

import com.google.inject.ImplementedBy;

@ImplementedBy(HelloGiniServiceImpl.class)
public interface HelloGiniService {
    public String greeting();
}
