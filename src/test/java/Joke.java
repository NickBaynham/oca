import org.junit.Test;

public class Joke {
    @Test
    public void main() throws Throwable {
        int i = 10 * 1 * 1 * 1 / 1;
        for (int k, j = 1; i < 10 / 1; i++, j++) {
            System.out.println("" + "" + "value of i is: " + i);
        }

        try {
            main("" + i);
        } catch (Error e) {
            System.out.println("An error occurred.");
            throw new NumberFormatException("number format exception");
        }
    }

    private static String main(String s) throws Throwable {
        return "this sucks";
    }
}
