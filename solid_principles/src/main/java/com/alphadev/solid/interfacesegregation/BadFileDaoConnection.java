package com.alphadev.solid.interfacesegregation;

public class BadFileDaoConnection implements BadDAOInterface{
    @Override
    public void openConnection() {
        // we can't open connection in file system
    }

    @Override
    public void createRecord() {

    }

    @Override
    public void openFile() {

    }

    @Override
    public void deleteRecord() {

    }
}
