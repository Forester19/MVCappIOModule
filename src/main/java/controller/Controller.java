package controller;


import daopackage.DevelopersDAO;
import model.Developer;
import view.ConsoleHelper;

import java.io.IOException;

/**
 * @author Владислав
 * @version 1.0
 *
 * Class adapter, for connection dao-part with view-part
 */
public class Controller {

   DevelopersDAO developersDAO = new DevelopersDAO();


    /**
     * Method get all from data(using dao-part)
     */
    public void all() {
developersDAO.getAll();


    }
    public void addToData(Developer developer){
        developersDAO.addToDoc(developer);
    }

    /**
     * Method handler of entered string
     * @param developer
     * @return object - Developer.
     */
    public Developer createDeveloper(String developer) {
        String[] dev = developer.split(" ");
        Developer developer1 = new Developer(Integer.valueOf(dev[0]), dev[1], dev[2], dev[3], Integer.valueOf(dev[4]));
        return developer1;
    }
    public void delete(){
        developersDAO.delete();
    }
}

