package com.test_rekrutacyjny.test_rekrutacyjny.Zadanie3;

import java.util.Date;

public class Document {
    protected DocumentIssuer issuer;
    protected DocumentRecipient recipient;
    protected Date dateofIssue;
    protected int documentID;

    public Document(DocumentIssuer issuer, DocumentRecipient recipient, Date dateOfIssue, int documentID) {
        this.issuer = issuer;
        this.recipient = recipient;
        this.dateofIssue = dateOfIssue;
        this.documentID = documentID;
    }

    DocumentIssuer getIssuer() {
        return issuer;
    }

    DocumentRecipient getRecipient() {
        return recipient;
    }

    Date getDateOfIssue() {
        return dateofIssue;
    }

    int getDocumentID() {
        return documentID;
    }
}
