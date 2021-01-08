

public class NumberUtilities {

    public static String getRange(int stop) {
        String numList = "";
        for (int i=0; i<stop; i++) {
        	numList = numList + Integer.toString(i);
        }
    	return numList;
    }

    public static String getRange(int start, int stop) {
        String numList = "";
        for (int i=start; i<stop; i++) {
        	numList = numList + Integer.toString(i);
        }
    	return numList;
    }


    public static String getRange(int start, int stop, int step) {
        String numList = "";
        for (int i=start; i<stop; i++) {
        	if (i % step ==0)
        	numList += numList + Integer.toString(i);
        }
        
        return numList;
    }

    public static String getEvenNumbers(int start, int stop) {
    	String numList = "";
    	for (int i=start; i<stop; i++) {
    		if (i % 2 ==0)
    		numList = numList + Integer.toString(i);
    	}
    	return numList;
    }


    public static String getOddNumbers(int start, int stop) {
    	String numList = "";
    	for (int i=start; i<stop; i++) {
    		if (i % 2 !=0)
    		numList = numList + Integer.toString(i);
    	}
    	return numList;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String numList = "";
        for (int i=start; i<= stop; i++) {
        	int square = (int) Math.pow(i,  exponent);
        	numList = numList + square;
        }
        return numList;
    }
}
