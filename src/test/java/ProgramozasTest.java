import org.junit.jupiter.api.Test;

class ProgramozasTest {
    @Test
    void testConstructor() {
        new Programozas();
    }

    @Test
    void testProgramozasNyeregPont() {

        (new Programozas())
            .ProgramozasNyeregPont(new int[][]{new int[]{1, 2, 3, 4}, new int[]{8, 3, 9, 3}, new int[]{3, 3, 3, 3}});
    }

    @Test
    void testProgramozasNyeregPont2() {


        (new Programozas())
          .ProgramozasNyeregPont(new int[][]{new int[]{3, 4, 5, 6}, new int[]{1, 2, 3, 7}, new int[]{2, 4, 5, 3}});

    }

    @Test
    void testProgramozasNyeregPont3() {


        (new Programozas())
                .ProgramozasNyeregPont(new int[][]{new int[]{3, 3, 3, 3}, new int[]{3, 3, 3, 3}, new int[]{3, 3, 3, 3}});
    }

    @Test
    void testProgramozasNyeregPont4() {


        (new Programozas())
                .ProgramozasNyeregPont(new int[][]{new int[]{1, 3, 3, 3}, new int[]{3, 3, 3, 3}, new int[]{3, 3, 3, 3}});
    }

    @Test
    void testProgramozasNyeregPont5() {


        (new Programozas())
                .ProgramozasNyeregPont(new int[][]{new int[]{3, 3, 3, 3}, new int[]{3, 3, 1, 3}, new int[]{3, 3, 3, 3}});
    }
}

