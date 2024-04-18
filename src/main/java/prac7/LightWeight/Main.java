package prac7.LightWeight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FigureFactory figureFactory = new FigureFactory();
        List<Figure> list = new ArrayList<>();
        list.add(figureFactory.getFigure("triangle"));
        list.add(figureFactory.getFigure("circle"));
        for (Figure figure:
             list) {
            figure.draw();
        }
    }
}
