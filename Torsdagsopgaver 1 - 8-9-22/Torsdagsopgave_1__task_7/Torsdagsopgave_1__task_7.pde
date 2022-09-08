int input = -100;
int half = input/2;

while (input != 0) {
  if (input == 6) {
    println("Six");
  } else if ( input == half) {
    println("HALF!");
  } else {
    println(input);
  }
  if(input > 0){
  input--;
  } else if(input < 0){
  input++;
  }
}
