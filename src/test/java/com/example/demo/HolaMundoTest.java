package com.example.demo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HolaMundoTest {

    @Test
    public void testGreetings(){
        HolaMundo holaMundo = new HolaMundo();

        Assert.assertEquals("Hola", holaMundo.greetings() );
    }

}