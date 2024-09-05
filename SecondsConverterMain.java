
/**
 * Main function for SecondsConverter class
 * 
 * @author Terence Wu
 * @version 9/4/2024
 */
public class SecondsConverterMain {
    public static void main(String[] args) {
        SecondsConverter converter = new SecondsConverter();
        System.out.println("50,391 seconds is equivalent to " + converter.secondsToHMS(50391));
        System.out.println("12,345 seconds is equivalent to " + converter.secondsToHMS(12345));
        System.out.println("362880 seconds is equivalent to " + converter.secondsToHMS(362880));
        
    }
}
