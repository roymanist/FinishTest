package object;

import services.NoteManager;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {

       /* String relativePath = "src/main/resources/NoteDBase";
       Path path = Paths.get(relativePath).toAbsolutePath();
        Connection connection = DriverManager.getConnection("jdbc:h2:"+path.toString());
        Statement SQL = connection.createStatement();*/
       // SQL.execute("CREATE TABLE IF NOT EXISTS notes (id INT PRIMARY KEY, nameNote VARCHAR(10), textNote VARCHAR(255), dtCreate TIMESTAMP, dtChange TIMESTAMP)");
        LocalDateTime currentDateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // Применение форматирования к текущей дате и времени
        String dt = currentDateTime.format(formatter);
        NoteManager x = new NoteManager();

        System.out.println(x.getPath().toString());

        //SQL.execute("INSERT INTO notes (id, textNote, dtCreate, dtChange, nameNote) SELECT 2, 'Bye World' , '"+dt+"' , '"+dt+"' , 'Second'");


       // ResultSet resultSet = connection.endRequest(createTableQuery);
       //   SQL.execute("DROP TABLE IF  EXISTS notes");
       // System.out.println(connection.toString());


    }
}