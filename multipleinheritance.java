import java.util.*;
class a{
    public void pl() {
    }
}
class b {
    public void r(){
    }
}
class c extends a,b {
     public void r(){
        System.out.println("Hello J");
     }
}
public class multipleinheritance{
    public static void main(String [] args){
        c s=new c();
        s.pl();
        s.r();
    }
}