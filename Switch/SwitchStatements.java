package Switch;

/*
 * Syntax:
    switch(expression)
    {
        //cases

        case one: //do something
        break;

        case two: //do something
        break;

        default: //do something
    }
 */

/*
 * cases have to be same type as of expression, must be a constant or literal
 */

//Program prints the day based on the given value using switch statements

public class SwitchStatements {
	public static void main(String args[]) {
		int day = 1;

		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("None");
		}
	}
}
