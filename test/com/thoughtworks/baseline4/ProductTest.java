package com.thoughtworks.baseline4;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ProductTest {

    private Product product;

    @Test
    public void shouldReturnMeRoundedTaxAmountOnPriceWhenICallCalculateTax() {
        product = new Product(7.478);

        assertEquals(0.70, product.calculateTax());
    }
}