import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner userInput = new Scanner(System.in);

    double num = userInput.nextDouble();
    double num2 = userInput.nextDouble();

   //Problem 1
    if (num == 12.345)
    {
      System.out.println("YES");
    }
    
    //Problem 2
    if (num == 48)
    {
      System.out.print("YES");
    }
   
   //Problem 3
    if ((num * 2) == num2 || num == (num2 *2))
    {
      System.out.println("YES");
    }
   
   //Problem 4
   if (num % 2 == 0)
   {
    System.out.println("Divisible by 2!");
   }
   if (num % 3 == 0)
   {
    System.out.println("Divisible by 3!");
   }
   
   //Problem 5
   if (num % 2 == 0)
   {
    System.out.println("Even");
   }
   else
   {
    System.out.println("Odd");
   }

   //Problem 6
  String letter = userInput.nextLine();
  if (letter.equals("A"))
  {
    System.out.println("90-100");
  }
  else if (letter.equals("B"))
  {
    System.out.println("80-90");
  }
  else if (letter.equals("C"))
  {
    System.out.println("70-80");
  }
  else if (letter.equals("D"))
  {
    System.out.println("60-70");
  }
  else if (letter.equals("F"))
  {
    System.out.println("0-60");
  }
  else
  {
    System.out.print("Invalid letter grade");
  }
  
 // Problem 7
 int rand = (int) (Math.random()*51);
 int rand2 = (int) (Math.random()*50)+51;
 System.out.println(rand + " + " + rand2 + "?");
 int answer = userInput.nextInt();
 if (answer == (rand + rand2))
 {
  System.out.println("Correct");
 }
 else
 {
  System.out.println("Wrong");
 }

// Problem 8
System.out.println("What is your temperature?");
int temp = userInput.nextInt();
if (97 <= temp && temp <= 99)
{
  System.out.println("Temperature is OK");
}
else
{
  System.out.println("NOT NORMAL");
}
  }
  }


