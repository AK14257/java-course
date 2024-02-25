package oops;

public class IntanceVariable{

    int a=10;
    int b;
    public static void main(String[] args){
        IntanceVariable in1=new IntanceVariable();
        System.out.println(in1.a);
        System.out.println(in1.b);
        in1.a=100;
        in1.b=900;
        System.out.println(in1.a);
        System.out.println(in1.b);
       
        
        

    }
    public void Demo(){
        System.out.println(a);
    }

}