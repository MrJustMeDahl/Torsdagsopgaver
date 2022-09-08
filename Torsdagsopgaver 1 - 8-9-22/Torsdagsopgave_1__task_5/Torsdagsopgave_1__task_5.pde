void setup() {
  MethodOne(); 
  MethodTwo(); 
}

/*
  The following method has an error in it. Fix the error and run it. 
*/

void MethodOne()
{
  int i = 1000; // You are not allowed to change this line. 
  
  int max = 10;
  
  if (i > max)
  {
    String output = "i is greater than "+max+".";  
      println(output);
  }
   
}

/* 
  Finish the following method so that we can change the number assigned 
  to the weekday and it prints the correct output.  
*/
void MethodTwo() 
{
  int weekDay = 5; // 0 = Monday, 6 = Sunday. 
  boolean weekend = false;
  String weekDayOutput;
  
  if (weekDay < 5)
  {
    weekend = false;
  }
  else 
  {
    weekend = true;
  }
  switch(weekDay){
  case 0:
    weekDayOutput = "Monday";
    break;
    case 1:
    weekDayOutput = "Tuesday";
    break;
    case 2:
    weekDayOutput = "Wednesday";
    break;
    case 3:
    weekDayOutput = "Thursday";
    break;
    case 4: 
    weekDayOutput = "Friday";
    break;
    case 5:
    weekDayOutput = "Saturday";
    break;
    case 6:
    weekDayOutput = "Sunday";
    break;
    default:
    weekDayOutput = "not a regular week day";
    break;
  }
  // Print the name of the weekday here: 
  println("Today is "+weekDayOutput+".");
    
    
  // Print if it is weekend here:
  if(weekend){
    println("Thank god it is weekend!");
  }
}
