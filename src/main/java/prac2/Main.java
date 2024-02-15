package prac2;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    static String stringGenerator() {
        Random rn = new Random();
        String str = "";
        for (int i=0; i<rn.nextInt(10)+1; i++) {
            str+= (char)rn.nextInt(65, 122);
        }
        return str;
    }
    static List<Human> generator() {
        Random rn = new Random();
        List<Human> family = new ArrayList<>();
        for (int i=0; i<rn.nextInt(20)+1; i++) {
            Integer ag = rn.nextInt(23)+1;
            String fN = stringGenerator();
            String lN = stringGenerator();
            LocalDate dt = LocalDate.of(rn.nextInt(1970, 2020), rn.nextInt(1, 12), rn.nextInt(1, 31));
            Integer w = rn.nextInt(40, 120);
            Human buff = new Human(ag, fN, lN, dt, w);
            family.add(buff);
        }
        return family;
    }
    public static void main(String[] args) {
        List<Human> arr = new ArrayList<>();
        arr = generator();
        for (Human hm:
             arr) {
            System.out.println(hm.toString());
        }
        Stream<Human> stream = arr.stream();
        OptionalInt prod = stream.sorted((hm1, hm2) -> Character.compare(hm1.firstName.charAt(1), hm2.firstName.charAt(1)))
                .filter(hm -> {return hm.weight>60;})
                .sorted((hm1, hm2) -> Integer.compare(hm1.age, hm2.age))
                .mapToInt(hm -> hm.age).reduce((hm1, hm2) -> hm1 * hm2);
        System.out.println(prod.getAsInt());
    }
}
