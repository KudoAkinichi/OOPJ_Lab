// 1. Arithmetic, numberformat, arrayoutofboundsexception, nullpointer

public class ExceptionTesting {
    public void arthexp(){
        try{
            int a = 4/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
    public void numexp(){
        String a = "abc";
        try{
            int i = Integer.parseInt(a);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
    }
    public void nullexp(){
        String s = null;
        try{
            System.out.println(s.length());
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
    }
    public void arrexp(){
        int a[] = new int[5];
        try{
            a[10] = 10;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        ExceptionTesting e = new ExceptionTesting();
        e.arthexp();
        e.numexp();
        e.nullexp();
        e.arrexp();
    }
}