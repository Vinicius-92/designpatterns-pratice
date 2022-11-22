package estructural.facade.facades;

import estructural.facade.models.Card;
import estructural.facade.services.CardService;
import estructural.facade.services.PaymentService;
import estructural.facade.services.RegisterService;
import estructural.facade.services.ReportService;

public class CallCenterFacade {
    CardService cardService;
    RegisterService registerService;
    ReportService reportService;
    PaymentService paymentService;

    public CallCenterFacade() {
        this.cardService = new CardService();
        this.registerService = new RegisterService();
        this.reportService = new ReportService(registerService);
        this.paymentService = new PaymentService(registerService);
    }

    public Long getCardByUser(Long l) {
        Card card = cardService.getCardByUser(l);
        return card.getCardNumber();
    }

    public void getSummary(Long cardNumber) {
        reportService.getSummary(new Card(null, cardNumber));
    }

    public void getPaymentInfoByCard(Long cardNumber) {
        paymentService.getPaymentInfoByCard(new Card(null, cardNumber));
    }
}
