import java.util.Random;

public class votingMachine {
    int labour = 0;
    int conservative = 0;
    int totalNoofVotes;
    public void clear(int total){
        labour = 0;
        conservative = 0;
    }
    public int labour(int labour, int vote){
        if(vote == 0){
            this.labour = labour + 1;
        }
        return labour;
    }
    public int conservative(int conservative, int vote){
        if (vote == 1){
            int randomvote= (int)(Math.random()*(50));
        }
        return conservative;
    }
    public int totalNoofVotes(int labour,int conservative, int total){
        total = labour + conservative;
        return total;
    }


}
