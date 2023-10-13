import processing.core.PApplet;
import java.util.Random;

public class Sketch extends PApplet {
  Random myRandom = new Random();
  int intRandX;
  int intRandY;
  

  public void settings() {
    size(400, 400);
  }

  public void setup() {
    intRandX = myRandom.nextInt(400);
    intRandY = myRandom.nextInt(400);
    
  }

  public void draw() {
    // Change the background color based on the location of the ellipse
    if (intRandX >= 200 && intRandY <= 200) {
      background(137, 207, 240);
    } else {
      background(255, 0, 0);
    }

    if (intRandX >= 200 && intRandY <= 200) {
      stroke(0, 0, 255);
      fill(0,0, 255);
      ellipse(intRandX, intRandY, 100, 100);
    }
    else{
      stroke(255,0,255);
      fill(255,0,255);
      ellipse(intRandX, intRandY, 100, 100);

      String currentTime = nf(hour(), 2) + ":" + nf(minute(), 2) + ":" + nf(second(), 2);
      textSize(16);
      fill(0);
      text("Current Time: " + currentTime, 20, 20);
    }
    }
  }

  
