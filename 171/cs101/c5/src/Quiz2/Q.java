package Quiz2;

// Basit Qureshi Nov 22, 2017 12:22:45 PM
 
public class Q 
{
    public static void main(String [] str)
    {
        tracing1();
        System.out.println("\n_+_+_+_+_+_+_+_+_\n"); 
        series1();
        System.out.println("\n_+_+_+_+_+_+_+_+_\n"); 
        series2();
    }
    
    
    public static void tracing1()
    {
        System.out.println("\n_+_+_+_+_+_+_+_+_\n");        
        String A="APPLEPIE";
        String B="BELLCAKE";
        for(int i=0; i < A.length(); i++)
        {
            if(A.charAt(i)==B.charAt(i))
                System.out.print(A.charAt(i));
        }
        System.out.println("\n_+_+_+_+_+_+_+_+_\n");        
        int x = 0;      
        for(int i=0; i < 3; i++){
            for(int j=0; j < 3; j++){
                if((i+j)%2==0){
                    x++;
                }
            }
        }
        System.out.println(x);
        System.out.println("\n_+_+_+_+_+_+_+_+_\n");        
        
        int y = 9;
        while(y>0){
            if(y%3==0){
                for(int i=0;i < y; i++)
                    System.out.print("*");
                System.out.println();
            }
            y = y - 2;
        }
        System.out.println("\n_+_+_+_+_+_+_+_+_\n");        
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (i * j > 2)
                    continue;
                System.out.println(i * j);
            }
            System.out.println(i);
        }
        System.out.println("\n_+_+_+_+_+_+_+_+_\n");        
        for(char i= 'd'; i < 'i' ;i++)
            System.out.print(i);
 
        System.out.println("\n_+_+_+_+_+_+_+_+_\n");        
        for(char i= 't'; i < 'z' ;i++)
            System.out.print(i);

        System.out.println("\n_+_+_+_+_+_+_+_+_\n"); 

        String A1="BUTTONCAKE ";
        String B1="COTTONCANDY ";
        for(int i=0; i < A1.length(); i++)
        {
            if(A1.charAt(i)==B1.charAt(i))
                System.out.print(A1.charAt(i));
        }

        System.out.println("\n_+_+_+_+_+_+_+_+_\n");         
        
    }
    
    public static void series1()
    {
        double sum=0;
        for(double i=2;i<=1024;i*=2)
        {
            sum+= 1.0/(i);
        }
        System.out.println(sum);
    }
    
    public static void series2()
    {
        double sum=0;
        for(double i=1;i<=99;i++)
        {
            sum+= i/(i+1);
        }
        System.out.println(sum);
    }

}
