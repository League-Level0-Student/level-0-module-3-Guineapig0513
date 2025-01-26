
void setup() {
 
  // set the size of your sketch
  size(500, 500);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  //fill(#FF0000);
  for(int i = 400; i > 0; i-=51) {
    if(i % 2 == 0) {
     fill(#FF0000);
    }
    else {
     fill(#000000); 
    }
  ellipse(250, 250, i, i);
  }
  
  //Use an if statement and remainder to alternate the color of your rings.
  
  
}
