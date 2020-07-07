package com.crazy.java006;

import java.util.*;

public class TestFinalReference {
    public static void main(String[] args) {
        final Integer[] arr = {5, 9, 1, 3, 222};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        arr[4] = 123;
        System.out.println(Arrays.toString(arr));

        System.out.printf("\n");

        List<Integer> intList = Arrays.asList(arr);
        System.out.println(intList);
        intList.sort(Integer::compareTo);
        System.out.println(intList);
        Collections.sort(intList, Collections.reverseOrder());
        System.out.println(intList);
        Collections.sort(intList);
        System.out.println(intList);

        System.out.println("\n");

        final Person person = new Person(33);
        System.out.println(person);
        person.setAge(20);
        System.out.println(person);

        final Person person2 = new Person(1);
        System.out.println(person2);

        List<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.add(person2);
        System.out.println(personList);

        personList.sort(Comparator.comparingInt(Person::getAge));
        System.out.println(personList);

        personList.sort(Comparator.comparingInt(Person::getAge).reversed());
        System.out.println(personList);

        Collections.sort(personList, Comparator.comparingInt(Person::getAge));
        System.out.println(personList);

        Collections.sort(personList, Comparator.comparingInt(Person::getAge).reversed());
        System.out.println(personList);

    }
}
