package daopackage;

import model.Developer;
import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;

import java.io.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Владислав on 25.03.2017.
 */
class DevelopersDAOTest {
    DevelopersDAO developersDAO = new DevelopersDAO();
    ArrayList<Developer> developersList = new ArrayList<>();

    @BeforeEach
    void setUp() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(developersDAO.file)))) {
            String s;
            while ((s = br.readLine()) != null) {
                String ss[] = s.split(" ");
                Developer developer = new Developer(Integer.valueOf(ss[0]), ss[1], ss[2], ss[3], Integer.valueOf(ss[4]));
                developersList.add(developer);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @org.junit.jupiter.api.Test
    void addToDocTest() {
        ArrayList<Developer> developers = new ArrayList<>();
        Developer developer = new Developer(10, "dsfsefs", "drgerg", "efsrg", 5);
        developersDAO.addToDoc(developer);
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(developersDAO.file)))) {
            String s;
            while ((s = br.readLine()) != null) {
                String ss[] = s.split(" ");
                Developer developerFull = new Developer(Integer.valueOf(ss[0]), ss[1], ss[2], ss[3], Integer.valueOf(ss[4]));
                developers.add(developerFull);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(developers.size(), developersList.size() + 1);
    }

    @org.junit.jupiter.api.Test
    void getAll() {
ArrayList<Developer> dev = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(developersDAO.file)))) {
            String s;
            while ((s = br.readLine()) != null) {
                String ss[] = s.split(" ");
                Developer developerFull = new Developer(Integer.valueOf(ss[0]), ss[1], ss[2], ss[3], Integer.valueOf(ss[4]));
                dev.add(developerFull);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals(5,dev.size());
    }

    @org.junit.jupiter.api.Test
    void getByID() {
        Developer developer = developersDAO.getByID(10);
        assertEquals(10, developer.getId());

    }

    @org.junit.jupiter.api.Test
    @Ignore
    void delete() {
        boolean b = false;
        developersDAO.delete();
        ArrayList<Developer> developersDeleted = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(developersDAO.file)))) {
            String s;
            while ((s = br.readLine()) != null) {
                String ss[] = s.split(" ");
                Developer developerFull = new Developer(Integer.valueOf(ss[0]), ss[1], ss[2], ss[3], Integer.valueOf(ss[4]));
                developersDeleted.add(developerFull);
            }

        } catch (FileNotFoundException e) {
           b = true;
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertTrue(b);

    }

}