public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 37;
        long numeroGrande= 100000;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F; //colocar o f ou F no final do float quando usar decimais
        byte idadeByte = 12;
        short idadeShort = 20;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 68;
        String nome = "Marina Araújo";
        var nome2 = "Marina";

        System.out.println("a idade é "+idade+" anos.");
        System.out.println(verdadeiro);
        System.out.println(caractere);
        System.out.println("oi, meu nome é "+nome+".");

    }
}
