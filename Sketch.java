import processing.core.PApplet;

public class Sketch extends PApplet {
  public float[] circleY = new float[50];
  public float[] bottom = new float[400];
  public float[] moiseX = new float [25];
  public float[] moiseY = new float [25];
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
      circleY[i]+=2;

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
    
    
    for (int i  = 0; i < moiseX.length; i++)
    {
      ellipse(moiseX[i], moiseY[i], 25, 25);
    }

    
    // for (int j = 0; j < circleX.length; j++)
    // {
    //   if(circleX[j] >= 0 && circleX[j] <= 400)
    //   {
    //     bottom[(int) circleX[j]]++;
    //   }
    // }

    // for (int k = 0; k < bottom.length; k++)
    // {
    //   for (int p = 0; p <= bottom[k]; p++)
    //   {
    //     stroke(225);
    //     fill(225);
    //     rect(k, 395, 5, 5);
    //   }
    // }
  }


  // float [] positionY = new float[50];
  // for (int i = 0; i < 50; i++)
  // {
  //   positionY[i] = random(height);
  // }
  // for (int i = 0; i < positionY.length; i++)
  // {
  //   float positionX = width * i / positionY.length;
  //   ellipse(positionX, positionY[i], 10, 10);

  //   positionY[i]++;

  //   if(positionY[i] > height)
  //   {
  //     positionY[i] = 0;
  //   }
  // }

  // int count = 25;
  // int[] x = new int[count];
  // int[] y = new int[count];

  // background (23,23,23);
  // for (int i = count - 1; i > 0; i--)
  // {
  //   x[i] = x[i-1];
  //   y[i] = y[i-1];
  // }

  // x[0] = mouseX;
  // y[0] = mouseY;

  // for (int i = 0; i < count; i++)
  // {
  //   ellipse(x[i], y[i], i/2, i/2);
  // }
  // }



}