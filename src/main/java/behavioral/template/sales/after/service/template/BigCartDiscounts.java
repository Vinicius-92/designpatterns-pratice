package behavioral.template.sales.after.service.template;

import behavioral.template.sales.after.model.Cart;

public class BigCartDiscounts extends BestOfferTemplate {

	public BigCartDiscounts(Cart cart) {
		super(cart);
	}

	@Override
	public boolean isApplicable() {
		return regularItemsPrice > 1000;
	}

	@Override
	protected void calibrateVariables() {
		priceFactor = 0.9d;
	}

}
