package array;
import java.util.*;
public class buyAndSellStock {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println("MAximum Prfit is :"+ maxProfit(arr));
    }

    public static int maxProfit(int [] price){
        int profit=0;
        int buy_price =Integer.MAX_VALUE;
        for (int i=0;i<price.length;i++){
            if( buy_price< price[i]) {
                int curr= price[i] -buy_price;
                profit=Math.max(profit, curr);
            }
            else buy_price= price[i];
        }
        return profit;
    }
}
