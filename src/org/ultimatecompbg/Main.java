package org.ultimatecompbg;

import org.ultimatecompbg.app.Application;
import org.ultimatecompbg.factories.Factory;
import org.ultimatecompbg.factories.LongTablesFactory;
import org.ultimatecompbg.factories.MediumTablesFactory;
import org.ultimatecompbg.factories.SmallTablesFactory;

import java.util.Scanner;

public class Main {

    private static Application configureApplication(){
        Application app;
        Factory factory;
        Scanner scanner = new Scanner(System.in);
        String tableSize = scanner.nextLine();
        if(tableSize.equals("Long")){
            factory = new LongTablesFactory();
        } else if(tableSize.equals("Medium")){
            factory = new MediumTablesFactory();
        } else if (tableSize.equals("Small")){
            factory = new SmallTablesFactory();
        } else {
            factory = null;
        }
        app = new Application(factory);
        return app;
    }
    public static void main(String[] args){
        Application app = configureApplication();
        System.out.println(app.length());
    }
}
