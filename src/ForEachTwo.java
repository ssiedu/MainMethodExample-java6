
public class ForEachTwo {

    static void add(int ar[]){
        int sum=0;
        
        for(int n:ar){
            sum=sum+n;
        }
        
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int x[]={10,20,30,40,50};
        int y[]={11,12,13,14,15,16,17,18,19,20};
        int z[]={2,3,4};
        
        add(x);
        add(y);
        add(z);
        
    }
}
