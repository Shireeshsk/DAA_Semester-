package Greedy;
import java.util.*;
public class FractionalKnapsack {
    static class Item{
        int weight;
        int value;
        Item(int weight,int value){
            this.weight=weight;
            this.value = value;
        }
    }

    public static double maxProfit(Item arr[],int capacity){
        Arrays.sort(arr,new Comparator<Item>(){
            @Override
            public int compare(Item item1,Item item2){
                double r1 = (double)item1.value/item1.weight;
                double r2 = (double)item2.value/item2.weight;
                return Double.compare(r2,r1);
            }
        });
        double profit = 0;
        for(Item i:arr){
            if(capacity-i.weight>=0){
                profit += i.value;
                capacity -= i.weight;
            }
            else{
                profit += ((double)capacity/i.weight)*i.value;
                break;
            }
        }
        return profit;
    }
}
