package prac8.Visitor;

public class SeniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("write good code");
    }

    @Override
    public void create(Database database) {
        System.out.println("making sustainable db");
    }

    @Override
    public void create(Test test) {
        System.out.println("making reliable tests");
    }
}
