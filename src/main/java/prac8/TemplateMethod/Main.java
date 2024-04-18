package prac8.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        EssayTemplate shortEssay = new ShortEssay("Programming - An Art");
        shortEssay.writeEssay();
    }
}
