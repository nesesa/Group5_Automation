package com.group5.step_defs;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {


        @Before

        public void setup() {
            System.out.println("Before scenario is running");


        }

        @After
        public void tearDown () {

            System.out.println("After scenario is running");

        }
    }



