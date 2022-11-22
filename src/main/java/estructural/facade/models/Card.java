package estructural.facade.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Card {
    private Long userNumber;
    private Long cardNumber;
}
