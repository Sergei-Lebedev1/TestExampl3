import org.example3.LoaderRectangles;
import org.example3.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class RectangleLoaderTest {
    @Test
    void loadOk1() throws Exception {
        String s = "src/test/resources/ok2.txt";
        List<Rectangle> actual = LoaderRectangles.readFile(s);
        List<Rectangle> expected = new ArrayList<>();
        expected.add(new Rectangle(4,3));
        Assertions.assertIterableEquals(expected,actual);
    }
    @Test
    void loadOk2() throws Exception {
        String s = "src/test/resources/ok1.txt";
        List<Rectangle> actual = LoaderRectangles.readFile(s);
        List<Rectangle> expected = new ArrayList<>();
        expected.add(new Rectangle(4,3));
        expected.add(new Rectangle(6,9));
        expected.add(new Rectangle(17,18));
        expected.add(new Rectangle(25,25));
        Assertions.assertIterableEquals(expected,actual);
    }
}
