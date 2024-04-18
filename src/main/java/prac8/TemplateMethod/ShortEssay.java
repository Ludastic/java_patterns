package prac8.TemplateMethod;

public class ShortEssay extends EssayTemplate {

    public ShortEssay(String topic) {
        super(topic);
    }

    @Override
    public void writeBody() {
        System.out.println("Adding 2 paras");
    }
}

