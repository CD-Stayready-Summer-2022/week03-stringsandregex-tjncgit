package com.codedifferentlty.regex.practice.part02.playrewriter;
import com.codedifferentlty.regex.practice.part01.countingwords.RegexWordCounter;
import com.codedifferentlty.regex.practice.part02.readingFiles.ReadingInDataMethod01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.codedifferentlty.regex.practice.part02.readingFiles.ReadingInDataMethod01.readDataIn;
import static com.codedifferentlty.regex.practice.part02.readingFiles.ReadingInDataMethod01.readDataInAndReplace;

public class PlayReWriter {
    public static int characterNameChanger(String characterName, String replace, String input){
        // Given a block of text, and given a charcters name,
        // will alter every occurance of that name.
        // Example: "HORATIO: Friends to this ground."
        // would be changed to "FlavaFlav: Friends to this ground.
        writeDataOut(input, readDataInAndReplace(input,characterName,replace));
        Pattern p = Pattern.compile(replace);
        Matcher m = p.matcher(readDataIn(input));
        int count = 0;
        while(m.find()){
            count++;
        }
        return count;
    }
    public static int locationNameChanger(String locationName, String replace, String input){
        // Given a block of text, and given a charcters name,
        // will alter every occurance of that name.
        // Example: "HORATIO: Friends to this ground."
        // would be changed to "FlavaFlav: Friends to this ground.
        writeDataOut(input, readDataInAndReplace(input,locationName,replace));
        Pattern p = Pattern.compile(replace);
        Matcher m = p.matcher(readDataIn(input));
        int count = 0;
        while(m.find()){
            count++;
        }
        return count;
    }

    public static void writeDataOut(String filePath, String output) {
        try {
            BufferedWriter buffer = new BufferedWriter(new FileWriter(filePath));
            buffer.write(output);
        } catch (IOException e) {
            System.out.println("Error: no file " + e.getMessage() );
        }
    }
}
