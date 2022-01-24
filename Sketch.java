import processing.core.PApplet;

public class Sketch extends PApplet {
  public float[] circleY = new float[50];
  public float[] bottom = new float[400];
  public float[] pMouseX = new float [25];
  public float[] pMouseY = new float [25];
  public float circleX;
	
  public void settings() {
    size(400, 400);
  }


  public void setup() {
    background(23, 23, 23);
    for(int i = 0; i < circleY.length; i++)
    {
      circleY[i] = random (0,400);
    }
  }

  public void draw() {
    background(23, 23, 23);

    for (int i = 0; i < circleY.length; i++)
    {
      circleX = width * i / circleY.length;
      ellipse(circleX, circleY[i], 5, 5);
      circleY[i] += 2;
      
      if (keyPressed)
      {
        if(keyCode == UP)
        {
          circleY[i] += 4;
        }
        else if (keyCode == DOWN)
        {
          circleY[i] += 0.5;
        }
    }

      if (circleY[i] > height)
      {
        circleY[i] = 0;
        bottom[(int) circleX]++;
      }
    }
    
    for (int k = 0; k < bottom.length; k++)
    {
      for (int p = 0; p < bottom[k]; p++)
      {
        stroke(225);
        fill(225);
        rect(k, 395, 5, 5);

        if (p > 1)
        {
          rect(k, height - (p*5), 5, 5);
        }
      }
    }
    
    for (int i  = 0; i < pMouseX.length; i++)
    {
      pMouseX[i] = mouseX;
      pMouseY[i] = mouseY;
      ellipse(pMouseX[i], pMouseY[i], 25, 25);
    }
}
}