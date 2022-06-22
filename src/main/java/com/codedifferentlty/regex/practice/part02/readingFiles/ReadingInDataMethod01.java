package com.codedifferentlty.regex.practice.part02.readingFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ReadingInDataMethod01 {
    public static String readDataInAndReplace(String pathToFile, String regex, String replace) {
       String fileData = readDataIn(pathToFile);
       Pattern p = Pattern.compile(regex);
       Matcher m = p.matcher(fileData);
       return m.replaceAll(replace);
    }

    public static String readDataIn(String filePath){
        StringWriter builder = new StringWriter();
        try (BufferedReader buffer = new BufferedReader(
                new FileReader(filePath))) {
            String str;
            while ((str = buffer.readLine()) != null) {

                builder.append(str).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Error: no file "+e.getMessage());
        }
        return builder.toString();
    }
}
