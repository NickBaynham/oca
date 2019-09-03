package com.github.nickbaynham.oca;

public class FlyingBirds {
}

abstract class SeaBird {
    public abstract void fly(int height);
}

abstract class Albatross extends SeaBird {
    private Long fly(){return null;};

}

abstract class Scotch extends Albatross {
    protected Long fly(){return null;};
}
