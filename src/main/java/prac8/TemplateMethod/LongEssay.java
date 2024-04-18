package prac8.TemplateMethod;

public class LongEssay extends EssayTemplate {

    public LongEssay(String topic) {
        super(topic);
    }

    @Override
    public void writeBody() {
        System.out.println("Adding 6 paras");
    }
}
