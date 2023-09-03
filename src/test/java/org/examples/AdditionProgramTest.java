package org.examples;

import org.example.playground.AdditionProgram;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class AdditionProgramTest {
    @Test
    public void  testSum(){
        int a=10;
        int b=20;
        AdditionProgram additionProgram=new AdditionProgram();
        assertEquals(additionProgram.sum(a,b),30);
    }

    @Test
    public void  test2(){
        int a=10;
        int b=20;
        AdditionProgram additionProgram=new AdditionProgram();
        assertEquals(additionProgram.sum(a,b),30);
      }
}
