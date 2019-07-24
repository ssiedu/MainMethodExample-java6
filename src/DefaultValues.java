public class DefaultValues {

    static int v1;
    static double v2;
    static boolean v3;
    static String v4;
    
    void show(){
        int v5=50;
        System.out.println("Now Show Is Working");
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);
        System.out.println("Now Show Is Finished");
    }
    
    public static void main(String args[]){
        System.out.println("Now Main Is Starting");
        DefaultValues ob=new DefaultValues();
        ob.show();
        System.out.println("Now Main Finished");
    }
}
