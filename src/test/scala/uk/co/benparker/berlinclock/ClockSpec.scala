package uk.co.benparker.berlinclock

import org.specs2.mutable.Specification

class ClockSpec extends Specification {

  "Creating a clock" should {

    "throw an exception for non parseable input string" in {
      Clock("ABCDX24??") should throwA[AssertionError]
    }

    "throw an exception for non numeric times" in {
      Clock("AC:23:03") should throwA[NumberFormatException]
    }

    "throw an exception for hours too high" in {
      Clock("27:23:03") should throwA[AssertionError]
    }

    "throw an exception for hours too low" in {
      Clock("-3:23:03") should throwA[AssertionError]
    }

    "throw an exception for minutes too high" in {
      Clock("13:74:03") should throwA[AssertionError]
    }

    "throw an exception for minutes too low" in {
      Clock("13:-1:03") should throwA[AssertionError]
    }

    "throw an exception for seconds too high" in {
      Clock("09:02:117") should throwA[AssertionError]
    }

    "throw an exception for seconds too low" in {
      Clock("09:02:-9") should throwA[AssertionError]
    }

    "throw an exception for single digit hour" in {
      Clock("3:13:41") should throwA[AssertionError]
    }

    "throw an exception for more than two digit hour" in {
      Clock("003:13:41") should throwA[AssertionError]
    }

    "throw an exception for single digit minute" in {
      Clock("08:7:23") should throwA[AssertionError]
    }

    "throw an exception for more than two digit minute" in {
      Clock("08:00007:23") should throwA[AssertionError]
    }

    "throw an exception for single digit second" in {
      Clock("21:47:0") should throwA[AssertionError]
    }

    "throw an exception for more than two digit second" in {
      Clock("21:47:00000") should throwA[AssertionError]
    }

    "be successful for strict hh:mm:ss format" in {
      Clock("19:06:32") shouldEqual Clock(19,6,32)
    }
  }
}
