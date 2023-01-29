package shop;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Shop {

    private ArrayList<Items> stockList;

    public Shop(ArrayList<Items> stockList) {
        this.stockList = stockList;
    }

    public ArrayList<Items> getStockList() {
        return this.stockList;
    }

    public void addNewStock(Items item){
        this.stockList.add(item);
    }

    public void removeStockFromInventory(Items item){
        this.stockList.remove(item);
    }

    public int stockCount(){
        return this.stockList.size();
    }

    public double calculateTotalPotentialProfit(){
        int potentialProfit = 0;
        for(Items item : this.stockList){
            if(item.getInstrument() !=null){
            potentialProfit += item.getInstrument().calculateMarkUp();}
            else {
                potentialProfit += item.calculateMarkUp();
            }
        }
        return potentialProfit;
    }
}
