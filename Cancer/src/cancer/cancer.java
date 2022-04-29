package cancer;

public class cancer {
    
    public static String[][] grid;
    public static int cancerSize;
    
    public static void floodFill(int r, int c)
    {
        
        if(grid[r][c].equals("-"))
        {
            grid[r][c] = " ";
            floodFill(r+1, c);
            floodFill(r-1, c);
            floodFill(r, c+1);
            floodFill(r, c-1);
            floodFill(r+1, c+1);
            floodFill(r+1, c-1);
            floodFill(r-1, c+1);
            floodFill(r-1, c-1);
        }
    }
    
    public static void visualize()
    {
        for(int i = 1; i < 16; i++)
        {
            for(int j = 1; j < 16; j++)
            {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
    
    
    public static void main(String[] args) {
        grid = new String[17][17];
        cancerSize = 0;
        
        for(int i = 0; i < 17; i++)
        {
            for(int j = 0; j < 17; j++)
            {
                grid[i][j] = " ";
            }
        }
        
        for(int i = 0; i < 150; i++)
        {
            int row = (int)(Math.random()*15 +1);
            int col = (int)(Math.random()*15 +1);
            grid[row][col] = "+";
        }
         
        for(int i = 1; i < 16; i++)
        {
            for(int j = 1; j < 16; j++)
            {
                if(grid[i][j].equals(" ")) grid[i][j] = "-";
            }
        }
        
        System.out.println("Initial:");
        visualize();
        
        for(int i = 1; i < 16; i++)
        {
            for(int j = 1; j < 16; j++)
            {
                if(grid[i][j].equals("-"))
                {
                    floodFill(i, j);
                    cancerSize++;
                }
            }
        }
        
        System.out.println("\n\nThere are " + cancerSize + " cancer spots");
        System.out.println("New:");
        
        visualize();
    }

}