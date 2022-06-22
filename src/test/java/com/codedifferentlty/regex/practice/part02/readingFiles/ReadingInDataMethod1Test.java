package com.codedifferentlty.regex.practice.part02.readingFiles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codedifferentlty.regex.practice.part02.readingFiles.ReadingInDataMethod01.readDataInAndReplace;


public class ReadingInDataMethod1Test {
    @Test
    public void readInDataAndReplaceTest() {
        String expected = "0000\n";
        String actual = readDataInAndReplace("src/main/java/com/codedifferentlty/regex/practice/part02/readingFiles/sample.txt", "\\w", "0" );
        Assertions.assertEquals(expected, actual);
    }
}
