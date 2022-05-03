package com.example.playground.softwareDesign202103;

import java.util.ArrayList;
import java.util.List;

public class MultiLineText {
    List<String> lines;

    MultiLineText(List<String> lines) {
        this.lines = lines;
    }

    List<String> withLines(List<String> source) {
        List<String> resultLines = new ArrayList<>();
        for (String line: source) {
            if (!line.isBlank()) resultLines.add(line);
        }
        resultLines.addAll(lines);
        return resultLines;
    }
}
