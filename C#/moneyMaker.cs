using System;

namespace MoneyMaker
{
  class MainClass
  {
    public static void Main(string[] args)
    {
      Console.WriteLine("---WELCOME TO MONEY MAKER---");
      Console.WriteLine("---WRITTEN BY RILEY MOORE---");
      Console.WriteLine("What is the amount to convert into coins?");
      string totalAsString = Console.ReadLine();
      double total = Convert.ToDouble(totalAsString);
      Console.WriteLine($"{total} is equal to...");

      //Define coin values
      int goldValue = 10;
      int silverValue = 5;

      //Calculate the change
      double goldCoins = Math.Floor(total / goldValue);
      double remainder = total % goldValue;

      double silverCoins = Math.Floor(remainder / silverValue);
      double remainder2 = remainder % silverValue;

      //Print results
      Console.WriteLine($"Gold coins: {goldCoins}"); 
      Console.WriteLine($"Silver coins: {silverCoins}");
      Console.WriteLine($"Bronze coins: {remainder}");

    }
  }
}
