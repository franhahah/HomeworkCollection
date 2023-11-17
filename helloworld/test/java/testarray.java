import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class main {
    @Test
    void humanReadableSizeTest() {
        assertEquals("Small", Pizza.humanReadableSize((byte) 0));
        assertEquals("Medium", Pizza.humanReadableSize((byte) 1));
        assertEquals("Large", Pizza.humanReadableSize((byte) 2));

        // Out of bounds issues
        assertEquals("Small", Pizza.humanReadableSize((byte) -3));
        assertEquals("Large", Pizza.humanReadableSize((byte) 4));




    }
}

