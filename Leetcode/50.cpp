/*
Pow(x, n)
---------

Implement pow(x, n), which calculates x raised to the power n (i.e. xn).

Input: x = 2.00000, n = 10
Output: 1024.00000

Input: x = 2.10000, n = 3
Output: 9.26100

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
*/

// CPP Solution

class Solution {
    double findPow(long n, double x) {
        if(n==0) return 1;
        double temp = findPow(n/2, x*x);
        return n%2 ? x*temp : temp;
    }
	public:
   		double myPow(double x, int n) {
        	long longN = (long)n; 
        	if(n<0) {
            	longN *= -1;
            	x = 1/x;
        	}
        	return findPow(longN, x);
    	}
};
