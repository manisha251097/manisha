import java.util.*;

public class Show{
    private String movieName;
    private String dateTime;
	private String [] seatNumbers;
	public String name1;
	public String phone;

	public String getName1() {
		return this.name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMovieName() {
		return this.movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String [] getSeatNumbers() {
		return this.seatNumbers;
	}

	public void setSeatNumbers(String [] seatNumbers) {
		this.seatNumbers = seatNumbers;
	}


    public Show(String movieName, String dateTime, String [] seatNumbers){
        this.movieName = movieName;
        this.dateTime = dateTime;
        this.seatNumbers = seatNumbers;
	}
	

	public void printTickets(Patron p){
		if(p != null){
			System.out.println("name: " + p.getName()+" phone number: " + p.getMobileNumber()+" movie: "+ p.getMovie() + " Date and time: "+ p.getDateAndTime()+" seats available: "+ Arrays.toString(p.getSeatsBooked()));
		}
			
		else{
			System.out.println("no tickets booked");
		}
	}


	

}