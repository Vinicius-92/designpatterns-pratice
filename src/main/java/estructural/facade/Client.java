package estructural.facade;

import estructural.facade.facades.CallCenterFacade;
import estructural.facade.facades.CallCenterNewCardFacade;

public class Client {
    public static void main(String[] args) {
        CallCenterFacade facade = new CallCenterFacade();
        CallCenterNewCardFacade newFacade = new CallCenterNewCardFacade();
        Long userNumber = 123456L;

        Long cardNumber = facade.getCardByUser(userNumber);
        System.out.println(cardNumber);

        facade.getSummary(cardNumber);

        facade.getPaymentInfoByCard(cardNumber);

        newFacade.cancelLastRegister(userNumber);

        Long newCardNumber = facade.getCardByUser(userNumber);
        System.out.println(newCardNumber);

        newFacade.orderNewCard(userNumber);
        Long newNewCardNumber = facade.getCardByUser(userNumber);
        System.out.println(newNewCardNumber);
    }
}
