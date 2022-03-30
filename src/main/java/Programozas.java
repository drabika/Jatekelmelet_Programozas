public class Programozas {

    /**
     * @author Drabik Abigél - I65U8B
     */

    public static void main(String args[])
    {
        new Programozas();
    }
    public Programozas()
    {
        //mátrix létrehoása
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        ProgramozasNyeregPont(matrix);
    }

    public void ProgramozasNyeregPont(int[][] matrix)
    {

        int m = 3, k;

        //változók tárolása a min és max elemekben
        int min = 0, max = 0;
        int[][] index = new int[3][3];
        System.out.print("A mátrix: \n");
        int i, j;

        //Mátrix kiíratása
        //külső ciklus a soroknak
        for (i = 0; i < m; i++) {
        //belső ciklus az oszlopoknak
            for (j = 0; j < m; j++) {
        //kiírja a mátrix elemeit
                System.out.print(matrix[i][j] + " ");
            }
        //Következő sorra ugrik
            System.out.println();
        }

        //Logika mely megtalálja a nyeregpontot a kapott mátrixban
        //Megtalálja a sorban a minimumot

        for (i = 0; i < m; i++) {
            min = matrix[i][0];
            for (j = 0; j < m; j++) {
                if (min >= matrix[i][j]) {
                    min = matrix[i][j];
                    index[0][0] = i;
                    index[0][1] = j;
                }
            }
        //Megtalálja az oszlopban a maximumot

            j = index[0][1];
            max = matrix[0][j];
            for (k = 0; k < m; k++) {
                if (max <= matrix[k][j]) {
                    max = matrix[i][j];
                    index[1][0] = k;
                    index[1][1] = j;
                }
            }

        //Nyeregpont: a sor minimuma és az oszlop maximumából

            if (min == max) {
                if (index[0][0] == index[1][0] && index[0][1] == index[1][1]) {
                    System.out.print("\nA nyeregpont a mátrixban ebben a pozicióban van: (" + index[0][0] + ", " + index[0][1] + ") : " + max + "\n");
                }
            }
        }
    }
}
