import java.util.Scanner; 
public class programa4 {
    
    
       
    public static void main(String[] args) {

        double n1;
        final double k = 2;
        double n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("dime una velocidad en km/h");
        n1 = sc.nextDouble();
          
        n2 = n1/k; 
        System.out.println("la velocidad es de " + String.valueOf(n2) + "m/s");   
    }
}
