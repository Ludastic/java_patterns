package prac3;

import java.util.Map;

public class Main {
    private static MyMap<Integer, Integer> map = new MyMap<>();
    private static MySet<Integer> set = new MySet<>();

    public static void MapTask() {
        System.out.println("Main in map starts");
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 starts");
            for (int i = 1; i < 5; i++) {
                map.put(i, i+1);
            }
            for (var entry:
                 map.entrySet()) {
                System.out.println(entry.getKey()+": "+entry.getValue());
            }
            System.out.println("Thread map 1 ends");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 starts");
            for (int i = 5; i < 11; i++) {
                map.put(i, i+1);
            }
            for (var entry:map.entrySet()) {
                System.out.println(entry.getKey()+": "+entry.getValue());
            }
            System.out.println("Thread map 2 ends");
        });
        thread1.start();

        thread2.start();

        System.out.println("Main in map ends");
    }
    public static void SetTask() {
        System.out.println("Main in SetSemTask starts");
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 starts");
            for (int i = 0; i < 5; i++) {
                set.add(i);
            }
            set.print();
            System.out.println("Thread set 1 ends");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 starts");
            for (int i = 5; i < 11; i++) {
                set.add(i);
            }
            set.print();
            System.out.println("Thread set 2 ends");
        });
        thread1.start();

        thread2.start();

        System.out.println("Main in SetSemTask ends");
    }


    public static void main(String[] args) {
        Main.MapTask();
        Main.SetTask();
    }
}
