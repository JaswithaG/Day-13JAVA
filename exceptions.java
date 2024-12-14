public class exceptions{
    public static void main(String [] args){
        try{
            int d=90/0;
        }
        catch(ArithmeticException v){
            System.out.println("Bad request");
        }
    }
}