package com.example.demo;

import org.apache.logging.log4j.util.Strings;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.xmlunit.builder.Input;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class StringServiceTest {

    @Mock
    private StringService stringService;


    @Test
    void revertString() {
        when(stringService.RevertString("test")).thenReturn("tset");
        assertEquals("tset", stringService.RevertString("test"));
    }

    @Test
    void revertStringFalse() {
        when(stringService.RevertString("test")).thenReturn("tset");
        assertNotEquals("tset1", stringService.RevertString("test"));
    }

    @Test
    void capsString() {
        when(stringService.CapsString("test")).thenReturn("TEST");
        assertEquals("TEST", stringService.CapsString("test"));
    }

    @Test
    void countWords() {
        when(stringService.CountWords("test")).thenReturn(1);
        assertEquals(1, stringService.CountWords("test"));
    }

    @Test
    void countWordsNotEquals() {
        when(stringService.CountWords("test")).thenReturn(1);
        assertNotEquals(2, stringService.CountWords("test"));
    }



}