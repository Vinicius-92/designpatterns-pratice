package estructural.composite.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class File implements FileSystemItem{
    private String name;

    @Override
    public void print(String structure) {
        System.out.println(structure + name);
    }
}
