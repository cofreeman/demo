package com.example.demo.Controller;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class controllerTest {

    @Test
    void sda(){
        String s = "123";
        assertThat(s).isNotNull();

    }
}