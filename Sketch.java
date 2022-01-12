import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
    size(400, 400);
  }


  public void setup() {
    background(23, 23, 23);
  }

  public void draw() {

  float [] positionY = new float[50];

  for (int i = 0; i < 50; i++)
  {
    positionY[i] = random(height);
  }
  for (int i = 0; i < positionY.length; i++)
  {
    float positionX = width * i / positionY.length;
    ellipse(positionX, positionY[i], 10, 10);

    positionY[i]++;

    if(positionY[i] > height)
    {
      positionY[i] = 0;
    }
  }
  }

}