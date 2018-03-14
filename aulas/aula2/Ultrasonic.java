import lejos.nxt.UltrasonicSensor;
import lejos.nxt.SensorPort;
import lejos.nxt.Button;
import lejos.nxt.Motor;

public class Ultrasonic {
  public static void main(String[] args) {
    UltrasonicSensor sonic = new UltrasonicSensor(SensorPort.S4);
    while (!Button.ENTER.isDown()) {
      if (sonic.getDistance() > 30) {
        Motor.B.forward();
        Motor.C.forward();
      } else {
        Motor.B.stop();
        Motor.C.stop();
      }
    }
  }
}
