public class Patron{
    private String name;
    private String mobileNumber;
	public String movie;
    public String dateAndTime;
    public String [] seatsBooked;

	public String getMovie() {
		return this.movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public String getDateAndTime() {
		return this.dateAndTime;
	}

	public void setDateAndTime(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public String [] getSeatsBooked() {
		return this.seatsBooked;
	}

	public void setSeatsBooked(String [] seatsBooked) {
		this.seatsBooked = seatsBooked;
	}



    public Patron(String name, String mobileNumber){
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


}