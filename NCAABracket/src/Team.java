/**
 * Richard Fitzgerald
 * 2/21/19
 * 
 */
import java.util.ArrayList;
public class Team {
    private String name;
    private String mascot;
    private int seed;
    private String region;
    private int powerRanking;

    public Team(String na, String mas, int sd, int pow){
        name = na;
        mascot = mas;
        seed = sd;
        powerRanking = pow;
    }
    
   public int getPowerRanking(){
    return powerRanking;
}
    
  public String getName(){
      return name;
  }
    
}
