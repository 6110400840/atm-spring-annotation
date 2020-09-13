package th.ac.ku.atm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtmUI {
    private ATM atm;

    @Autowired
    public AtmUI(ATM atm) {
        this.atm = atm;
    }

    public void run() {
    }
}
