package org.ultimatecompbg.app;

import org.ultimatecompbg.factories.Factory;
import org.ultimatecompbg.tables.Table;

public class Application {
    private Table table;
    public Application(Factory factory){
        table = factory.createTable();
    }
    public int length(){
        return table.length();
    }
}
