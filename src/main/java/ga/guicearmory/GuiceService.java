package ga.guicearmory;

import com.google.inject.ImplementedBy;

@ImplementedBy(GuiceServiceImpl.class)
public interface GuiceService {
    String guiceMe();
}
