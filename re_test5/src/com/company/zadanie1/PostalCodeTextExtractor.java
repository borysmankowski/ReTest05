package com.company.zadanie1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostalCodeTextExtractor implements RegexTextExtractor{


    @Override
    public List<String> extract(String source) {
        List<String> postalCodes = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\d{2}-\\d{3}").matcher(source);
        while (matcher.find()) {
            postalCodes.add(matcher.group());
        }
        return postalCodes;
    }
}
