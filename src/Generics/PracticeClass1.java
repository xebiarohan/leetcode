package Generics;

import java.util.List;

public class PracticeClass1<U> {

    public U value;
    public <T> void print(T value) {
        System.out.println(value);
    }

    public <T extends Comparable<T>> void compare(T t1, T t2) {
        int i = t1.compareTo(t2);
        System.out.println(i);
    }

    public void addInList(List<?> list) {
        for(Object o: list) {
            System.out.println(o);
        }
    }


    public void addValue(List<? extends Integer> list) {
        
    }
    public static void main(String[] args) {
        PracticeClass1<String> object = new PracticeClass1<>();
        object.value = "Pass";
        object.print(object.value);
        object.print(1);

        Person p1 = new Person("Rohan");
        Person p2 = new Person("Mohan");

        object.compare(p1, p2);

        List<String> abc = List.of("abc", "xyz");
        object.addInList(abc);
    }
}
