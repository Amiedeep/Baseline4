//contains the information of the product.
package com.thoughtworks.baseline4;

import static java.lang.Math.round;

public class Product {

    private double price;

    public Product(double price) {
        this.price = price;
    }

    public double calculateTax() {

        double taxAmount = (price*10)/100;
        taxAmount = (int)(taxAmount*100);
        if(taxAmount%10 == 5) {
            return (double)taxAmount/100;
        }
        else {
            taxAmount = (int)round((double)taxAmount / 10);
            return (double)taxAmount/10;
        }
    }
}
