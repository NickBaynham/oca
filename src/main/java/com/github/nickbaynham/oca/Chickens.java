package com.github.nickbaynham.oca;

import java.util.ArrayList;
import java.util.List;

public class Chickens {
    public static void main(String[] args) {
        HenHouse henHouse = new Coop();
        Chicken chicken = henHouse.getChickens().get(0);
        for (int i = 0; i < henHouse.getChickens().size(); chicken = henHouse.getChickens().get(i++)) {
            System.out.println("Cluck");
        }
    }
}


interface HenHouse {
    public List<Chicken> getChickens();
};

class Coop implements HenHouse {

    @Override
    public List<Chicken> getChickens() {
        List<Chicken> result = new ArrayList<>();
        result.add(new Chicken());
        result.add(new Chicken());
        result.add(new Chicken());
        return result;
    }
}
