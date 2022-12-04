import java.util.Scanner;
public class programa3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("dime un número ");
            int n1 = sc.nextInt();
            System.out.println("dime otro número ");
            int n2 = sc.nextInt();
            
            if(n1 > n2){
                System.out.println(n2 + ", " + n1);
            }else{
                System.out.println(n1 + ", " + n2);
            }
        }
    }
}