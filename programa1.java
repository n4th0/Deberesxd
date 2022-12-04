import java.util.Scanner;

public class programa1{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("dime tu nombre");
            String name = sc.nextLine();
            System.out.println("dime tu apellido");
            String apellido = sc.nextLine();
            System.out.println("dime tu segundo apelldio");
            String apelldio2 = sc.nextLine();

            System.out.println("Hola " + name + " "  + apellido + " " + apelldio2);
        }
        
        

    }
}