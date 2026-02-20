package Fizzbuzz;

public class Main {
    public static void main(String args[]){
        System.out.println("waltuh, te presento el fizzbuzz y luego unas ventanas");

        for(int i = 1; i<=100; i++){
            if (i%3==0 && i%5==0) {
                System.out.println("fizzbuzz");
                
            }else if (i%5==0) {
                System.out.println("buzz");
                
            }else if (i%3==0) {
                System.out.println("fizz");
                
            }else{
                System.out.println(i);
            }
        }

        Ventana waza = new Ventana();

    }

}