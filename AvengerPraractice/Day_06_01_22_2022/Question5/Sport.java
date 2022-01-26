package Day_06_01_22_2022.Question5;

public class Sport {
    String name;
    int numOfPlayers;
    boolean teamBased;

    public void makeSport (String name, int players, boolean teams){// method NOT constructor
        this.name = name;
        numOfPlayers = players;// no need to use this. because we put a data (players)
        teamBased = teams;
    }

    public String toString(){
        String msg = "The sport is " + name + " and has " +
                numOfPlayers + "players total" ;
        if(teamBased){
            msg += "divided into teams";
        } else {
            msg += "but there is no teams";
        }
        return msg;
    }
}
