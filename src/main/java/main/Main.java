package main;

import controller.Controller;
import model.Developer;

import daopackage.DevelopersDAO;
import view.ConsoleHelper;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
        Developer dev1 = new Developer(1,"Ani","Oslo", "jsJunior",1);
        Developer dev2 = new Developer(2,"Jack","Jonson", "Engineer",3);
        Developer dev3 = new Developer(3,"Fol","Groow", "PM",4);
        Developer dev4 = new Developer(4,"Frank","Sinatra", "SeniorDeveloper",5);
        DevelopersDAO devolopersDAO = new DevelopersDAO();
       /* devolopersDAO.addToDoc(dev1);
        devolopersDAO.addToDoc(dev2);
        devolopersDAO.addToDoc(dev3);
        devolopersDAO.addToDoc(dev4);*/

        ConsoleHelper consoleHelper = new ConsoleHelper();
        consoleHelper.getNumber();






    }
}