
public class Sunday_Monday_Tue___ {
	
	enum Day{
		SUNDAY(1),MONDAY(2),TESDAY(3),WED(4),THU(5),FRI(6),SAT(7);
		private int value;
		private Day(int value) {
			this.value=value;
		}
		public int getValue() {
			return this.value;
		}
	}

	public static void main(String[] args) {
		for (Day day:Day.values()) {
			System.out.print(day+ "-");
		}

	}

}
