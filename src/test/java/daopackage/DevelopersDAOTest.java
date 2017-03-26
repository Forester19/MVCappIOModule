package daopackage;

import model.Developer;

import java.io.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Владислав on 25.03.2017.
 */
class DevelopersDAOTest {
    DevelopersDAO developersDAO = new DevelopersDAO();
    @org.junit.jupiter.api.Test
    void addToDoc() {
        ArrayList<Developer> list = new ArrayList<>();
        String c;
        try (BufferedReader fr = new BufferedReader(new InputStreamReader(new FileInputStream(developersDAO.file)))) {
            while((c = fr.readLine()) != null){
                String[] ar = c.split(" ");
                Developer developer = new Developer(Integer.valueOf(ar[0]),ar[1],ar[2],ar[3],Integer.valueOf(ar[4]));
                list.add(developer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(list.size()+1,list.size());

    }

    @org.junit.jupiter.api.Test
    void getAll() {

        assertTrue(developersDAO.getB());

    }

    @org.junit.jupiter.api.Test
    void getByID() {
Developer developer = developersDAO.getByID(1);
assertEquals(1,developer.getId());

    }

    @org.junit.jupiter.api.Test
    void delete() {
        assertTrue(developersDAO.getFileChack());

    }

}