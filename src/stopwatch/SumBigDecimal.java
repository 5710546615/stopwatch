package stopwatch;

/**
 * A SumBigDecimal is for summing array of Big Decimal.
 * 
 * @author Visurt Anuttivong
 * @version 27/01/2560
 */

import java.math.BigDecimal;

public class SumBigDecimal implements Runnable {
	/** the number of BigDecimal. */
	private int counter = 0;
	/** size of the array used in floating point tasks. */
	static final int ARRAY_SIZE = 500000;
	/** sum result in BigDecimal */
	private BigDecimal sum;

	/** Initialize a new SumBigDecimal. 
	 * 
	 * @param counter is the number of BigDecimal.
	 * */
	public SumBigDecimal(int counter) {
		this.counter = counter;
	}

	/**
	 * Run the tasks.
	 */
	public void run() {
		// create array of values to add, before we start the timer
		BigDecimal[] values = new BigDecimal[ARRAY_SIZE];
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new BigDecimal(i + 1);

		sum = new BigDecimal(0.0);
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum.add(values[i]);
		}
	}

	/** 
	 * print the describes the task.
	 * 
	 * @return text of describes the task.
	 * */
	public String toString() {
		return String.format("Sum array of BigDecimal with count=1,000,000,000\n" + "sum = " + sum);
	}

}