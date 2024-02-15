package org.prac1;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //System.out.println("sdasda");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Predicate<String> pr = (String string) -> {
            Pattern pattern = Pattern.compile("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
            Matcher matcher = pattern.matcher(string);
            return matcher.matches();
        };

        System.out.println(pr.test(str));
    }
}