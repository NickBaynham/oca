package com.github.nickbaynham.oca;

public class TestShapes {
    public static void main(String[] args) {
        PlayerPiece shape = new PlayerPiece();
        doShapes(shape);
        shape.movePiece();

        TilePiece tile = new TilePiece();
        doShapes(tile);
        tile.getAdjacent();
    }

    private static void doShapes(GameShape gameShape) {
        gameShape.displayShape();
    }
}

class GameShape {
    void displayShape() {
        System.out.println("displaying shape");
    }
}

class PlayerPiece extends GameShape implements animatable {
    void movePiece() {
        System.out.println("moving game piece");
    }

    public void animate() {
        System.out.println("animating");
    }
}

class TilePiece extends GameShape {
    void getAdjacent() {
        System.out.println("getting adjacent tiles");
    }
}

interface animatable {
    void animate();
}