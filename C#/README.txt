C# 

To-Do: 
  Out keyword
  Lambda Experessions
 
Random Facts: 
  Type errors are checked before the program runs
  Converting an double to a int is an Explicit type conversion
  
Math  methods to memorize: 
  Math.Abs() - Finds the absoulte value of variable passed in as a parameter 
  Math.Sqrt() - Finds the square root of value passed in
  Math.Floor() - Rounds down the variable to have no decimal value
  Math.Min(value1, value2) - Returns the minimum of the two values
  Maht.Pow() - Rasies one value to the power of the second value
  Math.Ceiling() - Rounds  up the varaible passed into it
  Math.Max() - Returns the max of the two values passed in
  
Escape Sequence for strings -> put | in front of quotation mark to print the marks to console.
                               Also using \n for a new line
                               
String Interpelation -> to add a string with print, use {} around the variable instead of + in other languages
                        make sure to put $ infront of the qutation mark starting the string w/out any space between
String Operations & Methods:
  .Length
  .IndexOf
  .Substring - Use indexOf to find the char position, then Substring will grad that section of teh stirng
  .ToUpper() - .Net method
  .ToLower() - .Net method
  .Substring(index1, toIndex2) - Grabs a substring of the string calling the method

Ternary Operators -> Like an if else in one line
  string result = (color == "blue") ? "blue" : "Not Blue";
  if the color is blue then "blue" will print, otherwise "Not Blue" will print
  Format: string value = (value2 <= condition) ? if statement : else statement;
  
Optional Parameters: Assign an '=' sign in the parameter and it will be stored if parameter is not passed
  assigning certain parameters while calling. ex.) (int a, int b, int c) -> to assign 4 to c do (c: 4)
  
Out Keyword: keyword in C# which is used for the passing the arguments to methods as a reference type.
