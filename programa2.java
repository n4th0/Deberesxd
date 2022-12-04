import java.util.Scanner;
public class programa2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
            System.out.println("dime un numero");
            int n1 = sc.nextInt();
            if(n1%2 != 0){
                System.out.println("es impar");
            }else {
                System.out.println("Es par");
            }
        }catch (Exception e){
            System.out.println("algo ha salido mal, prueba a poner un numero entero");
        }
    }    
}
