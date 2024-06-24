 import java.util.Scanner;
   public class CurrencyExchange {
    
     public static void main(String[] args ) {
     Scanner input = new Scanner(System.in);

     System.out.println(" Enter 0 to change from USD to chinese RMB and 1 to change from chinese RMB to USD");
     int currencyChoice = input.nextInt();

     System.out.println(" Enter the amount you like to change ");
      double exchangeAmount = input.nextDouble();

     System.out.println(" Enter the exchange rate you want ");
     double exchangeRate = input.nextDouble();
   
     double answer;
      if(currencyChoice ==0){
       answer = exchangeRate * exchangeAmount;
      System.out.print(exchangeAmount + " to RMP is equals to " + answer);
      }
      else{
         answer = exchangeRate / exchangeAmount;
      System.out.print(exchangeAmount + " to USD is equals to " + answer);

      double answer;
       if(currencyChoice ==1){
       answer = exchangeRate * exchangeAmount;
      System.out.print(exchangeAmount + " to RMP is equals to " + answer);
      }
      else{
        answer = exchangeRate / exchangeAmount;
      System.out.print(exchangeAmount + " to USD is equals to " + answer);
      }
      }
    }
    }