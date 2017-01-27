# Stopwatch tasks by Visurt Anuttivong (5710546615)

I ran the tasks on a MSI GE60 20E Laptop (Windows 10 Education 64-bit), and got these results:

Task                                            | Time
------------------------------------------------|--------------:
Append 50,000 chars to String 			| 0.789763 sec
Append 100,000 chars to String 			| 2.877819 sec
Append 100,000 chars to StringBuilder	 	| 0.003773 sec
Add 1 billion double primitives using array 	| 1.170337 sec
Add 1 billion double objects using array	| 5.500225 sec
Add 1 billion BigDecimal using array		| 11.337067 sec


## 2) Display length of the result

	Append 50,000 chars to String
	final string length = 50000
	Elapsed time 0.789763 sec

	Append 100,000 chars to String
	final string length = 100000
	Elapsed time 2.877819 sec

	Append 100,000 chars to StringBuilder
	final string length = 100000
	Elapsed time 0.003773 sec

	Sum array of double primitives with count=1,000,000,000
	sum = 2.500005E14
	Elapsed time 1.170337 sec

	Sum array of Double objects with count=1,000,000,000
	sum = 2.500005E14
	Elapsed time 5.500225 sec

	Sum array of BigDecimal with count=1,000,000,000
	sum = 250000500000000
	Elapsed time 11.337067 sec

	
## 3) Explanation of Results

	Q : Why does appending 100,000 chars to a String take more than 2X the time to append 50,000chars?
	A : Chars need to allocate the space before parsing to String. So more data, more time.

	Q : Why is there such a big difference in the time used to append chars to a String and to a StringBuilder? 
	    Even though we eventually "copy" the StringBuilder into a String so the final result is the same.
	A : StringBuilder is collect all data as Object before parsing to String in one time. While String also
	    parsing data to String immediately. 

	Q : Why is there a significant difference in times to sum double, Double, and BigDecimal values?
	A : Double primitive is the data type so it doesn't create an object. Double Object takes time to create an
  	    object. BigDecimal have to import from java library before.
