


public class NumberUtilities {

    public static String getRange(int stop) {
        return getRange(0, stop);
    }

    public static String getRange(int start, int stop) {
        return getRange(start, stop, 1);
    }


    public static String getRange(int start, int stop, int step) {
        String expected = "";
        for (int i=start; i<stop; i+=step) {
        	expected += 1;
        }
        
        return expected;
    }

    public static String getEvenNumbers(int start, int stop) {
        if (start%2==0) {
        	return getRange(start, stop, 2);
        }else {
        	return getRange(start+1, stop, 2);
        }
    }


    public static String getOddNumbers(int start, int stop) {
    	if (start%2==0) {
        	return getRange(start+1, stop, 2);
        }else {
        	return getRange(start, stop, 2);
        }
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String expected = "";
        for (int i=start; i<=stop; i++) {
        	expected += String.format("%1$.0f", Math.pow(i,  exponent));
        }
        return expected;
    }
}
