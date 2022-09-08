package org.ultimatecompbg;

import org.ultimatecompbg.app.Application;
import org.ultimatecompbg.factories.Factory;
import org.ultimatecompbg.factories.LongTablesFactory;
import org.ultimatecompbg.factories.MediumTablesFactory;
import org.ultimatecompbg.factories.SmallTablesFactory;
import org.ultimatecompbg.tables.Table;

import java.util.Scanner;

// Manage table factories
public class Main {

    // Gets user input and depending on it returns different Factory, which returns Application that returns a table
    private Application configureApplication(){
        Application app;
        Factory factory = null;
        Scanner scanner = new Scanner(System.in);
        String tableSize = scanner.nextLine();
        if("Long".equals(tableSize)){
            factory = new LongTablesFactory();
        } else if("Medium".equals(tableSize)){
            factory = new MediumTablesFactory();
        } else if ("Small".equals(tableSize)){
            factory = new SmallTablesFactory();
        }
        app = new Application(factory);
        return app;
    }
    // Prints table length
    public static void main(String[] args){
        Main configure = new Main();
        Application app = configure.configureApplication();
        System.out.println(app.length());
    }
}
