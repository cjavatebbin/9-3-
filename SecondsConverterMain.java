
/**
 * Write a description of class SecondsConverterMain here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class SecondsConverterMain {
    public static void main(String[] args) {
        SecondsConverter converter = new SecondsConverter();
        System.out.println("50,391 seconds is equivalent to " + converter.secondsToHMS(50391));
        System.out.println("12,345 seconds is equivalent to " + converter.secondsToHMS(12345));
        System.out.println("362880 seconds is equivalent to " + converter.secondsToHMS(362880));
        
    }
}
