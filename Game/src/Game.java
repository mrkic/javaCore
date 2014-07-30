
public class Game {
    private Player playerOne;
    private Player playerTwo;
    private Board board;
    public Game(Player playerOne, Player playerTwo, Board board){
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.board = board;
    }
    public boolean isOver(){
        boolean gameFinish = false;
        if(board.isFulled() == true || this.haveWinner() ==true)
        {
            gameFinish=true;
        }
        return gameFinish;
    }
    public Player someoneWins(){
        int counter =0;
        int i;      
        // player One
        for(i=0; i<board.size; i++){
           if(board.getField(i, i).getValue() == playerOne.getSign())
               counter++;
        }
        if(counter == 3)
            return playerOne;
        counter = 0;
        for(i=board.size-1; i>=0; i--){
            int j=board.size-1 - i;
            if(board.getField(i, j).getValue() == playerOne.getSign())
                counter++;
        }
        
        
        if(counter == 3)
            return playerOne;
        counter = 0;
        for(i=0; i<board.size; i++){
            for(int j=0; j<board.size; j++){
                if(board.getField(j, i).getValue() == playerOne.getSign()){
                    counter++;
                }
                if(counter == 3)
                    return playerOne;
                
            }
            counter =0;
        }
        for(i=0; i<board.size; i++){
            for(int j=0; j<board.size; j++){
                if(board.getField(i, j).getValue() == playerOne.getSign()){
                    counter++;
                }
                if(counter == 3)
                    return playerOne;
                
            }   
            counter =0;
        }
        
        // player Two
        
        for(i=0; i<board.size; i++){
            if(board.getField(i, i).getValue() == playerTwo.getSign())
                counter++;
         }
         if(counter == 3)
             return playerTwo;
         
         counter = 0;
         
         for(i=board.size-1; i>=0; i--){
             int j=board.size-1 - i;
             if(board.getField(i, j).getValue() == playerTwo.getSign())
                 counter++;
         }
         if(counter == 3)
             return playerTwo;
         
         counter = 0;
         
         for(i=0; i<board.size; i++){
             for(int j=0; j<board.size; j++){
                 if(board.getField(j, i).getValue() == playerTwo.getSign()){
                     counter++;
                 }
                 if(counter == 3)
                     return playerTwo;
                 
             }
             counter =0;
         }
         
         for(i=0; i<board.size; i++){
             for(int j=0; j<board.size; j++){
                 if(board.getField(i, j).getValue() == playerTwo.getSign()){
                     counter++;
                 }
                 if(counter == 3)
                     return playerTwo;
                 
             }   
             counter =0;
         }
         
         return null;
        
    }
    
    public boolean haveWinner(){
        if(this.someoneWins() == null)
            return false;
        else{
        return true;
        }
    }
    public void getWinner(Player firstPlayer, Player secondPlayer) {
        // TODO Auto-generated method stub
        if(this.someoneWins() == null){            
            System.out.println("--- It's a Draw! ---");
        }
        else{
            if(this.someoneWins() == firstPlayer){
                System.out.println("--- The winner is First player! ---");
            }
            if(this.someoneWins() == secondPlayer){
                System.out.println("--- The winner is Second player! ---");
            }
        }
        
    }
    
    
    
}
