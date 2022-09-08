int a = 10;
int b = 1;

if(a == 10 || b == 10 ||a + b == 10){
  println("Success!");
} else {
  println("Failure!");
}

int x = 10;
int y = 5; 
int z = 15;

if(x + y + z == 30){
  if(x == 10 || x == 20 || x==30){
    println("Failure!");
  } else if ( y == 10 || y == 20 || y == 30){
    println("Failure!");
  } else if ( z == 10 || z == 20 || z == 30){
    println("Failure!");
  } else{
    println("Success!");
  }
  
} 
