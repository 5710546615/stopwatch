package stopwatch;

/**
 * A SumDouble is for summing array of double objects.
 * 
 * @author Visurt Anuttivong
 * @version 27/01/2560
 */
public class SumDouble implements Runnable {
	/** the number of double objects. */
	private int counter = 0;
	/** size of the array used in floating point tasks. */
	static final int ARRAY_SIZE = 500000;
	/** sum result in Double object*/
	private Double sum;

	/** Initialize a new SumDouble. 
	 * 
	 * @param counter is the number of double objects.
	 * */
	public SumDouble(int counter) {
		this.counter = counter;
	}

	/**
	 * Run add Double objects from an array.
	 */
	public void run() {
		// create array of values to add, before we start the timer
		Double[] values = new Double[ARRAY_SIZE];
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new Double(i + 1);

		sum = new Double(0.0);
		// count = loop counter, i = array index
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum + values[i];
		}
	}

	/** 
	 * print the describes the task.
	 * 
	 * @return text of describes the task.
	 * */
	public String toString() {
		return String.format("Sum array of Double objects with count=1,000,000,000\n" + "sum = " + sum);
	}

}