public class ContinueDemo {
    public static void main(String args[]){
        
        for(int i=1; i<=5; i++){
            System.out.println("Starting For "+i);
            if(i==3){
                continue;
            }
            System.out.println("Printing Value "+i);
            System.out.println("Ending For "+i);
            
        }
        System.out.println("End-Of-Loop");
        
    }
}
