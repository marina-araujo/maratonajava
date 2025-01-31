package academy.devdojo.maratonajava.Aula07;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // Por padrão, caso não tenha informação:
        // byte, shor, int, long, float e double => 0
        // char => '\u0000' ''
        // boolean => false
        // String => null
        int [] idades = new int[3];
        System.out.println(idades[0]);
        char [] nomes = new char[3];
        System.out.println(nomes[0]);
        String [] nomes2 = new String[3];
        System.out.println(nomes2[0]);
        boolean[] valor = new boolean[3];
        System.out.println(valor[0]);
    }
}
