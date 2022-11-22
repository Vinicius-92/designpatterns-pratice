package estructural.composite;

import estructural.composite.model.File;
import estructural.composite.model.FileSystemItem;
import estructural.composite.model.Folder;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        FileSystemItem file1 = new estructural.composite.model.File("File1.txt");
        FileSystemItem file2 = new estructural.composite.model.File("File2.txt");
        FileSystemItem file3 = new estructural.composite.model.File("File3.txt");
        FileSystemItem file4 = new estructural.composite.model.File("File4.txt");
        FileSystemItem sf1 = new Folder("sf1", List.of(file1));
        FileSystemItem sf2 = new Folder("sf2", List.of(file2, sf1));
        FileSystemItem folder = new Folder("folder", List.of(sf2, file3, file4));

        folder.print("");

        System.out.println("------------");
    }
}