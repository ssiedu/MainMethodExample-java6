
import java.util.Scanner;


public class UserInputs {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Roll Number : ");
        int rno=sc.nextInt();
        System.out.println("Enter Your Name : ");
        String name=sc.next();
        System.out.println("Enter Your Percentage : ");
        double per=sc.nextDouble();
        
        System.out.println("Your Information : ");
        System.out.println(rno);
        System.out.println(name);
        System.out.println(per);
        
        if(per>=60){
            System.out.println("I-Division");
        }else if(per>=45){
            System.out.println("II-Division");
        }else if(per>=33){
            System.out.println("III-Division");
        }else{
            System.out.println("Fail");
        }
        
        
    }
}
