package org.example3;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoaderRectangles {
    public static List<Rectangle> readFile(String fName) throws Exception {

        List<Rectangle> rectangle = new ArrayList<>();
        try (Scanner scann = new Scanner(new File(fName))) {
            while (scann.hasNextLine()) {
                String line = scann.nextLine();
                String[] parts = line.split(" ");
                Double x = Double.parseDouble(parts[0]);
                Double y = Double.parseDouble(parts[1]);
                Rectangle r = new Rectangle(x, y);
                rectangle.add(r);
            }
        }
        System.out.println(rectangle);
        return rectangle;
    }
}



