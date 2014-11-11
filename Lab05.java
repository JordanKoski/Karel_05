/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Jordan Koski>  // replace <...> with your name
* @version <November 7th> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
 
 public class Lab05 {
 
      public static void runTheRace(Racer arg) {
         arg.shuttle(4, 7);
         arg.shuttle(6, 5);
         arg.shuttle(8, 3);
         arg.move();
     }
 
      public static void main(String[] args) {
     
     Display.openWorld("maps/shuttle.map");
     Display.setSize(10,10);
     Display.setSpeed(15);            
            
            Racer ava = new Racer(7);
            Racer bob = new Racer(4);
            Racer cam = new Racer(1);
            runTheRace(ava);
            runTheRace(bob);
            runTheRace(cam);
                 
   }
            
}