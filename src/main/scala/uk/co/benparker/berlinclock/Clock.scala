package uk.co.benparker.berlinclock

case class Clock(hours: Int, minutes: Int, seconds: Int)

object Clock {
  def apply(time: String): Clock = {
    val Array(h, m, s) = time.split(":").map{t => assert(t.length == 2); t.toInt}
    assert(h >= 0 && h <= 23)
    assert(m >= 0 && m <= 59)
    assert(s >= 0 && s <= 59)
    Clock(h, m, s)
  }
}
