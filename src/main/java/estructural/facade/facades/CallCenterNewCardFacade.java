package estructural.facade.facades;

import estructural.facade.models.Card;
import estructural.facade.models.Register;
import estructural.facade.services.CardService;
import estructural.facade.services.RegisterService;
import estructural.facade.services.ReportService;
import estructural.facade.services.SecurityService;
import lombok.Data;

import java.util.Date;
import java.util.List;

public class CallCenterNewCardFacade {
    CardService cardService;
    RegisterService registerService;
    ReportService reportService;
    SecurityService securityService;

    public CallCenterNewCardFacade() {
        cardService = new CardService();
        registerService = new RegisterService();
        reportService = new ReportService(registerService);
        securityService = new SecurityService(cardService, registerService);
    }

    public void cancelLastRegister(Long user) {
        Card card = cardService.getCardByUser(user);
        List<Register> registers = registerService.getRegistersByCard(card);
        registerService.removeByIndex(card, registers.size() - 1);
        List<Register> pendingRegisters = securityService.blockCard(card);
        Card newCard = cardService.createNewCard(123456L, 33445566L);
        registerService.addCardRegisters(newCard, pendingRegisters);
        reportService.getSummary(newCard);
    }

    public void orderNewCard(Long user) {
        Card card = cardService.getCardByUser(user);
        List<Register> pendingRegisters = securityService.blockCard(card);
        Card newCard = cardService.createNewCard(123456L, 99887766L);
        registerService.addCardRegisters(newCard, pendingRegisters);
        reportService.getSummary(newCard);
    }
}
