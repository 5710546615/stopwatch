package stopwatch;

/**
 * A Stopwatch that measures elapsed time between a starting time and stopping
 * time, or until the present time.
 * 
 * @author Visurt Anuttivong
 * @version 27/01/2560
 */
public class Stopwatch {
	/** constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;
	/** time that the stopwatch was started, in nanoseconds. */
	private long startTime;
	/** time that the stopwatch was ended, in nanoseconds. */
	private long endTime;
	/** Checking that the stopwatch is still running or not */
	private boolean isRunning;

	/** Initialize a new stopwatch. */
	public Stopwatch() {
		this.startTime = 0;
		this.endTime = 0;
		this.isRunning = false;
	}

	/**
	 * Get the time elapse from started time to current time or ended time.
	 * 
	 * @return the time elapse.
	 */
	public double getElapsed() {
		if (this.isRunning()) {
			return NANOSECONDS * (System.nanoTime() - this.startTime);
		} else {
			return NANOSECONDS * (this.endTime - this.startTime);
		}
	}

	/**
	 * Check the stopwatch that it is running or not.
	 * 
	 * @return true if stopwatch is running. Otherwise false.
	 */
	public boolean isRunning() {
		return isRunning;
	}

	/** Start the stopwatch if it is not already running. */
	public void start() {
		if (!this.isRunning()) {
			this.startTime = System.nanoTime();
			isRunning = true;
		}
	}

	/** Stop the stopwatch if it is running. */
	public void stop() {
		if (this.isRunning()) {
			this.endTime = System.nanoTime();
			isRunning = false;
		}
	}

}