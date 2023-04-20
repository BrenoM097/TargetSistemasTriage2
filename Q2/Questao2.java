package Q2;

public class Questao2 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int intermediario;
        int n = 0;
        int numeroInformado = 5;
      
        while(1 > n) {
            intermediario = num1;
            num1 += num2;
            num2 = intermediario;

            if(num1 == numeroInformado) {
                System.out.println("O Numero informado faz parte da sequencia de fibonacci.");
                n++;
            }else if(num1 > numeroInformado) {
                System.out.println("O numero informado não faz parte da sequencia de fibonacci.");
                n++;
            }

        }
        
    }
}
