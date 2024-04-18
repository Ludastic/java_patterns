package prac8.Visitor;

public class Main {
    public static void main(String[] args) {
        Project project = new Project();
        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();
        System.out.println("Junior in act");
        project.beWritten(junior);
        System.out.println("Senior in act");
        project.beWritten(senior);
    }
}
