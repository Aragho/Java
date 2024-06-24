 import java.util.Scanner;

  public class LargestSmallest {

  public static void main(String[] args ) {

  Scanner input = new Scanner(System.in);

  System.out.print(" Enter first integer: " );
  int number1 = input.nextInt();

  System.out.print(" Enter second integer: " );
  int number2 = input.nextInt();
  
  System.out.print(" Enter third integer: " );
  int number3 = input.nextInt();

  System.out.print(" Enter fourth integer: " );
  int number4 = input.nextInt();

  System.out.print(" Enter fifth integer: " );
  int number5 = input.nextInt();

  int highest = 0;
  int smallest  = number1;

  if(number1 > highest){
         highest = number1;
}
if(number2 > highest){
         highest = number2;
 }
if(number3 > highest){
         highest = number3;
}
if(number4 > highest){
        highest = number4;
}

if(number5 > highest){
         highest = number5;
}

if(number1 < smallest){
         smallest = number1;
}
if(number2 < smallest){
         smallest = number2;
}
if(number3 < smallest){
         smallest = number3;
}

if(number4 < smallest){
         smallest = number4;
}
if(number5 < smallest){
         smallest = number5;
}

System.out.println(" the highest is " + highest + " the smallest is " + smallest);
}
}











  
  

 

  


  


  


  

  