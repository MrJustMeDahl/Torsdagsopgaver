//Debug 3
boolean jobsDone1 = false;
//Debug 4
boolean jobsDone2 = true;
//Debug 5
boolean jobsDone3 = true;
//Debug 6
boolean jobsDone4 = true;
//Debug 7
boolean jobsDone5 = true;
//Debug 8
boolean jobsDone6 = true;
//Debug 9
boolean jobsDone7 = true;
//Debug 10
boolean jobsDone8 = true;

void setup() {
  // Debug 1
  MyClass myclass = new MyClass();
  myclass.print();


  // Debug 2 ????????
  println("Jobs done!");

  // Debug 3 Method returned void
  if (isJobDone1())
  {
    println("Job's done!");
  }

  // Debug 4 Missing parantheses in method call
  if (isJobDone2())
  {
    println("Job's done!");
  }

  // Debug 5 Missing semicolon at println
  if (isJobDone3()) {
    println("Job's done!");
  }

  //Debug 6 Wrong return type - as random as standard returns the type float.
  println(getRandomNumber(0, 10));
  if (isJobDone4())
  {
    println("Job's done!");
  }

  //Debug 7 int Sum was local within the for loop, and therefore could not be returned. Variable declared in correct scope.
  int myArray1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
  println(getSumOfElementsInArray(myArray1));

  if (isJobDone5())
  {
    println("Job's done!");
  }

  //Debug 8 isValueGreaterThanThreshold had a change af returning nothing. 
  println(isValueGreaterThanThreshold(10, 5));
  println(isValueGreaterThanThreshold(4, 8));

  if (isJobDone6())
  {
    println("Job's done!");
  }

  //Debug 9 Method length returned 9, and we asked the loop to run if variable = 9, but array only had index ranging from 0-8.
      int myArray2[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1};
    print(getSumOfAllElementsInArray(myArray2));
    
    if (isJobDone7())
    {
        println("Job's done!"); 
    }

    //Debug 10 ???? If statements needed to be executed if one of the conditionals were true, not both of them.
        size(1000,1000);
    drawGrid(15, 15, 40);
    
    if (isJobDone8())
    {
        println("Job's done!"); 
    }

}


//Debug 3
boolean isJobDone1() {
  return jobsDone1 = true;
}

//Debug 4
boolean isJobDone2() {
  return jobsDone2;
}

//Debug 5
boolean isJobDone3() {
  return jobsDone3;
}

//Debug 6
boolean isJobDone4() {
  return jobsDone4;
}

int getRandomNumber(int min, int max) {
  return (int) random(min, max);
}

//Debug 7
int getSumOfElementsInArray(int[] arr) {
  int sum = 0;
  for (int i = 0; i < arr.length; i++) {
    sum += arr[i];
  }
  return sum;
}

boolean isJobDone5() {
  return jobsDone5;
}

//Debug 8
boolean isValueGreaterThanThreshold(int value, int threshold) {
  if (value > threshold)
  {
    return true;
  } else {
    return false;
  }
}

boolean isJobDone6() {
  return jobsDone6;
}

//Debug 9
boolean isJobDone7(){
    return jobsDone7;    
}

int getSumOfAllElementsInArray(int[] arr) {
    int sum = 0; 
    for (int i = 0; i < arr.length; i++){
        sum += arr[i];
    }
    return sum;
}

//Debug 10
boolean isJobDone8()
{
    return jobsDone8;    
}


void drawGrid(int numberOfHorizontalCells, int numberOfVerticalCells, int cellSideLength)
{
    for (int x = 0; x < numberOfHorizontalCells; x++)
 {   
        for (int y = 0; y < numberOfVerticalCells; y++)
        {
         
            if (x % 2 == 0 || y % 2==0)
            {
             
                fill(0);
              
            
            }else if (y % 2==1 || x % 2 == 1 ){
              
                fill(255);
              
            }
            rect(x * cellSideLength, y * cellSideLength, cellSideLength, cellSideLength);  
            
        }
    }
}
