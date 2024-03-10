package oops.pack2;

public class MethodOverloading {
  public int add(int a,int b){
    return a+b;
  }


  public int add(int a,int b,int c){
    return a+b+c;
  }

  public static void main(String args[]){
    MethodOverloading m1=new MethodOverloading();
    int y=m1.add(4,5);
    System.out.println(y);

    int z=m1.add(4,6,5);
    System.out.println(z);
  }

}



