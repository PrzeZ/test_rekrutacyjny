package com.test_rekrutacyjny.test_rekrutacyjny.Zadanie3;

import java.util.Date;

public class Invoice extends Document{
    private String type;

    public Invoice(DocumentIssuer issuer, DocumentRecipient recipient, Date dateOfIssue, int documentID, String type) {
        super(issuer, recipient, dateOfIssue, documentID);
        this.type = type;
    }
}
