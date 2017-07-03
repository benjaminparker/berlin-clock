package uk.co.benparker.berlinclock

object BerlinClockApp extends App with ClockLights with ClockLightsDisplay {

  try {
    val timeString = args(0)
    println(lights(Clock(timeString)))
  } catch {
    case _: Throwable => println("Please enter a time in the format HH:MM:SS using the 24hr clock. For example 22:46:03")
  }
}
