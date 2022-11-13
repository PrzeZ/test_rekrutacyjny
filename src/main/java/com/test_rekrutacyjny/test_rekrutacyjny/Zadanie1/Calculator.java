package com.test_rekrutacyjny.test_rekrutacyjny.Zadanie1;

import org.apache.commons.lang3.StringUtils;

public class Calculator {
    private final String separators = ".,;+-=*";
    
    public Calculator() {
    }

    public double Calculate(String text) {
        double result = 0;
        String character = text.substring(text.length() - 1);

        String[] parts = StringUtils.split(text, separators);  
        
        try {
            if (character.equals("+")) {
                result = Double.parseDouble(parts[0]);
    
                for (int i = 1 ; i <parts.length; i++ ) {
                    result += Double.parseDouble(parts[i]);
                }
            }
            else if (character.equals("-")) {
                result = Double.parseDouble(parts[0]);
    
                for (int i = 1 ; i <parts.length; i++ ) {
                    result -= Double.parseDouble(parts[i]);
                }
            }
            else if (character.equals("*")) {
                result = Double.parseDouble(parts[0]);
    
                for (int i = 1 ; i <parts.length; i++ ) {
                    result *= Double.parseDouble(parts[i]);
                }
            }
            else if (character.equals("/")) {
                result = Double.parseDouble(parts[0]);
    
                for (int i = 1 ; i <parts.length; i++ ) {
                    result /= Double.parseDouble(parts[i]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(result);
        return result;
    }
}
