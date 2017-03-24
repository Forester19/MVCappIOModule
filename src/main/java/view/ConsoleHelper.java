package view;

import EnterTypeException.NoStyleExaption;
import controller.Controller;

import java.io.*;

/**
 * @author Владислав
 * @version 1.0
 *  Class regulator of users parameter
 */
public class ConsoleHelper {
    String developer;
    ViewClass viewClass = new ViewClass();
    Controller controller = new Controller();

    private int i;

    public int getI() {
        return i;
    }

    public String getDeveloper() {
        return developer;
    }

    public ConsoleHelper() {
        viewClass.showFirst();
    }

    /**
     * Main method of this class what do everything.
     *
     * @throws IOException
     * @throws NoStyleExaption
     */
    public void getNumber() throws IOException {

        while (true){
            try(BufferedReader read = new BufferedReader(new InputStreamReader(System.in))){
                i = Integer.parseInt(read.readLine());
                switch (i) {
                    case 1: {
                        controller.all();
                        break;
                    }
                    case 2: {
                        try {
                            informAboutDeveloper();
                        }catch (NoStyleExaption e){
                            System.out.println(e.toString());
                        }
                        controller.addToData(controller.createDeveloper(getDeveloper()));
                        break;
                    }
                    case 3:
                        System.out.println("i don't know how to update file");
                    case 4: {
                        controller.delete();
                        System.out.println("File was deleted");
                        break;
                    }
                }
            }
            catch (Exception e){
                System.out.println("");
                break;
            }
        }
    }

    /**
     * Method handler of information from user about
     * @return String - param what will spited in future;
     * @throws NoStyleExaption
     */
    private String informAboutDeveloper() throws NoStyleExaption {
        System.out.println("Lets enter information about you developer");
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            developer = bufferedReader.readLine();
            String[] s = developer.split(" ");
            if (s.length != 5) {
                throw new NoStyleExaption();
            }
            System.out.println("Ok all right");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return developer;
    }




}
