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

@Data
public class NoteManager {

 private String relativePath = "src/main/resources/NoteDBase";
    private Path path = Paths.get(relativePath).toAbsolutePath();

   /* private Connection connection = DriverManager.getConnection("jdbc:h2:"+path.getName(1));
    private Statement SQL = connection.createStatement();
*/
}
