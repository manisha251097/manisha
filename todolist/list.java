class list {
    String Taskname;
task description, due date, status of each task.

    list[] tasks;

    int friendsCount;

    list(){
        this.myFriends = new Contact[500];
        this.friendsCount=0;
    }
 
    /**
     * The addContact method takes in a parameter of type contact object and 
     * adds this to the contact list.
     * @param contact, to be added.
     */
    public void addContact(Contact contact) {
        //  Your code goes here....
        myFriends[friendsCount]=contact;
        friendsCount++;

        //  Nothing to be returned... As this method is void...
    }
 
    /**
     * This method search for the contact based on the name of your friend and gives the
     * first occurance of the contact in your friends list.
     * @param searchName, the name of the contact to be searched in the friends list.
     * @return the contact of the friend, null otherwise.
     */
    public Contact searchContact(String searchName) {
        //  Your code goes here....
        for(int i=0;i< friendsCount;i++){
            if(myFriends[i].getName()== searchName){
                return myFriends[i];
            }
        }
        return null;
    }

    /**
     * This method search for the contact based on the email of your friend 
     * and gives the first occurance of the contact in your friends list.
     * @param searchName, the email of the contact to be searched in the friends list.
     * @return the contact of the friend, null otherwise.
     */
    public Contact searchContactByEmail(String email) {
        //  Your code goes here....
        for(int i=0;i< friendsCount;i++){
            if(myFriends[i].getEmail()== email){
                return myFriends[i];
            }
        }
        return null;
    }

    /**
     * This method deletes the contact based on the name of your friend and returns
     * true on success and false if failure in deleting the contact.
     * @param searchName, the name of the contact to be searched in the friends list.
     * @return true if contact has been removed successfully and false otherwise.
     */
    public boolean deleteContact(String searchName) {
        //  Your code goes here....

        for(int i = 0; i < friendsCount; i++){

            if(myFriends[i].getName() == searchName) {

                for(int j = i+1; j < friendsCount; j++){

                    myFriends[i] = myFriends[j];
                    i++;
                }
                myFriends[friendsCount] = null;
                friendsCount--;
                return true;
            }
        }
        return false;
    }

    // Any additional method that you want to implement by yourself.

    //  Happy Coding... Have Fun.....
    
}

