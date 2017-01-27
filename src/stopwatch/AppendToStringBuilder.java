package stopwatch;

/**
 * A AppendToStringBuilder is for appending char to StringBuilder.
 * 
 * @author Visurt Anuttivong
 * @version 27/01/2560
 */
public class AppendToStringBuilder implements Runnable {
	/** the number of char which append to StringBuilder. */
	private int count = 0;
	/** the length of final string. */
	private String result;

	/** Initialize a new AppendToStringBuilder. 
	 * 
	 * @param count is the number of char which append to StringBuilder.
	 * */
	public AppendToStringBuilder(int count) {
		this.count = count;
	}

	/**
	 * run append chars to a StringBuilder
	 */
	public void run() {
		final char CHAR = 'a';
		StringBuilder builder = new StringBuilder();
		int k = 0;
		while (k++ < count) {
			builder = builder.append(CHAR);
		}
		// now create a String from the result, to be compatible with task 1.
		result = builder.toString();
	}

	/** 
	 * print the describes the task.
	 * 
	 * @return text of describes the task.
	 * */
	public String toString() {
		return String.format("Append " + result.length() +" chars to StringBuilder\n" + "final string length = " + result.length());
	}

}