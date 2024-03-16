
import java.util.Scanner;
class HoursException extends Exception{
    HoursException(String s) {
        super(s);
    }
}
class MinutesException extends Exception{
    MinutesException(String s){
        super(s);
    }
}
class SecondsException extends Exception{
    SecondsException(String s){
        super(s);
    }
}
public class DefExp {
    public static void check(float hours, float minutes, float seconds) throws HoursException, MinutesException, SecondsException {
        if(hours < 0  || hours > 24)
            throw new HoursException("Not Valid Hour: " + hours);
        if(minutes < 0 || minutes > 60)
            throw new MinutesException("Not Valid Minute: " + minutes);
        if(seconds < 0 || seconds > 60)
            throw new SecondsException("Not Valid Second: " + seconds);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Hours, Minutes and Seconds: ");
        try {
            float hours = sc.nextFloat(), minutes = sc.nextFloat(), seconds = sc.nextFloat();
            check(hours, minutes, seconds);
        }
        catch(HoursException | MinutesException | SecondsException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}