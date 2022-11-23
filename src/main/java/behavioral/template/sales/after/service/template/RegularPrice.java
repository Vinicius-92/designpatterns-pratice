package behavioral.template.sales.after.service.template;

import behavioral.template.sales.after.model.Cart;

public class RegularPrice extends BestOfferTemplate {

	public RegularPrice(Cart cart) {
		super(cart);
	}

	@Override
	public boolean isApplicable() {
		return true;
	}

	@Override
	protected void calibrateVariables() {
		// Nothing to adjust!
	}

}
