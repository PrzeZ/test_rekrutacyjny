package com.test_rekrutacyjny.test_rekrutacyjny.Zadanie4;

import org.springframework.cache.annotation.Cacheable;

public class Invoice {
        private String invoiceNumber;
        private Object invoiceData;

        public Invoice(String invoiceNumber, Object invoiceData) {
        this.invoiceNumber = invoiceNumber;
        this.invoiceData = invoiceData;
    }
        @Cacheable
        public String getInvoiceNumber() {
            return invoiceNumber;
        }

        public void setInvoiceNumber(String invoiceNumber) {
            this.invoiceNumber = invoiceNumber;
        }

        @Cacheable
        public Object getInvoiceData() {
            return invoiceData;
        }

        public void setInvoiceData(Object invoiceData) {
            this.invoiceData = invoiceData;
        }
}
