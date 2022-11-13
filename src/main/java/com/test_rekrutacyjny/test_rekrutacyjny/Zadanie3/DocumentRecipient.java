package com.test_rekrutacyjny.test_rekrutacyjny.Zadanie3;

public class DocumentRecipient {
    private String name;
    private double discount = 0;

    public DocumentRecipient(String name, double discount) {
        this.name = name;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }
    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
