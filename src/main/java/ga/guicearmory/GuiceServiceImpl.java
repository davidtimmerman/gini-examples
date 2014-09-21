package ga.guicearmory;

import javax.inject.Singleton;

@Singleton
public class GuiceServiceImpl implements GuiceService {
    @Override
    public String guiceMe() {
        return "You got guiced";
    }
}
