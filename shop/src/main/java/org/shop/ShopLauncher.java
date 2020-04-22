package org.shop;

import org.shop.config.MainConfig;
import org.shop.data.SomeClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The ShopLauncher class.
 */
public class ShopLauncher {
    
    /**
     * The main method.
     *
     * @param args the arguments
     */

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

        SomeClass someClass = context.getBean(SomeClass.class);
        String message = someClass.toString();
        Logger.getLogger(ShopLauncher.class.getName()).log(Level.FINE, "Checking class field initialization: {0}", message);
    }
}
