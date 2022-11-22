package estructural.composite.model;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Folder implements FileSystemItem {
    private String name;
    private List<FileSystemItem> childs;

    @Override
    public void print(String structure) {
        System.out.println(structure + name);
        for (FileSystemItem child : childs) {
            child.print(structure + "| ");
        }
    }
}
