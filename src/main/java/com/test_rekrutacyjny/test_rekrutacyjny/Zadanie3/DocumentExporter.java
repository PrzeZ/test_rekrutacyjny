package com.test_rekrutacyjny.test_rekrutacyjny.Zadanie3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class DocumentExporter {

    public void WriteToCSV(Document document) {
        String line = String.join("," , String.valueOf(document.getDocumentID()), document.getIssuer().getName(),
         document.getRecipient().getName(), document.getDateOfIssue().toString());

        try {
            BufferedWriter writer = Files.newBufferedWriter(Paths.get("documents.csv"));

            writer.write("ID,Issuer,Recipient,Date");
            writer.newLine();
            writer.write(line);
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}