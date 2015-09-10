package com.thoughtworks.baseline4;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ProductTest {

    private Product product;

    @Test
    public void shouldReturnMeRoundedTaxAmountOnPriceWhenICallCalculateTax() {
        product = new Product(7.47);

        assertEquals(0.70, product.calculateTax());
    }

    @Test
    public void shouldReturnMeRoundedTaxAmountOnPriceWhenICallCalculateTaxWithSomeValueMultipleOfFiveButNotOfTen() {
        product = new Product(7.59);

        assertEquals(0.75, product.calculateTax());
    }

    @Test
    public void shouldreturnMetotalPriceIncludingTaxWhenICallGetTotalPriceIncludingTaxesMethod() {
        product = new Product(7.59);

        product.calculateTax();

        assertEquals(8.34, product.getTotalPriceIncludingTaxes());
    }
}