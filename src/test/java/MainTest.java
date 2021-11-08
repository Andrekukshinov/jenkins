import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testIncrement() {
        Main main = new Main();

        int result = main.increment(6);

        Assertions.assertEquals(7, result);
    }

}