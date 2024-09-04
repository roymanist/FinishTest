package services;
import lombok.Data;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class NoteManager {

    private static NoteManager instance;
    private static final Object lock = new Object();/// не сильно понял этот локер. по теории он блочит создание дубля в многопоточности


    private Connection connection;
    private Statement SQL;
    private String relativePath = "src/main/resources/NoteDBase";
    private Path path = Paths.get(relativePath).toAbsolutePath();
    private List<Note> notebook;

    private NoteManager() throws SQLException {
        // connection = DriverManager.getConnection("jdbc:h2:E:/JAVA_LRN/II/PROJ/NEW-NOTE-V2/src/main/java/dbase/NoteDBase");
        connection = DriverManager.getConnection("jdbc:h2:"+path);
        SQL = connection.createStatement();
        notebook = new ArrayList<>();
        ReadNoteBase();



    }//приватный конструктор

    public static NoteManager getNoteData() throws SQLException {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new NoteManager();
                }
            }
        }
        return instance;
    }

    public void ReadNoteBase() throws SQLException {

        ResultSet resultSet = SQL.executeQuery("SELECT * FROM notes");

        while (resultSet.next()) {
            Note note = new Note();
            note.setId(resultSet.getInt("id"));
            note.setNameNote(resultSet.getString("nameNote").trim());
            note.setTextNote(resultSet.getString("textNote").trim());
            note.setDtCreate(resultSet.getString("dtCreate"));
            note.setDtChange(resultSet.getString("dtChange"));

            if (!notebook.contains(note)) {
                notebook.add(note);

               /* resultSet.close();
                statement.close();
                connection.close();*/
            }
        }
    }



}
