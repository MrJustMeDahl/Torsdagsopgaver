//Color for the different lights. On and off.
int red = #FF0000;
int yellow = #FFFF00;
int green = #00FF00;
int offColor = #505050;
int timer = 0;
int size = 90;

void setup() {
  size(400, 400);
}

void draw() {
  //Drawing signal box.
  rectMode(CENTER);
  fill(0);
  rect(width/2, height/2, 100, 300);

  //Drawing lights.
  fill(red);
  ellipse(width/2, 100, size, size);
  fill(yellow);
  ellipse(width/2, 200, size, size);
  fill(green);
  ellipse(width/2, 300, size, size);

  // Turning different lights off, depending on timer infinitly.
  if (millis() < timer + 1000) {
    fill(offColor);
    ellipse(width/2, 200, size, size);
    ellipse(width/2, 300, size, size);
  } else if (millis() < timer + 2000) {
    fill(offColor);
    ellipse(width/2, 300, size, size);
  } else if (millis() < timer + 3000) {
    fill(offColor);
    ellipse(width/2, 100, size, size);
    ellipse(width/2, 200, size, size);
  } else if (millis() < timer + 4000) {
    fill(offColor);
    ellipse(width/2, 100, size, size);
    ellipse(width/2, 300, size, size);
  } else if (millis() < timer + 5000) {
    timer = millis();
    fill(offColor);
    ellipse(width/2, 200, size, size);
    ellipse(width/2, 300, size, size);
  }
}
