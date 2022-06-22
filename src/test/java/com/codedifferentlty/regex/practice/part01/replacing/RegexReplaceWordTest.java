package com.codedifferentlty.regex.practice.part01.replacing;

import com.codedifferentlty.regex.practice.part01.countingwords.RegexWordCounter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RegexReplaceWordTest {
    private RegexReplaceWord replaceWord;
    private String regex;
    private String input;
    @BeforeEach
    public void setUp() {
        replaceWord = new RegexReplaceWord();
    }
    @Test
    @DisplayName("replaceOne word")
    public void replaceOneWord() {
        String expected  = "----";
        regex = "\\D.t";
        input = "aat";
        String replace = "----";
        String actual = replaceWord.replaceFirst(regex, replace, input);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    @DisplayName("replace two words")
    public void findTwoWords() {
        String expected  = "---- blam ----";
        regex = "\\D.t";
        input = "bat blam cat";
        String replace = "----";
        String actual = replaceWord.replaceAll(regex, replace, input);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    @DisplayName("replace a word starting with a prefix")
    public void replaceWordStartingWithPrefix() {
        String expected  = "---- rapper ----";
        regex = "\\bre+\\w{1,}";
        input = "repeat rapper receed";
        String replace = "----";
        String actual = replaceWord.replaceAll(regex, replace, input);
        Assertions.assertEquals(expected,actual);
    }
}
