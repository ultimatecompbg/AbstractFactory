package org.ultimatecompbg.factories;

import org.ultimatecompbg.tables.SmallTable;
import org.ultimatecompbg.tables.Table;

public class SmallTablesFactory implements Factory {
    @Override
    public Table createTable() {
        return new SmallTable();
    }
}
