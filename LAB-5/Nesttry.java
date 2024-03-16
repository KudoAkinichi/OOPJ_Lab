// 2. wap to handle any exceptions using nested try block and also demonstrate how to rethrow an exception

public class Nesttry {
    public static void main(String[] args) {
        try {
            int[] a = {1, 2, 3, 4, 5};
            System.out.println(a[5]);
            try {
                int x = a[2] / 10;
            }
            catch (ArithmeticException e) {
                System.out.println(e);
                throw e;
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            throw e;
        }
    }
}