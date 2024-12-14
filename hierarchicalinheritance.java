import java.util.*;
class a{
    public void pl(){
        System.out.println("Hello");
    }
}
class b extends a{
    public void r(){
        System.out.println("Hello J");
    }
}
class c extends a{
    public void display(){
        System.out.println("Hello All");
    }
}
public class hierarchicalinheritance{
    public static void main(String [] args){
        b h=new b();
        c j=new c();
        h.pl();
        h.r();
        j.pl();
        j.display();
    }
}