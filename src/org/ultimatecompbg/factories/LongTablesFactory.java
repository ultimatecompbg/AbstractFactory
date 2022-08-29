package org.ultimatecompbg.factories;

import org.ultimatecompbg.tables.LongTable;
import org.ultimatecompbg.tables.Table;

public class LongTablesFactory implements Factory{
    @Override
    public Table createTable() {
        return new LongTable();
    }
}
