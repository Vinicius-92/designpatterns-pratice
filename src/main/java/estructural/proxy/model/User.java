package estructural.proxy.model;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private String name;
    private Long accountNumber;
    private String password;
    private Long balance;
}
