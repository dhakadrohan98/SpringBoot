package com.dailycodebuffer;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    //Logging
    //Authentication & Authorisation
    //Sanitize the Data
    public void checkout(String status){
        System.out.println("checkOut method is called from ShoppingCart class: "+status);
    }

    public int quantity() {
        return 2;
    }
}
