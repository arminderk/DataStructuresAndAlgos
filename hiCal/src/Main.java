import java.util.List;

public class Main {
	public static void main(String[] args) {
		Meeting m1 = new Meeting(0, 1);
		Meeting m2 = new Meeting(3, 5);
		Meeting m3 = new Meeting(4, 8);
		Meeting m4 = new Meeting(10, 12);
		Meeting m5 = new Meeting(9, 10);
		Meeting[] meetingList = {m1, m2, m3, m4, m5};
		
		HiCal hiCal = new HiCal();
		List<Meeting> sortedList = hiCal.mergeRanges(meetingList);
		for(Meeting meeting: sortedList) {
			System.out.print(meeting.getStartTime() + ", " + meeting.getEndTime());
			System.out.println();
		}
	}
}
