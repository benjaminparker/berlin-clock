package uk.co.benparker.berlinclock

trait ClockLightsDisplay {
  clockLights: ClockLights =>

  def lights(clock: Clock): String =
    lightsWith("Y", clockLights.secondsLights(clock), 1) +
      lightsWith("R", clockLights.fiveHourLights(clock), 4) +
      lightsWith("R", clockLights.oneHourLights(clock), 4) +
      lightsWith("Y", clockLights.fiveMinuteLights(clock), 11).replaceAll("YYY", "YYR") +
      lightsWith("Y", clockLights.oneMinuteLights(clock), 4)

  private def lightsWith(lightChar: String, howMany: Int, maxLights: Int) = lightChar * howMany + "." * (maxLights - howMany) + "\n"
}
