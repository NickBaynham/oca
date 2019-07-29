package com.github.nickbaynham.oca.arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(10);  // capacity secified
        ArrayList list3 = new ArrayList(list2);           // created from an existing (copies size and contents)

        ArrayList<String> list4 = new ArrayList<String>();
        ArrayList<String> list5 = new ArrayList<>();    // type is inferred for the object from the reference definition

        List<String> list6 = new ArrayList<>();
        list6.add("Hawk");
        list1.add("One");
        list2.add("Nothing");
        list3.add(null);            // Yes an ArrayList can contain nulls
        list1.add(Boolean.TRUE);
        System.out.println(list1);
        list1.add(2);  // Auto Boxing
        list2.add(null);
        list2.add(true);

        List<String> birds = new ArrayList<>();
        if (birds.isEmpty()) {
            System.out.println("We have no birds.");
        }
        birds.add("hawk");
        birds.add(1, "robin");
        birds.add(0, "blue jay");
        birds.add(1, "cardinal");
        String[] array = birds.toArray(new String[0]);      // convert a List to an Array
        System.out.println(Arrays.toString(array));
        List<String> birdsFromArray = Arrays.asList(array);
        System.out.println(birdsFromArray);
        birds.set(0, "kingfisher");
        System.out.println("We have " + birds.size() + " birds.");
        System.out.println(birds.isEmpty());
        System.out.println(birds);
        System.out.println(birds.remove("cardinal"));
        System.out.println(birds);
        System.out.println(birds.remove("cardinal"));
        System.out.println(birds.remove("hawk"));
        System.out.println(birds);
        System.out.println(birds.remove(0));
        System.out.println(birds);

        try {
            System.out.println(birds.remove(1));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("We got an exception as expected: " + e.getMessage());
        }
        birds.add("pelican");
        birds.add("seagull");
        if (birds.contains("seagull")) System.out.println("Gulls are present");
        System.out.println(birds);
        birds.clear();
        System.out.println(birds);
        System.out.println(birds.size());
        System.out.println(birds.isEmpty());

        // cool trick

        List<String> testers = Arrays.asList("Sam", "Marco", "Chris");
        System.out.println(testers);
        Collections.sort(testers);
        System.out.println(testers);
    }
}
