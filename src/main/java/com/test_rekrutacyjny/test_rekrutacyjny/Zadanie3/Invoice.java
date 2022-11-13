package com.test_rekrutacyjny.test_rekrutacyjny.Zadanie3;

import java.util.Date;

public class Invoice extends Document{


    private String type;
    private double discount = 0;

    public String getType() {
        return type;
    }

    public Invoice(DocumentIssuer issuer, DocumentRecipient recipient, Date dateOfIssue, int documentID, String type,
    double discount) {
    super(issuer, recipient, dateOfIssue, documentID);
    this.type = type;
    this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }


}
