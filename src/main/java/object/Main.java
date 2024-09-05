package object;

import services.Note;
import services.NoteManager;
import services.interfaces.SomeClass;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {

        SomeClass x = new SomeClass();
        x.getClass();

/*
        NoteManager manager = NoteManager.getNoteData();

        for (int i = 0; i < manager.getNotebook().size(); i++) {
            System.out.println(manager.getNotebook().get(i).getId());
            System.out.println(manager.getNotebook().get(i).getNameNote());
            System.out.println(manager.getNotebook().get(i).getTextNote());
            System.out.println(manager.getNotebook().get(i).getDtCreate());
            System.out.println(manager.getNotebook().get(i).getDtChange());
        }*/
    }
}