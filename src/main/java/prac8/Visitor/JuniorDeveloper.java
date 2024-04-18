package prac8.Visitor;

public class JuniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("writing poor class");
    }

    @Override
    public void create(Database database) {
        System.out.println("drop db");
    }

    @Override
    public void create(Test test) {
        System.out.println("create bad test");
    }
}
