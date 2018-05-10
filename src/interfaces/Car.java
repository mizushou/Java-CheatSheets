package interfaces;

public class Car implements Sellable, Driveable {

	@Override
	public double getPercentageMarkup() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMinimumSellingPriceUSD() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void displaySign() {
		Sellable.super.displaySign();
		Driveable.super.displaySign();
	}

}
