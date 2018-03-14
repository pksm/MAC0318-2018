import lejos.nxt.UltrasonicSensor;
import lejos.nxt.TouchSensor;
import lejos.nxt.SensorPort;
import lejos.nxt.Button;
import lejos.nxt.Motor;

public class Ultrasonic {
  public static void main(String[] args) {
    UltrasonicSensor sonic = new UltrasonicSensor(SensorPort.S4);
    TouchSensor touch = new TouchSensor(SensorPort.S1);
    while (!touch.isPressed()) {
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
