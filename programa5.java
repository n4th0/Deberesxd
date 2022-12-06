import java.util.*;

public class programa5 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner( System.in );
        int num;
        int suma_total;
        suma_total=0;

        for (int i=1;i<=10;i++){
            System.out.print("Introduzca una nota: ");
            num = sc.nextInt();
            if(num <= 0 ^ num > 10){
                System.out.println("tienes que poner una nota de verdad");
                break;
            }

            suma_total=suma_total+num;
        }
        float suma_total22 = suma_total, n = 10;
        float r = suma_total22/n; 
        System.out.println("El promedio total es de: " + r);

    } 
    
}
