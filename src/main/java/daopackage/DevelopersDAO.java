package daopackage;


import model.Developer;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 * Class for connecting app with data.
 *
 * @author Владислав
 * @version 1.0
 */
public class DevelopersDAO {
    File file = new File("src/main/resources/Developers.txt");
    private ArrayList<Developer> developersById = new ArrayList<>();

    /**
     * This method for writing to file.txt developers
     * @param dev - object what must be write
     */
    public void addToDoc(Developer dev) {
        try (FileWriter bw = new FileWriter(file.getAbsoluteFile(), true); FileReader fr = new FileReader(file.getAbsoluteFile())) {
            String developer = dev.getId() + " " + dev.getFirstName() + " " + dev.getLastName() + " " + dev.getSpeciality() + " " + dev.getExperiance() ;


            bw.write(developer);
            bw.append("\n");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * this void method what can show all information from database (file.txt)
     */
    public void getAll() {
        try (FileReader fr = new FileReader(file.getAbsoluteFile())) {
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    /**
     * best important method for getting some object by id
     * @param id - its integer what means id in data
     * @return developer - object with id
     */
    public Developer getByID(int id){
        try (BufferedReader fr = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))) {
            String dev;
            while((dev = fr.readLine()) != null){
                String[] elements = dev.split(" ");
                Developer newDeveloper = new Developer( Integer.valueOf(elements[0]),elements[1],elements[2],elements[3],Integer.valueOf(elements[4]));
                developersById.add(newDeveloper);

            }
            for (Developer developer: developersById){
                if (developer.getId() == id){
                    return developer;
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * Method for delete file of information
     */
    public void delete() {
        file.delete();
    }


}