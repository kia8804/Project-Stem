package ultimate.frisbee;

import java.util.ArrayList;

public class UltimateTeam{
    
    private ArrayList<UltimatePlayer> players;
    private ArrayList<Coach> coaches;
    
    public UltimateTeam(ArrayList<UltimatePlayer> players, ArrayList<Coach> coaches)
    {
        this.players = players;
        this.coaches = coaches;
    }
    
    public String getCutters()
    {
        String s = "";
        
        for(UltimatePlayer player : players)
        {
          if(player.getPosition().equals("cutter")) s+= player.toString()+"\n";
        }

        return s;
    }
    
    public String getHandlers()
    {
        String s = "";
        
        for(UltimatePlayer player : players)
        {
          if(player.getPosition().equals("handler")) s+= player.toString()+"\n";
        }
        
        return s;    
    }
    
    public String toString()
    {
        String s = "";
        
        s+= "COACHES\n";
        for(Coach coach : this.coaches)
        {
            s += coach.toString()+"\n";
        }
        
        s+= "\nPLAYERS\n";
        for(UltimatePlayer player : this.players)
        {
            s += player.toString()+"\n";
        }
        
        return s;
    }
}
