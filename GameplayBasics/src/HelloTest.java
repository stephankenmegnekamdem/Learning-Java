import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class HelloTest {

    // Runs play() and returns the last line it printed.
    // Capturing System.out lets the test check what was printed.
    private String lastLinePrintedBy(Hello h) {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(buffer));
        try {
            h.play();
        } finally {
            System.setOut(original); // always restore normal printing
        }
        String[] lines = buffer.toString().trim().split("\\R");
        return lines[lines.length - 1];
    }

    // ---- isAlive() ----

    @Test
    void positiveHealthIsAlive() {
        Hello h = new Hello();
        h.setHealth(100);
        assertTrue(h.isAlive());
    }

    @Test
    void zeroHealthIsDead() {
        Hello h = new Hello();
        h.setHealth(0);
        assertFalse(h.isAlive());
    }

    @Test
    void negativeHealthIsDead() {
        Hello h = new Hello();
        h.setHealth(-1);
        assertFalse(h.isAlive());
    }

    // ---- play() when alive ----

    @Test
    void direction8MovesUp() {
        Hello h = new Hello();
        h.setHealth(100);
        h.setDirection(8);
        assertEquals("move up", lastLinePrintedBy(h));
    }

    @Test
    void direction6MovesRight() {
        Hello h = new Hello();
        h.setHealth(100);
        h.setDirection(6);
        assertEquals("move right", lastLinePrintedBy(h));
    }

    @Test
    void direction4MovesLeft() {
        Hello h = new Hello();
        h.setHealth(100);
        h.setDirection(4);
        assertEquals("move left", lastLinePrintedBy(h));
    }

    @Test
    void direction2MovesDown() {
        Hello h = new Hello();
        h.setHealth(100);
        h.setDirection(2);
        assertEquals("move down", lastLinePrintedBy(h));
    }

    @Test
    void unknownDirectionShowsErrorMessage() {
        Hello h = new Hello();
        h.setHealth(100);
        h.setDirection(5);
        assertEquals("You havenot entered anything or wrong input", lastLinePrintedBy(h));
    }

    // ---- play() when dead ----

    @Test
    void deadCharacterPrintsDead() {
        Hello h = new Hello();
        h.setHealth(0);
        assertEquals("Dead", lastLinePrintedBy(h));
    }
}
