package com.test_rekrutacyjny.test_rekrutacyjny.Zadanie3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Stream;


public class DocumentExporter {

    void WriteToCSV(String[][] allDocuments) {
        File csvFile = new File("employees.csv");

        try {
            FileWriter fileWriter = new FileWriter(csvFile);
                    for (String[] data : allDocuments) {
            StringBuilder line = new StringBuilder();
            for (int i = 0; i < data.length; i++) {
                line.append("\"");
                line.append(data[i].replaceAll("\"","\"\""));
                line.append("\"");
                if (i != data.length - 1) {
                    line.append(',');
                }
            }
            line.append("\n");
            fileWriter.write(line.toString());
        }
        fileWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}