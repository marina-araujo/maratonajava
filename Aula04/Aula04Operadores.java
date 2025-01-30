public class Aula04Operadores {
    public static void main(String[] args) {
        // operadores basicos: + - / *
        double numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println("Valor: "+numero02+numero01); // esse + logo após a string vai avisar que o sinal de + deve concatenar e não somar
        System.out.println(numero02+numero01);
        System.out.println("Resultado: "+resultado);

        // % (resto da divisão)
        int resto = 21 % 2;
        System.out.println(resto);

        // < > <= >= ==(igual) !=(diferente) sempre vão retornar valores booleanos
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte: "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte: "+isDezIgualVinte);
        System.out.println("iisDezDiferenteVinte: "+isDezDiferenteVinte);

        // && (and) || (or) ! (not)
        int idade = 29;
        float salario = 5000F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta: "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println("isPlaystationCincoCompravel: "+isPlaystationCincoCompravel);

        // atribuição = += -= *= /= %=
        double bonus = 1000;
        // bonus = bonus + 1000
        bonus += bonus;
        System.out.println("bonus: "+bonus);
        bonus /= 2;
        bonus -= 200;
        bonus *= 3;
        System.out.println("bonus: "+bonus);

        //
        int contador = 0;
        contador += 1;
        contador++;
        System.out.println("contador: "+contador);
        contador--;
        System.out.println("contador: "+contador);
        // contador++ diferente de ++contador;
        ++contador;
        System.out.println("contador: "+contador);
        int contador2 = 0;
        System.out.println(contador2++); //primeiro ela imprime a variável contador2
        System.out.println(contador2); //depois é que ela mostra a variável somada
        System.out.println(++contador2); //desse jeito ela vai incrementar primeiro e depois  imprimir

    }
}
