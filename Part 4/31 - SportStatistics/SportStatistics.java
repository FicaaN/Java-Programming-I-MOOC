import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        int games = 0; int wins = 0; int losses = 0;
        
        try (Scanner fileName = new Scanner(Paths.get(file))) {
            while(fileName.hasNextLine()) {
                String line = fileName.nextLine();
                
                String[] parts = line.split(",");
                String teamName1 = parts[0];
                String teamName2 = parts[1];
                int teamScore1 = Integer.valueOf(parts[2]);
                int teamScore2 = Integer.valueOf(parts[3]);
                
                if (teamName1.equals(team) || teamName2.equals(team)) {
                    games++;
                }
                
                if (teamName1.equals(team) && teamScore1 > teamScore2) {
                    wins++;
                } else if (teamName1.equals(team) && teamScore1 < teamScore2) {
                    losses++;
                }

                if (teamName2.equals(team) && teamScore2 > teamScore1) {
                    wins++;
                } else if (teamName2.equals(team) && teamScore2 < teamScore1) {
                    losses++;
                }
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}