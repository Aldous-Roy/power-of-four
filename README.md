In mathematics, a number n is said to be a power of four if it can be written as 4^x, where x is a non-negative integer. For example:

	•	4^0 = 1
	•	4^1 = 4
	•	4^2 = 16
	•	4^3 = 64

This program includes a recursive method powerOfFour to check whether a given integer is a power of four.

How it Works

The function powerOfFour(int n) works as follows:

	1.	Base Case:
	•	If n == 1, return true (since 4^0 = 1).
	2.	Negative Case:
	•	If n \% 4 != 0 or n == 0, return false (the number is not divisible by 4 or is zero).
	3.	Recursive Case:
	•	If the number is divisible by 4, recursively check n/4.
