
public class ForEachMD {
    public static void main(String[] args) {

        int ar[][]={{11,12},{13,14},{15,16},{17,18},{19,20}};
        
        for(int tmp[]:ar){
            for(int n:tmp){
                System.out.print(n+"\t");
            }
            System.out.println();
        }
        
        
        /*
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(ar[i][j]+"\t");
            }
            System.out.println();
        }
        */
        
        
    }
}
