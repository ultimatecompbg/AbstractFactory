package org.ultimatecompbg.factories;

import org.ultimatecompbg.tables.SmallTable;
import org.ultimatecompbg.tables.Table;

public class SmallTablesFactory implements Factory {

    // Returns object of class SmallTable
    @Override
    public Table createTable() {
        return new SmallTable();
    }
}
