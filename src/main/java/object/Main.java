package object;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {

        String relativePath = "src/main/resources/NoteDBase";
       Path path = Paths.get(relativePath).toAbsolutePath();
        Connection connection = DriverManager.getConnection("jdbc:h2:"+path.toString());
        Statement SQL = connection.createStatement();
        SQL.execute("CREATE TABLE IF NOT EXISTS notes (id INT AUTO_INCREMENT PRIMARY KEY, nameNote VARCHAR(10), textNote VARCHAR(255), dtCreate TIMESTAMP, dtChange TIMESTAMP)");
       // ResultSet resultSet = connection.endRequest(createTableQuery);

       // System.out.println(connection.toString());


    }
}