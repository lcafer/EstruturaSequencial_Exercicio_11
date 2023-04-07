package EstruturaSequencial_Exercicio_11;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int integerNumbers[] = new int[2]; 
        double realNumber = 0.0;
        for (int i = 0; i < integerNumbers.length+1; i++){
            if(i < 2) {
                System.out.println("Me fale um número inteiro");
                integerNumbers[i] = userInput.nextInt();
            } else {
                System.out.println("Me fale um número real");
                try{
                    realNumber = userInput.nextDouble();
                } catch (Exception e){
                    realNumber = Double.parseDouble(userInput.next());
                }
            }
        }
        userInput.close();
        double produtoDoDobroDoPrimeiroComMetadeDoSegundo = (integerNumbers[0]*2)*(integerNumbers[1]/2);
        double somaDoTriploDoPrimeiroComOTerceiro = (integerNumbers[0]*3)+realNumber;
        double terceiroElevadoAoCubo = realNumber*realNumber*realNumber;
        System.out.printf("O produto do dobro do primeiro com metade do segundo: %f\nA soma do triplo do primeiro com o terceiro: %f\nO terceiro elevado ao cubo: %f", produtoDoDobroDoPrimeiroComMetadeDoSegundo, somaDoTriploDoPrimeiroComOTerceiro, terceiroElevadoAoCubo);
    }    
}
