import java.util.*;


public class programa5 {

    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int foowhile = 10;
        
        ArrayList<Integer> al = new ArrayList<Integer>();


        while(foowhile <= 10){
            System.out.println("Dime una nota");
            int n = sc.nextInt();
            al.add(n);
            foowhile = foowhile - 1;
            if (foowhile == 0){
                break;
            }
        }
        int suma = 0;
        for (int i = 0; i < al.length; i = i + 1){
            suma+=al[i]; 
        }

        System.out.println(al);
        

    } 
    
}
