package org.ultimatecompbg.factories;

import org.ultimatecompbg.tables.LongTable;
import org.ultimatecompbg.tables.Table;

public class LongTablesFactory implements Factory{
    @Override
    // Returns object of class LongTable
    public Table createTable() {
        return new LongTable();
    }
}
