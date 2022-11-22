package estructural.facade.services;

import estructural.facade.models.Card;
import estructural.facade.models.Register;

import java.util.List;


public class PaymentService {
	private final RegisterService registerService;
	
	public PaymentService(RegisterService registerService) {
		this.registerService = registerService;
	}

	public void getPaymentInfoByCard(Card card) {
		List<Register> registers = registerService.getRegistersByCard(card);
		double sum = registers.stream()
				.reduce(0d, (partialValue, reg) -> partialValue + reg.getValue(), Double::sum);
		System.out.printf("You have to pay %.2f until next week%n", sum);
	}

}
