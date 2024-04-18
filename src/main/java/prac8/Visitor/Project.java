package prac8.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Project implements ProjectElement{
    List<ProjectElement> projectElementList = new ArrayList<>();
    public Project() {
        projectElementList.add(new ProjectClass());
        projectElementList.add(new Database());
        projectElementList.add(new Test());
    }
    @Override
    public void beWritten(Developer developer) {
        for (ProjectElement element:
             projectElementList) {
            element.beWritten(developer);
        }
    }
}
