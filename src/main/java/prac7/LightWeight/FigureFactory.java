package prac7.LightWeight;

import java.util.HashMap;
import java.util.Map;

public class FigureFactory {
    private static final Map<String, Figure> factory = new HashMap<>();
    Figure getFigure(String figure) {
        Figure figure1 =factory.get(figure);
        if(figure1==null) {
            switch (figure){
                case "triangle":
                    System.out.println("Create a triangle");
                    figure1 = new Triangle();
                    break;
                case "circle":
                    System.out.println("Create cirle");
                    figure1 = new Circle();
            }
            factory.put(figure, figure1);
        }
        return figure1;
    }
}
