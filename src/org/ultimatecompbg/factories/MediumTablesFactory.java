package org.ultimatecompbg.factories;

import org.ultimatecompbg.tables.MediumTable;
import org.ultimatecompbg.tables.Table;

public class MediumTablesFactory implements Factory {
    @Override
    // Returns object of class MediumTable
    public Table createTable() {
        return new MediumTable();
    }
}
