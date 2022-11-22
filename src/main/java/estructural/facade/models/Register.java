package estructural.facade.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Register {
    private String storeName;
    private Double value;
    private Date date;
}
