package uk.co.benparker.berlinclock

import org.specs2.mutable.Specification

class ClockSpec extends Specification {

  "Creating a clock" should {

    "throw an exception for non parseable input string" in {
      Clock("ABCDX24??") should throwA[NumberFormatException]
    }

    "throw an exception for non numeric times" in {
      Clock("ABC:23:03") should throwA[NumberFormatException]
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
      Clock("09:02:-42") should throwA[AssertionError]
    }
  }

}
