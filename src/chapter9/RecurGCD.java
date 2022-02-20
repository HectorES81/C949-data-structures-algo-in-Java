package chapter9;

/****
 *  Python program below
"""
Determine the greatest common divisor
of two numbers, e.g., GCD(8, 12) = 4
"""
def gcd(n1, n2):
    greatest_common_divisor = 0

    if n1 == n2:  # Base case: Numbers are equal
        greatest_common_divisor = n1
    else:  # Recursive case: Try again after subtracting
           # the smaller number from the larger number.
        if n1 > n2:  # n2 is smaller
            greatest_common_divisor = gcd(n1-n2, n2)
        else:        # n1 is smaller
            greatest_common_divisor = gcd(n1, n2-n1)
    return greatest_common_divisor

print ('This program outputs the greatest '
       'common divisor of two numbers.\n')

num1 = int(input('Enter first number:'))
num2 = int(input('Enter second number:'))

if (num1 < 1) or (num2 < 1):
    print('Note: Neither value can be below 1.')
else:
    my_gcd = gcd(num1, num2)
    print('Greatest common divisor =', my_gcd)
    
 * @author Hector x360
 *
 */

public class RecurGCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
