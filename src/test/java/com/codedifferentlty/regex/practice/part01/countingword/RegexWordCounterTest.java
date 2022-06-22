package com.codedifferentlty.regex.practice.part01.countingword;

import com.codedifferentlty.regex.practice.part01.countingwords.RegexWordCounter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

public class RegexWordCounterTest {
    private RegexWordCounter wordCounter;
    private String regex;
    private String input;
    @BeforeEach
    public void setUp() {
        wordCounter = new RegexWordCounter();
    }
    @Test
    @DisplayName("find One word")
    public void findOneWord() {
        Integer expected  = 1;
        regex = "\\D.t";
        input = "aat";
        Integer actual = wordCounter.countWordOccurrences(regex, input);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    @DisplayName("find two words")
    public void findTwoWords() {
        Integer expected  = 2;
        regex = "\\D.t";
        input = "bat dfgdfgfd cat";
        Integer actual = wordCounter.countWordOccurrences(regex, input);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    @DisplayName("find a word starting with a prefix")
    public void findWordStartingWithPrefix() {
        Integer expected  = 3;
        regex = "\\bre+";
        input = "revere repeat recceed rapper";
        Integer actual = wordCounter.countWordOccurrences(regex, input);
        Assertions.assertEquals(expected,actual);
    }

}
