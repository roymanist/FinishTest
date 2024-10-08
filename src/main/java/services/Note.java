package services;
import lombok.Data;

@Data
public class Note {

    private int id = 0;

    private int height = 5;

    private int width = 40;

    private String nameNote = "";

    private String textNote = "";

    private String dtCreate = "";

    private String dtChange = "";
}
