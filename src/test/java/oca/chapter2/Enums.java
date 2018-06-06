package oca.chapter2;

enum CoffeeSize {
    BIG(8), HUGE(10), OVERWELMING(16);
    CoffeeSize(int ounces) {
        this.ounces = ounces;
    }
    private int ounces;
    public int getOunces() {
        return ounces;
    }
}

public class Enums {
    private CoffeeSize size;
    public static void main(String args[]) {
        Enums drink = new Enums();
        CoffeeSize big = CoffeeSize.BIG;
        drink.size = CoffeeSize.BIG;
        drink.size = CoffeeSize.HUGE;
        drink.size = CoffeeSize.OVERWELMING;
        System.out.println(CoffeeSize.BIG.getOunces());
        System.out.println(CoffeeSize.HUGE.getOunces());
        System.out.println(CoffeeSize.OVERWELMING.getOunces());
    }
}
