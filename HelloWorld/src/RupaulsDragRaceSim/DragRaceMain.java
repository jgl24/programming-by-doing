package RupaulsDragRaceSim;

public class DragRaceMain {
    public static void main(String[] args) {

        Queen aquaria = new Queen("Aquaria", 7, 7, 9, 9, 8, 8, 8, 7);
        Queen eureka = new Queen("Eureka", 8, 8, 6, 7, 8, 7, 8, 8);
        Queen kameronMichaels = new Queen("Kameron Michaels", 10, 6, 6, 7, 5, 6, 9, 5);
        Queen asiaOhara = new Queen("Asia O'Hara", 7, 8, 8, 7, 6, 7, 7, 8);
        Queen mizCracker = new Queen("Miz Cracker", 7, 7, 7, 7, 8, 7, 7, 8);
        Queen monetXchange = new Queen("Monet X Change", 8, 7, 4, 5, 8, 6, 9, 9);
        Queen theVixen = new Queen("The Vixen", 6, 5, 5, 5, 5, 7, 6, 6);
        Queen moniqueHeart = new Queen("Monique Heart", 8, 8, 7, 6, 8, 8, 7, 9);
        Queen blairStClair = new Queen("Blair St. Clair", 4, 5, 5, 6, 5, 5, 5, 5);
        Queen mayhemMiller = new Queen("Mayhem Miller", 5, 4, 7, 7, 5, 5, 5, 5);
        Queen dustayRay = new Queen("Dusty Ray Bottoms", 6, 6, 5, 5, 6, 6, 7, 5);
        Queen yuhua = new Queen("Yuhua Hamasaki", 4, 4, 5, 5, 4, 5, 6, 5);
        Queen kalorie = new Queen("Kalorie Karbdashian", 6, 4, 7, 4, 4, 3, 7, 4);
        Queen vanjie = new Queen("Vanessa Vanjie", 6, 4, 4, 4, 7, 3, 3, 9);


        Queen[] queenBank = new Queen[]{aquaria, eureka, kameronMichaels, asiaOhara, mizCracker, monetXchange, theVixen,
                monetXchange, moniqueHeart, blairStClair, mayhemMiller, dustayRay, yuhua, kalorie, vanjie};

        // Challenges[] challengeSelector = new Challenges[];


        Runway challengeOne = new Runway();
        Queen winner = challengeOne.runwayWinner(queenBank);
        challengeOne.runwayBottom2(queenBank);
        Runway loser = new Runway();
        System.out.println(loser.runwayBottom2(queenBank));


//
//        Challenges snatchGame = new Challenges();
//        snatchGame.getSnatchGameWinner(queenBank);
//        Challenges bookBall = new Challenges();
//        bookBall.getBookBallWinner(queenBank);
//        Challenges politicalAd = new Challenges();
//        politicalAd.getPoliticalAdWinner(queenBank);
//        Challenges dragDime = new Challenges();
//        dragDime.getDragOnDimeWinner(queenBank);
//        Challenges poseBall = new Challenges();
//        poseBall.getPoseBallWinner(queenBank);
//        Challenges dragDebate = new Challenges();
//        dragDebate.getDragDebateWinner(queenBank);
//        Challenges thatBitch = new Challenges();
//        thatBitch.getThatBitchWinner(queenBank);
//        Challenges victorianBall = new Challenges();
//        victorianBall.getVicBallWinner(queenBank);

    }
}