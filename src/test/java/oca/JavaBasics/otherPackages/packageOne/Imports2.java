package oca.JavaBasics.otherPackages.packageOne;

import oca.JavaBasics.otherPackages.packageOne.subPackage.ClassA;


public class Imports2 {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        System.out.println(classOne.toString());

        ClassA classA = new ClassA();
        System.out.println(classA.toString());

        oca.JavaBasics.otherPackages.packageTwo.ClassOne classOne1 = new oca.JavaBasics.otherPackages.packageTwo.ClassOne();
        System.out.println(classOne1.toString());
    }
}
