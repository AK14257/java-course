package oops;

public class StaticV {
    static int a =10;
    public static void main(String args[]){
        System.out.println(a);
        StaticV s1=new StaticV();
        System.out.println(s1.a);
        s1.a=100;
        StaticV s2=new StaticV();
        System.out.println(s2.a);
        System.out.println(s1.a);
        System.out.println(a);
     
    }

    
}
