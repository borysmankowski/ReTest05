package com.company.zadanie1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeselTextExtractor implements RegexTextExtractor{
    @Override
    public List<String> extract(String source) {
        List<String> peselNumbers = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\d{11}").matcher(source);
        while (matcher.find()) {
            peselNumbers.add(matcher.group());
        }
        return peselNumbers;
    }
}
