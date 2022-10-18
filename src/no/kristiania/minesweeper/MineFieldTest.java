package no.kristiania.minesweeper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MineFieldTest {
    @Test
    void itShowsEmptyMinefield() {
        assertArrayEquals(new String[] { "000", "000" }, displayMineField(new String[] { "...", "..." }));
    }
    @Test
    void isShowsCorrectNumberOfRows() {
        assertArrayEquals(
          new String[] { "000", "000", "000" },
          displayMineField(new String[] { "...", "...", "..." })
        );

    }@Test
    void isShowsCorrectNumberOfColumns() {
        assertArrayEquals(
          new String[] { "0000" },
          displayMineField(new String[] { "...." })
        );
    }

    private String[] displayMineField(String[] input) {
        //We do the simplest thing that could possibly work! For å få testen til å passere...
        String[] result = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = "000";
        }
        return result;
    }
}
