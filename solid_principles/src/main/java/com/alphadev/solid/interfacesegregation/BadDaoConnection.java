package com.alphadev.solid.interfacesegregation;

public class BadDaoConnection implements BadDAOInterface{
    @Override
    public void openConnection() {
        //connection logic
    }

    @Override
    public void createRecord() {
        // Create record logic
    }

    @Override
    public void openFile() {
        // We are in DB Connection so no need to support open file
        throw new UnsupportedOperationException("Open file not supported");
    }

    @Override
    public void deleteRecord() {
        // This is fine
    }
}
