package com.example.demo.Controller;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class controllerTest {

    @Test
    void sda(){
        controller controller = new controller();
        assertThat(controller.add(1,2)).isEqualTo(3);
    }
}