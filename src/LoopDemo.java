
import java.util.Scanner;

public class LoopDemo {
    public static void main(String[] args) {
   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int n=sc.nextInt();
        int i=1;
        
        do{
            System.out.println(i*n);
            i++;
        }while(i<=10);
            
        
        /*
        while(i<=10){
            System.out.println(i*n);
            i++;
        }
        */
        /*
        for(int i=1; i<=10; i++){
            System.out.println(i*n);
        }
        */
        
    }
}
