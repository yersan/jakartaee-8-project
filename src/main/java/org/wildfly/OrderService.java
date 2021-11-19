package org.wildfly;

import javax.ejb.Stateless;
import java.util.logging.Level;
import java.util.logging.Logger;

@Stateless
public class OrderService {
    private Logger log = Logger.getAnonymousLogger();

    public void createOrder(Order order) {
        log.log(Level.INFO, "Creating Order:" + order);
    }
}
