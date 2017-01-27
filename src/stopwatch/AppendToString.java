package stopwatch;

/**
 * A AppendToString is for appending char to String.
 * 
 * @author Visurt Anuttivong
 * @version 27/01/2560
 */
public class AppendToString implements Runnable {
	/** the number of char which append to String. */
	private int count = 0;
	/** the length of final string. */
	private String result;

	/** Initialize a new AppendToString. 
	 * 
	 * @param count is the number of char which append to String.
	 * */
	public AppendToString(int count) {
		this.count = count;
	}

	/**
	 * run append chars to a string.
	 */
	public void run() {
		final char CHAR = 'a';
		result = "";
		int k = 0;
		while (k++ < count) {
			result = result + CHAR;
		}
	}

	/** 
	 * print the describes the task.
	 * 
	 * @return text of describes the task.
	 * */
	public String toString() {
		return String.format("Append " + result.length() + " chars to String\n" + "final string length = " + result.length());
	}

}