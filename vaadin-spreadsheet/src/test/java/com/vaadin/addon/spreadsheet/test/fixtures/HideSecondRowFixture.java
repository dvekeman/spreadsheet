package com.vaadin.addon.spreadsheet.test.fixtures;

import com.vaadin.addon.spreadsheet.Spreadsheet;

/**
 * Fixture to hide the second row.
 *
 */
public class HideSecondRowFixture implements SpreadsheetFixture {

    @Override
    public void loadFixture(Spreadsheet spreadsheet) {
        spreadsheet.setRowHidden(1, true);
    }
}
