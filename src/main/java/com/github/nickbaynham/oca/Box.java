package com.github.nickbaynham.oca;

// getters and setters
public class Box {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static void main(String[] args) {
        Box box = new Box();
        box.setSize(35);
        System.out.println("Size of box is: " + box.getSize());
    }
}
