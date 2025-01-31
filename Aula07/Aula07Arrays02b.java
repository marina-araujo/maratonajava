package academy.devdojo.maratonajava.Aula07;

public class Aula07Arrays02b {
    public static void main(String[] args) {
        String[] nomes = new String[4];
        nomes[0] = "Harry";
        nomes[1] = "Rony";
        nomes[2] = "Hermione";
        nomes[3] = "Luna";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        nomes = new String[4];
        System.out.println(nomes[0]); //ele cria um novo espaço em memória e apaga o anterior.
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
