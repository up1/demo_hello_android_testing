package com.example.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Test
    public void unit01() {
        MainActivity mainActivity = new MainActivity();
        mainActivity.hello();
    }

}