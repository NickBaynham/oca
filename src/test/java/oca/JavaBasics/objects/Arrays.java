package oca.JavaBasics.objects;

import org.junit.Test;
import com.github.nickbaynham.oca.Point;
import static java.util.Arrays.*;

public class Arrays {

    @Test
    public void testArrays() {
        byte b;
        byte[] arrayOfBytes;
        byte[][] arrayOfArrayOfBytes;
        String[] points;
    }

    @Test
    public void testPoints() {
        final double MAX_DISTANCE = 100;
        final int NUMBER_OF_POINTS = 100;
        Point[] points = new Point[NUMBER_OF_POINTS];
        for (int i = 0; i < points.length; i++) {
            double x = Math.random() * MAX_DISTANCE;
            double y = Math.random() * MAX_DISTANCE;
            points[i] = new Point(x, y);
        }

        for (Point point : points) {
            System.out.println(point.distanceFromOrigin());
        }
    }

    @Test
    public void arrayInitialization() {
        final int[] ints = new int[10];
        for (int value : ints) {
            if (value == 0)
                System.out.println("Value was initialized to Zero.");
        }

        int firstValue = ints[0];
        int secondValue = ints[1];
        int lastValue = ints[ints.length - 1];

    }

    @Test
    public void iteratingArrays() {
        int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23 };

        int sumOfPrimes = 0;
        for (int i = 0; i < primes.length; i++) {
            sumOfPrimes += primes[i];
        }

        int sumOfPrimes2 = 0;
        for (int prime : primes) {
            sumOfPrimes2 += prime;
        }
    }

    @Test
    public void copyArrays() {
        int[] data = { 1, 2, 3 };
        int[] copy = (int[]) data.clone();  // shallow copy,  references only

        System.arraycopy(data, 1, data, 0, data.length);
    }

    @Test
    public void arrayUtils() {
        int[] data = { 5, 4, 2, 1, 3 };
        sort(data);
        for (int value : data) {
            System.out.println(value);
        }
    }
}
