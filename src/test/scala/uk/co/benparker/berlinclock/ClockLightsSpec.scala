package uk.co.benparker.berlinclock

import org.specs2.mutable.Specification

class ClockLightsSpec extends Specification {

  val clockLights = new ClockLights {}

  "The five hour lights" should {

    "show zero at midnight" in {
      clockLights.fiveHourLights(Clock(0, 0, 0)) mustEqual 0
    }

    "show one at 0500" in {
      clockLights.fiveHourLights(Clock(5, 0, 0)) mustEqual 1
    }

    "show one at 0700" in {
      clockLights.fiveHourLights(Clock(7, 0, 0)) mustEqual 1
    }

    "show four at 2300" in {
      clockLights.fiveHourLights(Clock(23, 0, 0)) mustEqual 4
    }
  }

  "The one hour lights" should {

     "show zero at midnight" in {
       clockLights.oneHourLights(Clock(0, 0, 0)) mustEqual 0
     }

     "show three at 1300" in {
       clockLights.oneHourLights(Clock(13, 0, 0)) mustEqual 3
     }

     "show zero at 1500" in {
       clockLights.oneHourLights(Clock(15, 0, 0)) mustEqual 0
     }
   }

   "The five minute lights" should {

     "show zero at midnight" in {
       clockLights.fiveMinuteLights(Clock(0, 0, 0)) mustEqual 0
     }

     "show 5 at 14:27" in {
       clockLights.fiveMinuteLights(Clock(14, 27, 0)) mustEqual 5
     }
   }

   "The one minute lights" should {

     "show zero at midnight" in {
       clockLights.oneMinuteLights(Clock(0, 0, 0)) mustEqual 0
     }

     "show 4 at 17:49" in {
       clockLights.oneMinuteLights(Clock(17, 49, 0)) mustEqual 4
     }

     "show 0 at 22:35" in {
       clockLights.oneMinuteLights(Clock(22, 35, 0)) mustEqual 0
     }
   }

  "The seconds light" should {
    "show zero at midnight" in {
      clockLights.secondsLights(Clock(0, 0, 0)) mustEqual 0
    }

    "show one for odd number of seconds" in {
      clockLights.secondsLights(Clock(13, 26, 17)) mustEqual 1
    }

    "show zero for even number of seconds" in {
      clockLights.secondsLights(Clock(9, 45, 38)) mustEqual 0
    }
  }
}
