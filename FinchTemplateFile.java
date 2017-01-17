

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

/**
 * Created by: "Whatever"KadeMcGowen,JazperToralba
 * Date:11/12/17
 * A starter file to use the Finch
 */

public class FinchTemplateFile
   {
   public static void main(final String[] args)
      {
      // Instantiating the Finch object
      Finch myFinch = new Finch();

      // Write some code here!
      myFinch.saySomething("Cars Are Cool");
      myFinch.setLED(0,100,110);
      myFinch.setWheelVelocities(100, 107, 6000);
      myFinch.setWheelVelocities(100, 0, 1200);
      myFinch.setWheelVelocities(100, 107, 5000);
      myFinch.setWheelVelocities(100,0, 1200);
      myFinch.setWheelVelocities(100, 107, 6000);
      myFinch.setWheelVelocities(100, 0, 1200);
      myFinch.setWheelVelocities(100, 107, 5000);
      myFinch.setWheelVelocities(100, 0, 1200);
      myFinch.setWheelVelocities(100, 107, 1500);
      myFinch.setWheelVelocities(-100, 110, 3000);
      myFinch.setWheelVelocities(100, 107, 5000);
      myFinch.setWheelVelocities(-100, 110, 5000);
      myFinch.sleep(2000);
      // Always end your program with finch.quit()
      myFinch.quit();
      System.exit(0);
      }
   }

