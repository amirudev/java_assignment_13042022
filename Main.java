/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    // Metric Units (Kg and m)
    static String calculateBodyMassIndex(double weight, double height){
        double bodyMassIndex = weight / ( height * height );
        if (bodyMassIndex <= 18.5) {
            return "Skinny";
        } else if (bodyMassIndex <= 25) {
            return "Normal Average";
        } else if (bodyMassIndex <= 30) {
            return "Fat";
        } else {
            return "Obesity Overweight";
        }
    }
    
    static int payEmployeeWages(int workHourByWeek) {
        int overworkHour = 0;
        int underworkHour = 0;
        
        int wagesByHour = 5000;
        int overworkWagesByHour = 7500;
        int underworkWagesByHour = 2500;
        
        int regularWorkHourByWeek = 50;
        
        if (workHourByWeek > regularWorkHourByWeek) {
            overworkHour = workHourByWeek - regularWorkHourByWeek;
        } else if (workHourByWeek < regularWorkHourByWeek) {
            underworkHour = regularWorkHourByWeek - workHourByWeek;
        } else {
            return wagesByHour * workHourByWeek;
        }
        
        return regularWorkHourByWeek * wagesByHour + 
            ( overworkHour * overworkWagesByHour ) - 
            ( underworkHour * underworkWagesByHour );
    }
    
    static String determineQuadranCoordinates(int x, int y) {
        if (x > 0 && y > 0) {
            return "Quadran I";
        } else if (x < 0 && y > 0) {
            return "Quadran II";
        } else if (x < 0 && y < 0) {
            return "Quadran III";
        } else if ( x > 0 && y < 0) {
            return "Quadran IV";
        } else {
            return "Point is on the line or 0";
        }
    }
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(calculateBodyMassIndex(60, 1.65));
		System.out.println(payEmployeeWages(49));
		System.out.println(determineQuadranCoordinates(-1,1));
	}
}
