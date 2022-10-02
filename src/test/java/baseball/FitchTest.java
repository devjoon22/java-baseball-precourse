package baseball;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FitchTest {
    @Test
    void fitch_hasListSizeThree() {
        Fitch fitch = new Fitch();

        assertEquals(fitch.getFitches().size(), 3);
    }
}