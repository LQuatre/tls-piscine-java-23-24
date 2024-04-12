import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SortArgsTest {

    @Test
    public void ArrayWithDuplication() {
        String[] args = {"2", "1", "4", "3", "2"};
        SortArgs.sort(args);
        assertEquals("1 2 2 3 4 ", outContent.toString());
    }

    @Test
    public void SimpleArray() {
        String[] args = {"4", "2", "1", "3"};
        SortArgs.sort(args);
        assertEquals("1 2 3 4 ", outContent.toString());
    }

    @Test
    public void EmptyArray() {
        String[] args = {};
        SortArgs.sort(args);
        assertEquals("", outContent.toString());
    }
}