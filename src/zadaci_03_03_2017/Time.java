package zadaci_03_03_2017;

public class Time {

	private long hour;
	private long minute;
	private long seconds;

	/**
	 * A no-arg constructor that creates a Time object for the current time. (The
	 * values of the data fields will represent the current time.)
	 */
	public Time() {

		for (long time = System.currentTimeMillis() / 1000; time != 0; time--, seconds++) {

			if (seconds == 60) {
				seconds = 0;
				minute++;
			}

			if (minute == 60) {
				minute = 0;
				hour++;
			}
		}

	}

	/**
	 * A constructor that constructs a Time object with a specified elapsed time
	 * since midnight, January 1, 1970, in milliseconds. (The values of the data
	 * fields will represent this time.)
	 * @param time
	 */
	public Time(long time) {
		for (time = time / 1000; time != 0; time--, seconds++) {

			if (seconds == 60) {
				seconds = 0;
				minute++;
			}

			if (minute == 60) {
				minute = 0;
				hour++;
			}
		}
	}

	/**
	 * A constructor that constructs a Time object with the specified hour, minute,
	 * and second
	 * @param hour
	 * @param minute
	 * @param seconds
	 */
	public Time(long hour, long minute, long seconds) {
		this.hour = hour;
		this.minute = minute;
		this.seconds = seconds;
	}

	public long getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSeconds() {
		return seconds;
	}

	/**
	 * sets a new time
	 * for the object using the elapsed time.
	 * @param elapsedTime
	 */
	public void setTime(long elapsedTime) {

		elapsedTime = (System.currentTimeMillis() - (elapsedTime)) / 1000;

		for (; elapsedTime != 0; elapsedTime--, seconds++) {

			if (seconds == 60) {
				seconds = 0;
				minute++;
			}

			if (minute == 60) {
				minute = 0;
				hour++;
			}
		}

	}

}
