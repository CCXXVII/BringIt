package com.example.bringit;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class EmailCheck {

    @Test
    public void isValidEmail(){
        assertTrue(Register_Screen.isValidEmail("eneshaha@gmail.com"));
    }
}


