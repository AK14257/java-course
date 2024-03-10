package MultiThreading;

class TheadDemo extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("jai siya ram");
        }
    }
}

public class Demo{
    public static void main(String[] args){
        TheadDemo d=new TheadDemo();
        d.start();
        for(int i=0;i<15;i++){
            System.out.println("jai shree krishna ");
        }
        
    }
}
