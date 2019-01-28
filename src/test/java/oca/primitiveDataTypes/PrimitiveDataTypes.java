package oca.primitiveDataTypes;

import org.junit.Test;

public class PrimitiveDataTypes {


    @Test
    public void test() {
        boolean aBoolean = false;                   // true or false
        char aChar = 'a';                           // 16 bit  \u0000 to \uFFFF
        byte aByte = 127;                           // 8 bit -128 to 127
        short aShort = 32767;                       // 16 bit -32768 to 32767
        int anInt = 2_147_483_647;                  // 32 bit
        long aLong = 9223372036854775807L;          // 64 bit
        float aFloat = 3.4028235E+38f;              // 32 bit
        double aDouble = 1.7976931348623157E+308;   // 64 bit

        System.out.println("Boolean: " + aBoolean);
        System.out.println("Char: " + aChar);
        System.out.println("Short: " + aShort);
        System.out.println("Int: " + anInt);
        System.out.println("Float: " + aFloat);
        System.out.println("Double: " + aDouble);
    }

    @Test
    public void chars() {
        char c = 'A';
        String aString = "this is a String" + c;
        System.out.println(aString);

        char tab = '\t';
        char backspace = '\b';
        char newline = '\n';
        char formFeed = '\f';
        char carriageReturn = '\r';
        char doubleQuote = '\"';
        char singleQuote = '\'';
        char nul = '\000';
        char aleph = '\u05D0';
        char slash = '\\';

        String heading1 = "Name";
        String heading2 = "Street";
        String heading3 = "Zip";
        String headings = heading1 + tab + heading2 + tab + heading3;
        System.out.println(headings);

        if (Character.isAlphabetic('z')) {
            System.out.println("Alpha");
        }

        if (Character.isDigit('1')) {
            System.out.println("Is a digit");
        }

        if (Character.isAlphabetic('e')) {
            System.out.println("Alphabetic");
        }

        if (Character.isJavaIdentifierPart('b')) {
            System.out.println("Java Identifier Part");
        }

        if (Character.isLetter('P')) {
            System.out.println("Letter");
        }

        if (Character.isLowerCase('p')) {
            System.out.println("Lower Case");
        }

        if (Character.isWhitespace('\t')) {
            System.out.println("White Space");
        }
    }
}
