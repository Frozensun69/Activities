
public class Activity_10_1 {
	public static void main(String[] args) {
		// Creates two objects
		Time time1 = new Time();
		Time time2 = new Time(555550000);

		// Displays time objects hour, minute, and hour
		System.out.println(time1.getHour() + ":" + time1.getMinute() + 
			":" + time1. getSecond());
		System.out.println(time2.getHour() + ":" + time2.getMinute() + 
			":" + time2. getSecond());
	}
}
