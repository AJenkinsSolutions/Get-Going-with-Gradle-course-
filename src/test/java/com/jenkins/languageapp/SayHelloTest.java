package com.jenkins.languageapp;

import org.junit.Test;
import java.io.IOException;


public class SayHelloTest {

    @Test
    public void verifyNoExceptionThrown() throws IOException{
        SayHello.main(new String[]{"en"});
    }
}