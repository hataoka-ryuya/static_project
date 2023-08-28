package practice;

public class PracticeSwitch {
	public static void practiceSwitch() {
		int[] numArray = { 5, 2, 3, 4, 1, 2, 1, 4, 3, 5 };

		for (int i = 0; i < numArray.length; i++) {

			switch (numArray[i]) {
			case 1:
				System.out.println("勇者");
				break;
			case 2:
				System.out.println("バトルマスター");
				break;
			case 3:
				System.out.println("パラディン");
				break;
			case 4:
				System.out.println("海賊");
				break;
			case 5:
				System.out.println("魔法剣士");
				break;
			}
		}
	}
}
