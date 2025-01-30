public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 18;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcóolica");
        }else{
            System.out.println("Não autorizado a comprar bebida alcolica.");
        }

        /*if(!isAutorizadoComprarBebida){
            System.out.println("Não autorizado a comprar bebida alcolica.");
        }*/
        /*boolean c = false;
        if(c = true){ // isso é errado
            System.out.println("Dentro de algo que nunca deve ser feito");
        }*/
    }
}
