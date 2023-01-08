package interfaceDemo;

import java.util.Scanner;

public class RetailShopImpl implements RetailShop {

	@Override
	public float getTotalCost(float tax, float cost, int number) {
	
	float totalCost	=((cost+(cost*tax/100)))*number;
	System.out.println("total amount"+totalCost);
		return totalCost ;
	}

	@Override
	public float getTotalExtendedCost(float totalCosmeticAmount, float  totalperfumeAmount, float totalclothesAmount) {
	  float	totalExtendedCost = totalCosmeticAmount+ totalperfumeAmount+ totalclothesAmount;
	
		return totalExtendedCost;
	}

	@Override
	public float getDiscountedCost(float totalCost, float discount) {
	float	DiscountedCost=totalCost -(totalCost*discount/100);
	  return DiscountedCost;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Retail Shop ");

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Quntity of Cosmetics");
		int totalQuantityOfCosmetics =sc.nextInt();
		System.out.println("Enter total cost for Cosmetics");
		int totalCostOfCosmetics =sc.nextInt();
		System.out.println("Enter tax for Cosmetics");
		int totalTaxOfCosmetics =sc.nextInt();
		
		RetailShopImpl  retailImpl = new RetailShopImpl();
	float	totalCosmeticAmount=retailImpl.getTotalCost(totalTaxOfCosmetics, totalCostOfCosmetics, totalQuantityOfCosmetics);
	System.out.println("total amount of cosmetic "+totalCosmeticAmount);

		System.out.println("Enter Quntity of Perfume");
		int totalQuantityOfPerfume =sc.nextInt();
		System.out.println("Enter total cost for Perfume");
		int totalCostOfPerfume =sc.nextInt();
		System.out.println("Enter tax for Perfume");
		int totalTaxOfPerfume =sc.nextInt();
		
		
	  float	totalperfumeAmount=retailImpl.getTotalCost(totalTaxOfPerfume, totalCostOfPerfume, totalQuantityOfPerfume);
		System.out.println("total amount of perfume "+totalperfumeAmount);
	  
		System.out.println("Enter Quntity of Clothes");
		int totalQuantityOfClothes =sc.nextInt();
		System.out.println("Enter total cost for Clothes");
		int totalCostOfClothes =sc.nextInt();
		System.out.println("Enter tax for Clothes");
		int totalTaxOfClothes =sc.nextInt();
		
		float	totalclothesAmount	=retailImpl.getTotalCost(totalTaxOfClothes, totalCostOfClothes, totalQuantityOfClothes);
		System.out.println("total amount of clothes "+totalclothesAmount);
		
	float totalAmount=	retailImpl.getTotalExtendedCost(totalCosmeticAmount, totalperfumeAmount, totalclothesAmount);
	System.out.println("Total purchase Amount "+totalAmount);
	System.out.println("Enter purchase discount");
	float totalDisCount=sc.nextInt();
	float discountAmount=retailImpl.getDiscountedCost(totalAmount, totalDisCount);
	System.out.println("Total Amount After discount "+discountAmount);
System.out.println("Thank you .. visit Again");
		
	}
	

}
