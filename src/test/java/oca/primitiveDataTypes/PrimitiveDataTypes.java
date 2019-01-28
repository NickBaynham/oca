package oca.primitiveDataTypes;

import org.junit.Test;

public class PrimitiveDataTypes {

    @Test
    public void floatingPoint() {
        double INFINITY = 1.0/0.0;                 // divide by zero doesn't throw an exception in floating point
        System.out.println(INFINITY);

        double NEGATIVE_INFINITY = -1.0 / 0.0;      // Negative Infinity
        System.out.println(NEGATIVE_INFINITY);

        double NEGATIVE_ZERO = -1.0 / INFINITY;
        System.out.println(NEGATIVE_ZERO);

        double NaN = 0.0 / 0.0;                     // Not a Number
        System.out.println(NaN);                    // Floating Point Arithmetic never throws an exception

        double aDouble = Double.NEGATIVE_INFINITY;
        double doubleTwo = Double.POSITIVE_INFINITY;
        double doubleThree = Double.NaN;
        double doubleFour = Double.SIZE;
        boolean isNaN = Double.isNaN(doubleThree);

        System.out.println(aDouble + doubleTwo);
        System.out.println(doubleThree - doubleFour);
        System.out.println(isNaN);
    }

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
    public void IntegerMinMax() {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);

        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
    }

    @Test
    public void integerDivideByZero() {
        try {
            int aValue = 100;
            int bValue = 0;
            System.out.println(aValue/bValue);
        } catch (ArithmeticException e) {
            System.out.println("An Arithmetic Exception occurred because we tried to divide by zero.");
        }
    }

    @Test
    public void wrapArroundIntegers() {
        byte b1 = 127, b2 = 1;      // Largest byte is 127
        byte b3 = (byte) (b1 + b2); // Wraps to -128
        System.out.println(b3);
    }

    @Test
    public void integers() {
        int hexNumber = 0xffff;
        System.out.println(hexNumber);
        int octalNumber = 0377;
        System.out.println(octalNumber);

        if (octalNumber == 0xff) {
            System.out.println("Yes, they are the same number!");
        }

        int cafeBabe = 0xCAFEBEBE;
        System.out.println("Magic Number:" + cafeBabe);
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
