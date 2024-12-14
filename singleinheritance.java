import java.util.*;
class a{
    public void pl(){
        System.out.println("Hello Students");
    }
}
class b extends a{
    public void r(){
        System.out.println("Hello Teachers");
    }
}
public class singleinheritance{
    public static void main(String [] args){
        a h=new a();
        b j=new b();
        h.pl();
        j.pl();
        j.r();
    }
}