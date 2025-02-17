package academy.devdojo.maratonajava.Aula08;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5 meses
        // 31, 28, 31, 30, 31 dias
        int[][] dias = new int[3][3];
        dias[0][0] = 29;
        dias[0][1] = 30;
        dias[0][2] = 31;
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("---------------------------");
        for (int[] x : dias) {
            for (int y : x) {
                System.out.println(y);
            }
        }
    }
}
