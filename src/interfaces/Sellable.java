package interfaces;

public interface Sellable {

	public double getPercentageMarkup();

	public double getMinimumSellingPriceUSD();

	default public void displaySign(){
        System.out.println("For Sale!");
    }

}
