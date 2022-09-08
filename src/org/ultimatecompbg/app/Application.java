package org.ultimatecompbg.app;

import org.ultimatecompbg.factories.Factory;
import org.ultimatecompbg.tables.Table;

public class Application {
    private Table table;

    // Constructor. creates a Table object with the Factory which is handled to the construcotr
    public Application(Factory factory){
        table = factory.createTable();
    }
    // Returns the parameter length of the table parameter
    public int length(){
        return table.length();
    }
}
