package com.epam.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DataWithFoodPackagesFromFile implements DataWithFoodPackages {


    String file = "app/src/main/resources/day1.txt";
    Scanner scanner;

    {
        try {
            scanner = new Scanner(new File(file));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    String patternForSplitDataByEmptyLine = "^\\s*$";

    public DataWithFoodPackagesFromFile() {
        scanner.useDelimiter(Pattern.compile(patternForSplitDataByEmptyLine, Pattern.MULTILINE));
    }

    @Override
    public boolean hasNext() {
        return scanner.hasNext();
    }

    @Override
    public String next() {
        return scanner.next();
    }
}
