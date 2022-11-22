package estructural.facade.services;

import estructural.facade.models.Card;
import estructural.facade.models.Register;

import java.util.List;

public class ReportService {
	private final RegisterService registerService;
	
	public ReportService(RegisterService registerService) {
		this.registerService = registerService;
	}

	public void getSummary(Card card) {
		List<Register> registers = registerService.getRegistersByCard(card);
		for(Register reg: registers) {
			System.out.printf("%s\t%.2f\t%s%n",
					reg.getStoreName(),
					reg.getValue(),
					reg.getDate().toString()
					);
		}
	}
}