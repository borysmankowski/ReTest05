package com.company.zadanie1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EquationsTextExtractor implements RegexTextExtractor{
    @Override
    public List<String> extract(String source) {
        List<String> equations = new ArrayList<>();
        Matcher matcher = Pattern.compile("(?<![a-zA-Z])[+-]?(?:0|[1-9]\\d*)(?:\\.\\d+)?\\s+[*/+-]\\s+[+-]?(?:0|[1-9]\\d*)(?:\\.\\d+)?(?![a-zA-Z])").matcher(source);
        while (matcher.find()) {
            equations.add(matcher.group());
        }
        return equations;
    }
}
