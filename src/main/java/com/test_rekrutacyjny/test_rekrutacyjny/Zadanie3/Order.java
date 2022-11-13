package com.test_rekrutacyjny.test_rekrutacyjny.Zadanie3;

import java.util.Date;

public class Order extends Document {
    private Date timeLimit;

    public Date getTimeLimit() {
        return timeLimit;
    }

    public Order(DocumentIssuer issuer, DocumentRecipient recipient, Date dateOfIssue, int documentID, Date timeLimit) {
        super(issuer, recipient, dateOfIssue, documentID);
        this.timeLimit = timeLimit;
    }

        double getDiscount() {
        return recipient.getDiscount();
    }
}