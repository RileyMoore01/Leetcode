/* 
Riley Moore
This program checks the strength of the user password
Tools: Using "Tools.Contains()", and ".Length"
*/

using System;

namespace PasswordChecker
{
  class Program
  {
    public static void Main(string[] args)
    {
      int minLength = 8;
      string upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      string lowerCase = "abcdefhijklmnopqrstuvwxyz";
      string digits = "0123456789";
      string specialCharacters = "!@#$%^&*_,.";

      //User input
      Console.WriteLine("Enter your desired password: ");
      string password = Console.ReadLine();

      int score = 0;
      if(password.Length >= minLength) {
        score++;
      } if(Tools.Contains(password, upperCase)) {
        score++;
      } if(Tools.Contains(password, lowerCase)) {
        score++;
      } if(Tools.Contains(password, digits)) {
        score++;
      } if(Tools.Contains(password, specialCharacters)) {
        score++;
      }

      //Switch case for user response on password strength
      Console.Write("Password Strength: ");
      switch(score) {
        case 0: 
          Console.WriteLine("Does not meet requirements");
          break;

        case 1: 
          Console.WriteLine("Weak");
          break;
        
        case 2: 
          Console.WriteLine("Medium");
          break;

        case 3: 
          Console.WriteLine("Strong");
          break;

        case 4: 
          Console.WriteLine("Extremely Strong!");
          break;

        case 5: 
          Console.WriteLine("Extremely Strong!");
          break;
      }

    }
  }
}
