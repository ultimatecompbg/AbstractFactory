package org.ultimatecompbg.factories;

import org.ultimatecompbg.tables.MediumTable;
import org.ultimatecompbg.tables.Table;

public class MediumTablesFactory implements Factory {
    @Override
    public Table createTable() {
        return new MediumTable();
    }
}
