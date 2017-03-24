package view;

/**
 * Created by Владислав on 23.03.2017.
 *
 *  View class
 *  @author Владислав
 *  @version 1.0
 */
public class ViewClass {
    String s = "Enter please what you want: \n" +
            "1. - list developers \n" +
            "2. - create \n" +
            "3. - update \n" +
            "4. - delete \n";
    public void showFirst(){
        System.out.println(s);
    }
}
