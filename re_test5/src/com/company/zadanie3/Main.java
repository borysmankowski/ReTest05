package com.company.zadanie3;

import java.util.Map;

import static com.company.zadanie3.FileCreationDate.getFileCreationDates;

public class Main {
    public static void main(String[] args) {


        String directory = "C:\\Users\\msi\\IdeaProjects";
        Map<String, Integer> creationDates = getFileCreationDates(directory);
        for (Map.Entry<String, Integer> entry : creationDates.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " files");

        }
    }
}

