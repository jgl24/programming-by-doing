package RupaulsDragRaceSim;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class DragRaceMain {

    private static int topTier() {
        return ThreadLocalRandom.current().nextInt(7, 10);
    }

    private static int midTier() {
        return ThreadLocalRandom.current().nextInt(4, 7);
    }

    private static int bottomTier() {
        return ThreadLocalRandom.current().nextInt(1, 4);
    }


    public static void main(String[] args) {


        Queen aquaria = new Queen("Aquaria", midTier(), midTier(), topTier(), topTier(), topTier(), topTier(), topTier(), midTier(), false, 0);
        Queen eureka = new Queen("Eureka", topTier(), topTier(), midTier(), midTier(), topTier(), midTier(), midTier(), topTier(), false, 0);
        Queen kameronMichaels = new Queen("Kameron Michaels", topTier(), midTier(), midTier(), midTier(), midTier(), midTier(), topTier(), midTier(), false, 0);
        Queen asiaOhara = new Queen("Asia O'Hara", midTier(), topTier(), topTier(), topTier(), midTier(), midTier(), midTier(), topTier(), false, 0);
        Queen mizCracker = new Queen("Miz Cracker", midTier(), midTier(), midTier(), midTier(), topTier(), midTier(), midTier(), topTier(), false, 0);
        Queen monetXchange = new Queen("Monet X Change", topTier(), midTier(), midTier(), midTier(), topTier(), midTier(), topTier(), topTier(), false, 0);
        Queen theVixen = new Queen("The Vixen", midTier(), midTier(), midTier(), midTier(), midTier(), midTier(), midTier(), topTier(), false, 0);
        Queen moniqueHeart = new Queen("Monique Heart", topTier(), topTier(), midTier(), midTier(), topTier(), topTier(), midTier(), topTier(), false, 0);
        Queen blairStClair = new Queen("Blair St. Clair", bottomTier(), midTier(), midTier(), midTier(), midTier(), bottomTier(), midTier(), midTier(), false, 0);
        Queen mayhemMiller = new Queen("Mayhem Miller", midTier(), midTier(), topTier(), midTier(), midTier(), midTier(), midTier(), bottomTier(), false, 0);
        Queen dustayRay = new Queen("Dusty Ray Bottoms", midTier(), midTier(), midTier(), midTier(), midTier(), midTier(), midTier(), midTier(), false, 0);
        Queen yuhua = new Queen("Yuhua Hamasaki", bottomTier(), bottomTier(), midTier(), midTier(), bottomTier(), midTier(), midTier(), midTier(), false, 0);
        Queen kalorie = new Queen("Kalorie Karbdashian", midTier(), bottomTier(), midTier(), bottomTier(), bottomTier(), bottomTier(), midTier(), bottomTier(), false, 0);
        Queen vanjie = new Queen("Vanessa Vanjie", midTier(), bottomTier(), bottomTier(), bottomTier(), midTier(), bottomTier(), bottomTier(), topTier(), false, 0);


        Queen[] queenBank = new Queen[]{aquaria, eureka, kameronMichaels, asiaOhara, mizCracker, monetXchange, theVixen,
                moniqueHeart, blairStClair, mayhemMiller, dustayRay, yuhua, kalorie, vanjie};


//        Runway rWaychallengeOne = new Runway();
//        Queen winner = rWaychallengeOne.runwayWinner(queenBank);


        // Challenge queensLeft = new Challenge();
        // queensLeft.queensRemaining(queenBank);


        Challenge snatchGame = new SnatchGame();
        Challenge bookBall = new BookBall();
        Challenge politicalAd = new PoliticalAd();
        Challenge dragDime = new DragDime();
        Challenge poseBall = new PoseBall();
        Challenge dragDebate = new DragDebate();
        Challenge viralQueens = new viralQueens();
        Challenge missRona = new missRona();
        Challenge clubKid = new clubKid();
        Challenge botanicalBall = new botanicalBall();
        Challenge[] challengesBank = new Challenge[]{snatchGame, bookBall, politicalAd, dragDime, poseBall, dragDebate, viralQueens, missRona, clubKid, botanicalBall};


        for (Challenge currentChallenge : challengesBank) {
            currentChallenge.getWinner(queenBank);
            Queen eliminatedQueen = currentChallenge.getEliminated(queenBank);

            for (int i = 0; i < queenBank.length; i++) {
                if (eliminatedQueen.equals(queenBank[i])) {
                    queenBank[i].setIsEliminated(true);


                }
            }
        }

        System.out.println("\n");

        Queen americasDragSuperstar = null;
        Random rand = new Random();
        int winner = rand.nextInt(3);


        Queen[] top4Bank = new Queen[4];


        int j = 0;
        for (int i = 0; i < queenBank.length; i++) {
            if (!queenBank[i].getIsEliminated()) {
                System.out.println(queenBank[i].getDragName() + " is in the final 4");
                System.out.println();
                top4Bank[j] = queenBank[i];
                j++;
            }
        }
        americasDragSuperstar = top4Bank[winner];


        System.out.println("\n\n\n\n");
        System.out.println("Congratulations " + americasDragSuperstar.getDragName() + " you are America's Next Drag Superstar");

    }


}