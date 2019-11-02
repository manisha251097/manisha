class Solution {
	public Team[] sort(Team[] teams) {
		// your code goes here
		//  The teams in the Team array are sorted
		for (int i = 0; i < teams.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < teams.length; j++) {
				if (teams[j].compareTo(teams[min]) == 1) {
					min = j;
				}
			}
			Team temp = teams[i];
			teams[i] = teams[min];
			teams[min] = temp;
		}
		return teams;
	}
}

class Team implements Comparable<Team> {
	String teamName;
	int noOfWins;
	int noOfLosses;
	int noOfDraws;

	Team(String name, int wins, int losses, int draws) {
		teamName = name;
		noOfDraws = draws;
		noOfWins = wins;
		noOfLosses = losses;
	}

	public String toString() {
		                        // retruns all the attributes as a string but appending with ", "
		return "";
	}

	/**
	 * 
	 * Two teams wins, losses, draws are compared and returns 1 or -1
	 * if none of the condition satisfied it returns 0
	 * 
	 */
	public int compareTo(Team that) {
		if (this.noOfWins > that.noOfWins) {
			return 1;
		} else if (this.noOfWins < that.noOfWins) {
			return -1;
		} else {
			if (this.noOfLosses > that.noOfLosses) {
				return -1;
			} else if (this.noOfLosses < that.noOfLosses) {
				return 1;
			} else {
				if (this.noOfDraws > that.noOfDraws) {
					return 1;
				} else if (this.noOfDraws < that.noOfDraws) {
					return -1;
				}
			}
		}
		return 0;
	}
}