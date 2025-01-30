package academy.devedojo.maratonajava;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        int count = 12;
        while (count < 10) {
            System.out.println("dentro de while sozinho");
            count++;
        }
        do{
            System.out.println("dentro de do-while "+ count);
            count++;
        } while (count < 10);
        for(int i = 1; i<10; i *= 3){
            System.out.println("dentro de for " + i);
        }
    }
}
