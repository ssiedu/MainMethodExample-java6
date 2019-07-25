
public class TypeConversionDemo {
    public static void main(String[] args) {

        //case-1 (types are same)
            int v1=10;
            double v2=24.5;
            
        //case-2 (types are diff)
        //case-2(a) (no-error) (implicit conversion)
            double v3=25;
            long v4=15;
            
        //case-2(b) (possible loss of prec)
            int v5=(int) 24.23;
            float v6=(float) 45.34;
        
        //case-2(c) (inconvertible types)
            //double v7=(double)true;
            //boolean v8=1;
            
            long v=(long) 25.4f;
            
            
            
            
            
            
            
            
            
            
            
        
        
        
    }
}
