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

    }
    @Test
    void isShowsCorrectNumberOfColumns() {
        assertArrayEquals(
          new String[] { "0000" },
          displayMineField(new String[] { "...." })
        );
    }
    @Test
    void itShowsMines() {
        assertArrayEquals(
          new String[] { "***" },
          displayMineField(new String[] { "***" })
        );
    }

    @Test
    void itShowsHintRightOfMine() {
        assertArrayEquals(
                new String[] { "*10" },
                displayMineField(new String[] { "*.." })
        );
    }

    private String[] displayMineField(String[] input) {
        return new MineField(input).displayMineField();
    }
}
