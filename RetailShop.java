package interfaceDemo;

public interface RetailShop {

	public float getTotalCost(float tax , float cost , int number);
	public float getTotalExtendedCost(float totalCosmeticAmount , float totalperfumeAmount , float totalclothesAmount);
	public float getDiscountedCost(float totalCost , float discount);
	
	
}
