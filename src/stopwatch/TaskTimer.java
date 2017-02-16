package stopwatch;

/**
 * A Tasktimer is to setup the test of each tasks.
 * 
 * @author Visurt Anuttivong
 * @version 27/01/2560
 */
public class TaskTimer {

	/** Initialize a new stopwatch. */
	public static Stopwatch timer = new Stopwatch();

	/**
	 * measureAndPrint is the testing of each tasks
	 * 
	 * @param runnable
	 *            is to be test the task that is runnable.
	 */
	public static void measureAndPrint(Runnable runnable) {
		timer.start();
		runnable.run();
		timer.stop();
		System.out.println(runnable.toString());
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
	}

}