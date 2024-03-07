package com.example.csd_214_lab3_bibek_lamichhane;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloApplicationTest {

    @Test
    void totalsalary() {

        HelloApplication a = new HelloApplication();

        assertEquals(a.totalsalary(3000),36000);
    }
}