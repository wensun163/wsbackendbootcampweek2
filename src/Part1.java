/*
 * Backend Bootcamp Week2 Coding Assignment Part 1
 * Author: Wendy Sun
 */


public class Part1 {
	/*
	 * 2.In Eclipse, create the following Boolean variables and choose what values they hold:
	a.	isHotOutside
	b.	isWeekday
	c.	hasMoneyInPocket
	 */
	boolean isHotOutside = true; //2a
	boolean isWeekday = true; //2b
	boolean hasMoneyInPocket = true; //2c
	
	/*
	 * 3.	Create the following variables (not boolean type, choose the best data type for the variable):
	 *a.	costOfMilk
	 *b.	moneyInWallet
	 *c.	thirstLevel (how thirsty you are on a scale of 1-10)
	 */
	double costOfMilk; //3a
	double moneyInWallet;//3b
	
	//3b
	int thirstLevel;
	public void setThirstLevel(int newThirstLevel){
		if (newThirstLevel >=1 && newThirstLevel <=10) {
			thirstLevel = newThirstLevel;
		}
		else {
			 throw new IllegalArgumentException("thirst level is out of range");
        }
	}
	
	/*
	 * 4.	Using the variables you created above and Boolean operators,
	 *  create variables for the following scenarios:
	 *a.	shouldByIcecream – this should be true if it is hot outside and there is money in your pocket
	 *b.	willGoSwimming – this should be true if it is hot outside and it is not a weekday
	 *c.	isAGoodDay – this should be true if it is hot outside, there is money in your pocket,
	 * and it is not a weekday
	 * d.	willBuyMilk – this should be true if it is hot outside,
	 *  and thirstLevel is greater than or equal to 3, 
	 * and moneyInWallet is greater than or equal to 2 times the cost of milk.
	 */
	
	boolean shouldbyIceCream = isHotOutside && hasMoneyInPocket; //4a
	boolean willGoSwimming = isHotOutside && !isWeekday; //4b
	boolean isAGoodDay = !isHotOutside && hasMoneyInPocket;//4c
	boolean willBuyMilk = isHotOutside && thirstLevel>=3 && moneyInWallet >= 2*costOfMilk; 
	
}

