import java.util.*;
class a{
    public void r(){
        System.out.println("Hello");
    }
}
class b extends a{
    public void r1(){
        super.r();
        System.out.println("Hello Jashu");
    }
}
public class superkeyword{
    public static void main(String [] args){
        b j=new b();
        j.r1();
    }
}