import java.util.*;

public class BookYourShow{
    Show [] show;
    int numberOfShows;

    public BookYourShow(){
        this.show = new Show[500];
        this.numberOfShows = 0;
    }
    public void addAShow(Show show){
        this.show[numberOfShows] = show;
        numberOfShows++;
    }
    public String toStrings(Show result){
        return "movie: "+ result.getMovieName()+" date and time: "+ result.getDateTime()+ " seats booked: "+ Arrays.toString(result.getSeatNumbers()); 
    }
    public Show getAShow(String movieName, String dateTime){
        for(int i =0; i<numberOfShows; i++){
    if(show[i].getMovieName().equals(movieName)){
    if(show[i].getDateTime().equals(dateTime)){
    return show[i];
                } 
            }
        }
        return null;
    }
}