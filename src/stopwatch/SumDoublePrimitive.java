package stopwatch;

/**
 * A SumDoublePrimitive is for summing array of primitives.
 * 
 * @author Visurt Anuttivong
 * @version 27/01/2560
 */
public class SumDoublePrimitive implements Runnable {
	/** the number of double primitives. */
	private int counter = 0;
	/** size of the array used in floating point tasks. */
	static final int ARRAY_SIZE = 500000;
	/** sum result in double primitive*/
	private double sum;

	/** Initialize a new SumDoublePrimitive. 
	 * 
	 * @param counter is the number of double primitives.
	 * */
	public SumDoublePrimitive(int counter) {
		this.counter = counter;
	}

	/**
	 * run add double primitives from an array.
	 */
	public void run() {
		// create array of values to add before we start the timer
		double[] values = new double[ARRAY_SIZE];
		for (int k = 0; k < ARRAY_SIZE; k++)
			values[k] = k + 1;

		sum = 0.0;
		// count = loop counter, i = array index value
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0; // reuse the array when get to last value
			sum = sum + values[i];
		}
	}

	/** 
	 * print the describes the task.
	 * 
	 * @return text of describes the task.
	 * */
	public String toString() {
		return String.format("Sum array of double primitives with count=1,000,000,000\n" + "sum = " + sum);
	}

}