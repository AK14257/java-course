class EvenOdd2{
void checkEvenOdd(int n){
    if(n%2==0){
        System.out.println("the given number is even");
    }
    else{
        System.out.println("the given number is odd");
    }
    

}
}
public class EvenOdd{
    public static void main(String args[]){
        EvenOdd2 ev=new EvenOdd2();
        ev.checkEvenOdd(6);
    }
}