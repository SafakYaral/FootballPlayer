
public class FootballPlayerTest {

	public static void main(String[] args) {
		
		FootballPlayer Hagi = new FootballPlayer();
		Hagi.no = 10;
		Hagi.name = "Gheorghe Hagi";
		Hagi.minutes = 0;
		Hagi.inPlay = true;
		Hagi.numberOfGoals = 0;
		
		Hagi.play(90);
		Hagi.score();
		Hagi.score();
		
		System.out.println("Number of goal Hagi score; " + Hagi.numberOfGoals);
		System.out.println("Hagi played totally; " + Hagi.minutes + "munites so far");
		
		
		Hagi.play(60);
		Hagi.score();
		
		
		System.out.println("Number of goal Hagi score; " + Hagi.numberOfGoals);
		System.out.println("Hagi played totally; " + Hagi.minutes + " munites so far");
		
		System.out.println("\n**********************************\n");
		
		FootballPlayer Snaijder = new FootballPlayer();
		Snaijder.no = 10;
		Snaijder.name = "Gheorghe Hagi";
		Snaijder.minutes = 0;
		Snaijder.inPlay = true;
		Snaijder.numberOfGoals = 0;
		
		Snaijder.play(90);
		Snaijder.score();
		Snaijder.score();
		Snaijder.score();
		
		System.out.println("Number of goal Snaijder score; " + Snaijder.numberOfGoals);
		System.out.println("Snaijder played totally; " + Snaijder.minutes + " munites so far");
		
	}

}
