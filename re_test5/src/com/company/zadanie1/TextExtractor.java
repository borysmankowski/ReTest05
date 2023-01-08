package com.company.zadanie1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TextExtractor {
    public Map<String, List<String>> extractTexts(String source, Map<String, RegexTextExtractor> extractors) {
        Map<String, List<String>> extractedTexts = new HashMap<>();
        for (Map.Entry<String, RegexTextExtractor> entry : extractors.entrySet()) {
            extractedTexts.put(entry.getKey(), entry.getValue().extract(source));
        }
        return extractedTexts;
    }
}
