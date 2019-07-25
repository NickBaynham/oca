package com.github.nickbaynham.oca;

public class Variables {
    public static void main(String[] args) {
        int x = 1, y = 3;
        int num = 9_9_9;
        int a = Integer.valueOf("2");
        Integer aa = Integer.getInteger("3");

        String chair, table = "metal";
        // chair = chair + table;
    }

    public String convert(Integer value) {
        return value.toString();
    }

    public String convert(Object value) {
        return value.toString();
    }
}
