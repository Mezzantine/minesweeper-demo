package no.kristiania.minesweeper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MineFieldTest {
    @Test
    void itShowsCorrectNumberOfRows() {
        assertArrayEquals(
          new String[] { "000", "000", "000" },
          displayMineField(new String[] { "...", "...", "..." })
        );

    }

    @Test
    void itShowsCorrectNumberOfColumns() {
        assertArrayEquals(
          new String[] { "0000" },
          displayMineField(new String[] { "...." })
        );
    }

    @Test
    void itShowsHintAroundMine() {
        assertArrayEquals(
                new String[] { "111", "1*1", "111" },
                displayMineField(new String[] { "...", ".*.", "..." })
        );
    }

    @Test
    void itCountsMinesAroundCell() {
        assertArrayEquals(
                new String[] { "***", "*8*", "***" },
                displayMineField(new String[] { "***", "*.*", "***" })
        );
    }

    private String[] displayMineField(String[] input) {
        return new MineField(input).displayMineField();
    }
}
