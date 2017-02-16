package stopwatch;

/**
 * A Speedtest that measures in tasks.
 * 
 * @author Visurt Anuttivong
 * @version 27/01/2560
 */
public class SpeedTest {

	/**
	 * Run the tasks.
	 */
	public static void main(String[] args) {

		TaskTimer.measureAndPrint(new AppendToString(50000));

		// same task but with a larger string size (append more chars)
		TaskTimer.measureAndPrint(new AppendToString(100000));

		// do the same thing using StringBuilder.
		TaskTimer.measureAndPrint(new AppendToStringBuilder(100000));

		// Use a large loop count for floating point tests in order to get
		// accurate times
		int counter = 1000000000;

		TaskTimer.measureAndPrint(new SumDoublePrimitive(counter));
		TaskTimer.measureAndPrint(new SumDouble(counter));
		TaskTimer.measureAndPrint(new SumBigDecimal(counter));
	}

}