package com.company.zadanie1;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        String source = " ";
        try {
            source = new String(Files.readAllBytes(Paths.get("src/com/company/zadanie1/plik testowy.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        PostalCodeTextExtractor postalCodeExtractor = new PostalCodeTextExtractor();
        List<String> postalCodes = postalCodeExtractor.extract(source);

        PeselTextExtractor peselExtractor = new PeselTextExtractor();
        List<String> pesels = peselExtractor.extract(source);

        EquationsTextExtractor equationsExtractor = new EquationsTextExtractor();
        List<String> equations = equationsExtractor.extract(source);

        System.out.println("Postal Code Text Extractor");
        System.out.println(postalCodes);
        System.out.println();
        System.out.println("Pesel Code Text Extractor");
        System.out.println(pesels);
        System.out.println();
        System.out.println("Equations Text Extractor");
        System.out.println(equations);
    }
}

