package com.company.zadanie3;

import java.io.File;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;

public class FileCreationDate {

    public static Map<String, Integer> getFileCreationDates(String directory) {
        Map<String, Integer> creationDates = new LinkedHashMap<>();
        File pliki = new File(directory);
        File[] files = pliki.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                creationDates.putAll(getFileCreationDates(file.getAbsolutePath()));
            } else if (file.getName().endsWith(".java")) {
                Calendar cal = Calendar.getInstance();
                cal.setTimeInMillis(file.lastModified());
                int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
                String dayOfWeekString = getDayOfWeekString(dayOfWeek);
                if (creationDates.containsKey(dayOfWeekString)) {
                    creationDates.put(dayOfWeekString, creationDates.get(dayOfWeekString) + 1);
                } else {
                    creationDates.put(dayOfWeekString, 1);
                }
            }
        }
        return creationDates;
    }

    private static String getDayOfWeekString(int dayOfWeek) {
        switch (dayOfWeek) {
            case Calendar.MONDAY:
                return "Poniedzia³ek";
            case Calendar.TUESDAY:
                return "Wtorek";
            case Calendar.WEDNESDAY:
                return "Œroda";
            case Calendar.THURSDAY:
                return "Czwartek";
            case Calendar.FRIDAY:
                return "Pi¹tek";
            case Calendar.SATURDAY:
                return "Sobota";
            case Calendar.SUNDAY:
                return "Niedziela";
            default:
                return "";
        }
    }
}
