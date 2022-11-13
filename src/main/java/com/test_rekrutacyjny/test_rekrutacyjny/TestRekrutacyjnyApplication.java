package com.test_rekrutacyjny.test_rekrutacyjny;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test_rekrutacyjny.test_rekrutacyjny.Zadanie3.Document;
import com.test_rekrutacyjny.test_rekrutacyjny.Zadanie3.DocumentExporter;
import com.test_rekrutacyjny.test_rekrutacyjny.Zadanie3.DocumentIssuer;
import com.test_rekrutacyjny.test_rekrutacyjny.Zadanie3.DocumentRecipient;

@SpringBootApplication
public class TestRekrutacyjnyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestRekrutacyjnyApplication.class, args);
		DocumentIssuer issuer1 = new DocumentIssuer("Jan Kowalski");
		DocumentRecipient recipient1 = new DocumentRecipient("Adam Kowalski", 10);

		Document document1 = new Document(issuer1, recipient1, new Date(), 1);

		DocumentExporter exporter = new DocumentExporter();
		exporter.WriteToCSV(document1);
	}

}
