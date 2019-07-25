package com.github.nickbaynham.oca;

public class Assignments {
    public static void main(String[] args) {
    int i = 37;                         // no brainer, typical assignment
    short s = 37;                       // valid because compiler will automatically cast the int literal to short
    short t = (short) (s + 37);         // expressions are always evaluated to int, so that assignment of an expression requires a cast
    short u = ++s;                      // doesn't apply to increment operator
    short v = (short) (s + 1);

    float f = 1.246f;                   // floating point literals are double precision by default
    float g = (float) 1.246;

    byte b = 37;
    b += 5;                             // compound assignment operators have an implicit cast
    }
}
