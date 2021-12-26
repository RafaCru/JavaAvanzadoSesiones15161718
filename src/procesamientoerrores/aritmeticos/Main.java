package procesamientoerrores.aritmeticos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc =new Scanner(System.in);
        System.out.println("Introduce el valor del numerador");
        int numerador = sc.nextInt();
        System.out.println("Introduce el denominador:");
        int denominador = sc.nextInt();
        try{
            System.out.println(dividir (numerador, denominador));

        }catch (ArithmeticException e){
            System.out.println("Error division por cero:"+ e.getMessage());
        }

    }

    public static int dividir (int numerador, int denominador){
        return  numerador/denominador;
    }
}
