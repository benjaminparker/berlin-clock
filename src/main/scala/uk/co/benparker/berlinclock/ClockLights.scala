package uk.co.benparker.berlinclock

trait ClockLights {
  def fiveHourLights(clock: Clock): Int = Math.floorDiv(clock.hours, 5)
  def oneHourLights(clock: Clock): Int = clock.hours % 5
  def fiveMinuteLights(clock: Clock): Int = Math.floorDiv(clock.minutes, 5)
  def oneMinuteLights(clock: Clock): Int = clock.minutes % 5
  def secondsLights(clock: Clock): Int = clock.seconds % 2
}
