
public class LoopLabelOne {

    public static void main(String[] args) {

        //when the value of j is 3
        //we want to break outer loop
        p:        for (int i = 1; i <= 5; i++) {

            q:  for (int j = 1; j <= 5; j++) {

                if (j == 3) {
                    break p; 
                }

                System.out.print(j + "\t");
            }
            System.out.println();
        }

        System.out.println("Outer Loop Breaked");
    }
}
