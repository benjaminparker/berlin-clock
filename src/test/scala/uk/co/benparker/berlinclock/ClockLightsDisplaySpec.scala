package uk.co.benparker.berlinclock

import org.specs2.mutable.Specification

class ClockLightsDisplaySpec extends Specification {

  val display = new ClockLightsDisplay with ClockLights {}

  "ClockLightsDisplay" should {

    "Show no lights for midnight" in {
      display.lights(Clock(0, 0, 0)) shouldEqual
        "." + "\n" +
          "." * 4 + "\n" +
          "." * 4 + "\n" +
          "." * 11 + "\n" +
          "." * 4 + "\n"
    }

    "Show correct lights for 17:13:39" in {
      display.lights(Clock(17, 13, 39)) shouldEqual
        "Y" + "\n" +
          "RRR." + "\n" +
          "RR.." + "\n" +
          "YY........." + "\n" +
          "YYY." + "\n"
    }

    "Show correct lights for 21:52:20" in {
      display.lights(Clock(21, 52, 20)) shouldEqual
        "." + "\n" +
          "RRRR" + "\n" +
          "R..." + "\n" +
          "YYRYYRYYRY." + "\n" +
          "YY.." + "\n"
    }
  }
}
