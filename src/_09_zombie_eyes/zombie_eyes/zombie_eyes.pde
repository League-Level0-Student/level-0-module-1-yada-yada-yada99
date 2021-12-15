
void setup() {

size(600, 600);

}
void draw() {
  PImage face = loadImage("face");
face.resize(600, 600);
image(face, 0, 0);
fill(#c6f909);
ellipse (300,100,100,100);
ellipse (445,130,130,130);
fill(mouseX,mouseY,0);
ellipse (300,100,50,50);
ellipse (445,130,75,75);

}
