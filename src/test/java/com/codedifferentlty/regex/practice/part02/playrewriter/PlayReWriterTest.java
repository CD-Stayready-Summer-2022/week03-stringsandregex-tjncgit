package com.codedifferentlty.regex.practice.part02.playrewriter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codedifferentlty.regex.practice.part02.playrewriter.PlayReWriter.characterNameChanger;
import static com.codedifferentlty.regex.practice.part02.playrewriter.PlayReWriter.locationNameChanger;
import static com.codedifferentlty.regex.practice.part02.readingFiles.ReadingInDataMethod01.readDataInAndReplace;

public class PlayReWriterTest {


    @Test
    public void characterNameChangerTest() {
        int expected = 30;
        String name1 = "BERNARDO|Bernardo";
        String name2 = "Gucci Mane";
        int actual = characterNameChanger(name1, name2,"/Users/tjnc/dev/labs/stringsAndRegex/week03-stringsandregex-tjncgit/files/Hamlet.txt");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void locationNameChangerTest() {
        int expected = 18;
        String location1 = "Denmark";
        String location2 = "Transylvania";
        int actual = locationNameChanger(location1, location2,"/Users/tjnc/dev/labs/stringsAndRegex/week03-stringsandregex-tjncgit/files/Hamlet.txt");
        Assertions.assertEquals(expected, actual);
    }
}
