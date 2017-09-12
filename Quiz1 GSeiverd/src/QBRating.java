import java.util.Scanner;

public class QBRating {
		public static void main(String[] args) {
			Scanner qbstat = new Scanner(System.in);
			
				double passingYards;
		
				double touchdowns;
		
				double interceptions;
		
				double completions;
		
				double attempts;
				
					System.out.println("Number of passing yards:");
					passingYards = qbstat.nextDouble();
					
					System.out.println("Number of touchdowns thrown:");
					touchdowns = qbstat.nextDouble();
					
					System.out.println("Number of interceptions thrown:");
					interceptions = qbstat.nextDouble();
					
					System.out.println("Number of completions made:");
					completions = qbstat.nextDouble();
					
					System.out.println("Number of pass attempts:");
					attempts = qbstat.nextDouble();
					
		
			double statistic1 = ((passingYards / attempts)-3)*.25;
			
			double statistic2 = ((touchdowns / attempts)*20);
			
			double statistic3 = (2.375 - (interceptions / attempts)*25);
			
			double statistic4 = ((completions / attempts)-.3)*5;
			
			double Rating = 
					((statistic1 + statistic2 + statistic3 + statistic4)/6)*100;
			
			System.out.printf("The quarterback rating for Carson Wentz is: %.1f", Rating, "%");
			
		qbstat.close();
			
		}
		
}
