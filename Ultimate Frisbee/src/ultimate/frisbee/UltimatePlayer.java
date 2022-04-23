package ultimate.frisbee;


public class UltimatePlayer extends Person
{
   
    private int jerseyNumber;
    private String position;
    private static int cnt = 0;
    
    public UltimatePlayer(String firstName, String lastName, String position)
    {
        super(firstName, lastName);
        if(position.equals("handler") || position.equals("cutter")) this.position = position;
        else this.position = "handler";
        this.cnt++;
        this.jerseyNumber = cnt;
    }
    
    public String getPosition()
    {
        return position;
    }
    
    public int throwDisc(int pow)
    {
        if(pow < 1) pow = 1;
        if(pow > 10) pow = 10;
        int dist = pow*4;
        
        return dist;
    }
    
    public String toString()
    {
        return super.toString() + "\n   Jersey #: " + this.jerseyNumber + "\n   Position: " + this.position;
    }
    
}
