package EnterTypeException;

/**
 * @author Владислав
 * @version 1.0
 *
 * Exception will cached id user enter characters in incorrect format.
 * */
public class NoStyleExaption extends Exception {
    public NoStyleExaption() {
        System.out.println("Enter pls five characters of you developer");
    }
}
