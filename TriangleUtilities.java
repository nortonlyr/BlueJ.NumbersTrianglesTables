 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String expected = "";
        for (int i=0; i<numberOfStars; i++) {
        	expected += "*";
        }
        return expected;
        
    }
    
    public static String getTriangle(int numberOfRows) {
        String expected = "";
        for (int i=1; i<=numberOfRows; i++) {
        	expected += getRow(i) + "\n";
        }
        return expected;
    }


    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
