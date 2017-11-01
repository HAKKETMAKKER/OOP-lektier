/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lektier3;

/**
 *
 * @author Mathi
 */
public class Opgave9_2 {
    
    public void main(String[] args){
/*Create a stock object with the stock symbol ORCL, the name Oracle Corporation,
and the previous closing price of 34.5. Set a new current price
to 34.35 and display the price-change percentage
*/
    SimpleStock stock1 = new SimpleStock("ORCL" , "Oracle Corporation");
    stock1.previousClosingPrice = 34.5;
    stock1.currentPrice = 34.35;
    System.out.println("Stock name: " + stock1.name);
    System.out.println("Stock symbol: " + stock1.symbol);
    System.out.println("Price-change percentage: " + stock1.getChangePercent());
    
 }

/*Create a class called stock with specific data fields, 
two string called symbol and name and two double called 
previousClosingPrice and currentPrice.
*/
    class SimpleStock {
        String symbol;
        String name;
        double previousClosingPrice;
        double currentPrice;
        
//Create a constructor that creates a stock with specified symbol and name    
    SimpleStock(String newSymbol, String newName){
        symbol = newSymbol;
        name = newName;
        
    }

/*Create a method named getChangePercent() that returns the percentage changed
from previousClosingPrice to currenPrice */
    public double getChangePercent(){
        return ((previousClosingPrice - currentPrice)
                /previousClosingPrice)*100;
        
    }
    
    }
}
