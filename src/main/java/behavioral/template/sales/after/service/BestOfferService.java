package behavioral.template.sales.after.service;

import java.util.ArrayList;
import java.util.List;

import behavioral.template.sales.after.model.Cart;
import behavioral.template.sales.after.service.template.BestOfferTemplate;
import behavioral.template.sales.after.service.template.BigCartDiscounts;
import behavioral.template.sales.after.service.template.BlackFriday;
import behavioral.template.sales.after.service.template.CategoryDiscounts;
import behavioral.template.sales.after.service.template.FreeDelivery;
import behavioral.template.sales.after.service.template.RegularPrice;
import behavioral.template.sales.after.service.template.SpecialClient;

public class BestOfferService {
	private List<BestOfferTemplate> templates;
	
	private void loadTemplates(Cart cart) {
		templates = new ArrayList<BestOfferTemplate>();
		templates.add(new RegularPrice(cart));
		templates.add(new FreeDelivery(cart));
		templates.add(new BigCartDiscounts(cart));
		templates.add(new SpecialClient(cart));
		templates.add(new CategoryDiscounts(cart));
		templates.add(new BlackFriday(cart));
	}
	

	public void calculateBestOffer(Cart cart) {
		loadTemplates(cart);
		var bestOffer = Double.MAX_VALUE;
		for(BestOfferTemplate template: templates) {
			if(template.isApplicable()) {
				Double currentPrice = template.calculateOffer(cart);
				System.out.printf("%s: %.2f%n", template.getClass().getSimpleName(), currentPrice);
				bestOffer = (bestOffer > currentPrice)? currentPrice: bestOffer;
			}
		}
		System.out.printf("Final Price: %.2f%n", bestOffer);
	}
}
