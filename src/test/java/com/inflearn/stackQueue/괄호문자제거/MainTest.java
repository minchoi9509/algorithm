package com.inflearn.stackQueue.괄호문자제거;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        Assertions.assertEquals("EFLM", main.solution("(A(BC)D)EF(G(H)(IJ)K)LM(N)"));
    }

}