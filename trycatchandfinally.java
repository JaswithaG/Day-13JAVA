public class trycatchandfinally{
    public static void main(String [] args){
        try{
            int d=90/0;
        }
        catch(ArithmeticException v){
            System.out.println("Bad request");
        }
        try{
            int d=90/0;
        }
        catch(ArithmeticException v){
            System.out.println("Catch block is running");
        }
        finally{
            System.out.println("Finally is running");
        }
    }
}