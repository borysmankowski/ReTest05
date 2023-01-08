package com.company.zadanie1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EquationsTextExtractor implements RegexTextExtractor{
    @Override
    public List<String> extract(String source) {
        List<String> equations = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\d+(\\.\\d+)?\\s*[+\\-*/]\\s*\\d+(\\.\\d+)?").matcher(source);
        while (matcher.find()) {
            equations.add(matcher.group());
        }
        return equations;
    }
}
