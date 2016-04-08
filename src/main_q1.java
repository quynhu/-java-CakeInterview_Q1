


public class main_q1 {

	 public static int getMaxProfit ( int[] arrayProfits)
		{
		//	int MaxProfit = arrayProfits[1]-arrayProfits[0];
		 if (arrayProfits.length < 2) {
		        throw new IllegalArgumentException("Getting a profit requires at least 2 prices");
		    }
		 
			int lowerBuyPrice = arrayProfits[0];
			int lowerIndex =0;
			int higherBuyPrice = arrayProfits[1];
			
			for (int i =0; i < arrayProfits.length; i++)
			{
				if (lowerBuyPrice > arrayProfits[i])
				{
					lowerBuyPrice = arrayProfits[i];
					lowerIndex = i;
				}
				if (higherBuyPrice < arrayProfits[i] && i > lowerIndex )
					higherBuyPrice = arrayProfits[i];
					
			}
			
			return higherBuyPrice - lowerBuyPrice;
		}

	 public static void main(String[] args) {
	
					
		
		int[] stockPricesYesterday = new int[]{10, 7, 5, 8, 11, 9,16,1,3,5,20};
		System.out.println(Integer.toString(getMaxProfit(stockPricesYesterday)));
	 }
}