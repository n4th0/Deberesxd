public class programa4 {
    import java.util.Scanner;


    
    public static void main(String[] args) {

        final double k;
        k = 0.27;
    
        Scanner sc = new Scanner(System.in);
        System.out.println("dime una velocidad en km/h");
        double n1 = sc.nextDouble();  
        double n2 = n1/k; 
        System.out.println("la velocidad es de " + String.valueOf(n2) + "m/s");
        
    }



    
}
