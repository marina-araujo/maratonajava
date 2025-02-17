package academy.devdojo.maratonajava.Aula08;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[] {1, 2, 3, 4};
        arrayInt[2] = new int[] {21, 22, 25, 26, 28, 30};
        for (int[] arrayBase: arrayInt) {
            System.out.println("\n-----");
            for (int num: arrayBase) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n\n");
        int[][] arrayInt2 = {{0,0}, {1,2,3}, {5,6,7,8}}; //cria um array multidimensional com 3 espaços no primeiro [] e 2, 3 e 4 espaços respectivamente em cada [] dentro de cada array
        for (int[] arrayBase: arrayInt2) {
            System.out.println("\n-----");
            for (int num: arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
