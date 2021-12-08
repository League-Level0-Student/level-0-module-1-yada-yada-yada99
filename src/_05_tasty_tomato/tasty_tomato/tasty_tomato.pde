void setup() {
    size(500, 500);
}
void draw() {
   fill(#CF210F);
  background(200, 200, 200);
    noStroke();
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#0C9A05);
    rect(176, 103, 12, 32);
    if(mousePressed){
      fill(#c9c9c9);
      ellipse(80,200,50,50);
    }
}
