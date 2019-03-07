/**
 * Richard Fitzgerald
 * Project
 * Programming III - AP
 * Date
 */

import java.util.ArrayList;
public class  TeamRunner {

   
    public static void main(String[] args) {
        ArrayList<Team> eastRoundOne = new ArrayList<>();
        ArrayList<Team>eastRoundTwo = new ArrayList<>();
        ArrayList<Team>eastRoundThree = new ArrayList<>();
        ArrayList<Team>eastRoundFour = new ArrayList<>();
        ArrayList<Team> midRoundOne = new ArrayList<>();
        ArrayList<Team>midRoundTwo = new ArrayList<>();
        ArrayList<Team>midRoundThree = new ArrayList<>();
        ArrayList<Team>midRoundFour = new ArrayList<>();
        ArrayList<Team> westRoundOne = new ArrayList<>();
        ArrayList<Team>westRoundTwo = new ArrayList<>();
        ArrayList<Team>westRoundThree = new ArrayList<>();
        ArrayList<Team>westRoundFour = new ArrayList<>();
        ArrayList<Team> southRoundOne = new ArrayList<>();
        ArrayList<Team>southRoundTwo = new ArrayList<>();
        ArrayList<Team>southRoundThree = new ArrayList<>();
        ArrayList<Team>southRoundFour = new ArrayList<>();
        ArrayList<Team>finalFour = new ArrayList<>();
        ArrayList<Team>finalTwo = new ArrayList<>();
        
        eastRoundOne.add(new Team("Villanova", "", 1, 6));
        eastRoundOne.add(new Team("RadFord", "", 16, 0));
        eastRoundOne.add(new Team("Va. Tech", "", 8, 0));
        eastRoundOne.add(new Team("Alabama", "", 9, 1));
        eastRoundOne.add(new Team("W. Virginia", "", 5, 2));
        eastRoundOne.add(new Team("Murray St.", "", 12,0));
        eastRoundOne.add(new Team("Wichita St.", "", 4, 0));
        eastRoundOne.add(new Team("Marshall", "", 13, 1));
        eastRoundOne.add(new Team("Flordia", "", 6, 1));
        eastRoundOne.add(new Team("St. Bona.", "", 11, 0));
        eastRoundOne.add(new Team("Texas Tech", "", 3, 3));
        eastRoundOne.add(new Team("SF Austin", "", 14, 0));
        eastRoundOne.add(new Team("Arkansas", "", 7, 0));
        eastRoundOne.add(new Team("Butler", "", 10, 1));
        eastRoundOne.add(new Team("Purdue", "", 2, 2));
        eastRoundOne.add(new Team("CSFullerton", "", 15, 0));
        for(int x = 0; x < 16; x += 2){
            eastRoundTwo.add(checkWinner(eastRoundOne.get(x), eastRoundOne.get(x + 1)));
        }
        for(int x = 0; x < 8; x += 2){
            eastRoundThree.add(checkWinner(eastRoundTwo.get(x), eastRoundTwo.get(x + 1)));
        }
        for(int x = 0; x < 4; x += 2){
            eastRoundFour.add(checkWinner(eastRoundThree.get(x), eastRoundThree.get(x + 1)));
        }
        finalFour.add(checkWinner(eastRoundFour.get(0), eastRoundFour.get(1)));
        
        midRoundOne.add(new Team("Kansas", "", 1, 4));
        midRoundOne.add(new Team("Penn", "", 16, 0));
        midRoundOne.add(new Team("Seton Hall", "", 8, 1));
        midRoundOne.add(new Team("North Carolina St.", "", 9, 0));
        midRoundOne.add(new Team("Clemson", "", 5, 2));
        midRoundOne.add(new Team("New Mexico St.", "", 12, 0));
        midRoundOne.add(new Team("Auburn", "", 4, 1));
        midRoundOne.add(new Team("Col. of Charleston", "", 13, 0));
        midRoundOne.add(new Team("TCU", "", 6, 0));
        midRoundOne.add(new Team("Syracruse", "", 11, 2));
        midRoundOne.add(new Team("Michigan St.", "", 3, 1));
        midRoundOne.add(new Team("Bucknell", "", 14, 0));
        midRoundOne.add(new Team("Rhode Island", "", 7, 1));
        midRoundOne.add(new Team("Oklahoma", "", 10, 0));
        midRoundOne.add(new Team("Duke", "", 2, 3));
        midRoundOne.add(new Team("Iona", "", 15, 0));
         for(int x = 0; x < 16; x += 2){
            midRoundTwo.add(checkWinner(midRoundOne.get(x), midRoundOne.get(x + 1)));
        }
        for(int x = 0; x < 8; x += 2){
            midRoundThree.add(checkWinner(midRoundTwo.get(x), midRoundTwo.get(x + 1)));
        }
        for(int x = 0; x < 4; x += 2){
            midRoundFour.add(checkWinner(midRoundThree.get(x), midRoundThree.get(x + 1)));
        }
        finalFour.add(checkWinner(midRoundFour.get(0), midRoundFour.get(1)));
        
        southRoundOne.add(new Team("Virgina", "", 1, 0));
        southRoundOne.add(new Team("UMBC", "", 16, 1));
        southRoundOne.add(new Team("Creighton", "", 8, 0));
        southRoundOne.add(new Team("Kansas St.", "", 9, 3));
        southRoundOne.add(new Team("Kentucky", "", 5, 2));
        southRoundOne.add(new Team("Davidson", "", 12, 0));
        southRoundOne.add(new Team("Arisona", "", 4, 0));
        southRoundOne.add(new Team("Buffalo", "", 13, 1));
        southRoundOne.add(new Team("Miami[FL]", "", 6, 0));
        southRoundOne.add(new Team("Loyola[IL]", "", 11, 4));
        southRoundOne.add(new Team("Tennessee", "", 3, 1));
        southRoundOne.add(new Team("Wright St.", "", 14, 0));
        southRoundOne.add(new Team("Nevada", "", 7, 2));
        southRoundOne.add(new Team("Texas", "", 10, 0));
        southRoundOne.add(new Team("Cincinnati", "", 2, 1));
        southRoundOne.add(new Team("Georgia St.", "", 15, 0));
        for(int x = 0; x < 16; x += 2){
            southRoundTwo.add(checkWinner(southRoundOne.get(x), southRoundOne.get(x + 1)));
        }
        for(int x = 0; x < 8; x += 2){
            southRoundThree.add(checkWinner(southRoundTwo.get(x), southRoundTwo.get(x + 1)));
        }
        for(int x = 0; x < 4; x += 2){
            southRoundFour.add(checkWinner(southRoundThree.get(x), southRoundThree.get(x + 1)));
        }
        finalFour.add(checkWinner(southRoundFour.get(0), southRoundFour.get(1)));
        
        westRoundOne.add(new Team("Xavier", "", 1, 1));
        westRoundOne.add(new Team("Texas Southern", "", 16, 0));
        westRoundOne.add(new Team("Missouri", "", 8, 0));
        westRoundOne.add(new Team("Flordia St.", "", 9, 3));
        westRoundOne.add(new Team("Ohio St.", "", 5, 1));
        westRoundOne.add(new Team("South Dakota St.", "", 12, 0));
        westRoundOne.add(new Team("Gonzaga", "", 4, 2));
        westRoundOne.add(new Team("UNC Greensboro", "", 13, 0));
        westRoundOne.add(new Team("Houston", "", 6, 1));
        westRoundOne.add(new Team("San Diego St.", "", 11, 0));
        westRoundOne.add(new Team("Michigan", "", 3, 5));
        westRoundOne.add(new Team("Montana", "", 14, 0));
        westRoundOne.add(new Team("Texas A&M", "", 7, 2));
        westRoundOne.add(new Team("Providence", "", 10, 0));
        westRoundOne.add(new Team("North Carolina", "", 2, 1));
        westRoundOne.add(new Team("Lipscomb", "", 15, 0));
        for(int x = 0; x < 16; x += 2){
            westRoundTwo.add(checkWinner(westRoundOne.get(x), westRoundOne.get(x + 1)));
        }
        for(int x = 0; x < 8; x += 2){
            westRoundThree.add(checkWinner(westRoundTwo.get(x), westRoundTwo.get(x + 1)));
        }
        for(int x = 0; x < 4; x += 2){
            westRoundFour.add(checkWinner(westRoundThree.get(x), westRoundThree.get(x + 1)));
        }
        finalFour.add(checkWinner(westRoundFour.get(0), westRoundFour.get(1)));
        
        for(int x = 0; x < 4; x += 2){
            finalTwo.add(checkWinner(finalFour.get(x), finalFour.get(x + 1)));
        }
        System.out.println("The winner is " + checkWinner(finalTwo.get(0), finalTwo.get(1)).getName());
        
    }
  public static Team checkWinner(Team one, Team two){
      if(one.getPowerRanking() > two.getPowerRanking()){
          return one;
      }else{
          return two;
      }
  }
}
