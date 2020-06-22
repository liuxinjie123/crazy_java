package com.crazy.java004;

import java.util.Arrays;
import java.util.List;

public class ArrayToolsTest {
    public static void main(String[] args) {
        String[] arr1 = {"hello", "jack", "love", "world", "China", "lele"};
        List<String> list = Arrays.asList(arr1);
        int place = Arrays.binarySearch(arr1, "liuxinjie");
        System.out.println("place1=" + place);
        System.out.println("\n");

        place = list.indexOf("liuxinjie");
        System.out.println("place2=" + place);
        System.out.println("\n");

        Arrays.sort(arr1);
        System.out.println("arr1: ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("\n");

        place = Arrays.binarySearch(arr1, "China");
        System.out.println("place3=" + place);
        place = Arrays.binarySearch(arr1, "lele");
        System.out.println("place3=" + place);
        System.out.println("\n");

        place = list.indexOf("lele");
        System.out.println("place4=" + place);
        System.out.println("\n");

        String[] arr2 = null;
        arr2 = Arrays.copyOf(arr1, 10);
        System.out.println("arr2: ");
        for (String str : arr2) {
            System.out.print(str + " ");
        }
        System.out.println("\n");

        boolean isEquals = Arrays.equals(arr1, arr2);
        System.out.println("isEquals: " + isEquals);
        System.out.println("\n");

        Arrays.fill(arr2, "love");
        for (String str : arr2) {
            System.out.print(str + " ");
        }
        System.out.println("\n");

        String arr1Str = Arrays.toString(arr1);
        System.out.println("arr1Str: " + arr1Str);
    }
}
