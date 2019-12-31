package Default;

import coursework.Objects.*;
import coursework.Users.*;
import java.io.*;

public class FileIO {                                                                                               //Class for everything File IO related.  
    public static void writeUsersToFile(User[] _userArray) throws IOException{                                      //Writes the array of users into a file.
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Users.txt"));
        outputStream.writeObject(_userArray);       
    }        
    public static User[] readFile() throws IOException, ClassNotFoundException{                                     //Reads the array of users from a file.   
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Users.txt"));
        User userArray[] = (User[]) inputStream.readObject();                                                       //Typecasting
        return userArray;
    }   
    public static void displayArray(){
        User[] output = null;
        try{
            output = FileIO.readFile();
        }catch(Exception e){
            System.out.println("Error! Flag DEFI! " + e);
        }
        for(int i = 0; i < output.length; i++){
            System.out.println(output[i].getUniqueID() + ":" + output[i].getPassword()
            + ":" + output[i].getFirstName() + ":" + output[i].getLastName());
        }
    }
    public static void addUserToFile(User _user){
        User userArray[] = null;
        boolean hasNull = false;
        try{
            userArray = FileIO.readFile();
        }catch(Exception e){
            System.out.println(e);
        }
        
        for(int i = 0; i < userArray.length; i++){
            if(userArray[i] == null){//if there is space
                userArray[i] = _user;
                hasNull = true;
                break;
            }else{}
        }
        
        if(hasNull == false){//if there was no space
            userArray = Functions.resizeArray(userArray, userArray.length + 1);
            userArray[userArray.length - 1] = _user;
        }
        
        try{
            FileIO.writeUsersToFile(userArray);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static Rating[] readRatings() throws IOException, ClassNotFoundException{
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Ratings.txt"));
        Rating ratingArray[] = (Rating[]) inputStream.readObject();
        return ratingArray;
    }
    public static void writeRatings(Rating[] _ratingArray) throws IOException{                                      //Writes the array of users into a file.
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Ratings.txt"));
        outputStream.writeObject(_ratingArray);       
    }  
    public static void displayRatings(){
        Rating ratings[] =  null;
        try{
            ratings = FileIO.readRatings();
        }catch(Exception e){
            System.out.println(e);
        }
        for(int i = 0; i < ratings.length; i++){
            System.out.println(ratings[i].getDoctorID() + ":" + ratings[i].getPatientID() 
                    + ":" + ratings[i].getRatingValue() + ":" + ratings[i].getMessage());
        }
    
    }
    public static void addRating(Rating _rating){
        Rating ratingArray[] = null;
        boolean hasNull = false;
        try{
            ratingArray = FileIO.readRatings();
        }catch(Exception e){
            System.out.println(e);
        }
        
        for(int i = 0; i < ratingArray.length; i++){
            if(ratingArray[i] == null){//if there is space
                ratingArray[i] = _rating;
                hasNull = true;
                break;
            }else{}
        }
        
        if(hasNull == false){//if there was no space
            ratingArray = Functions.resizeRatingArray(ratingArray, ratingArray.length + 1);
            ratingArray[ratingArray.length - 1] = _rating;
        }
        try{
            FileIO.writeRatings(ratingArray);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static Feedback[] readFeedback() throws IOException, ClassNotFoundException{
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Feedback.txt"));
        Feedback feedbackArray[] = (Feedback[]) inputStream.readObject();
        return feedbackArray;
    }
    public static void writeFeedback(Feedback[] _feedbackArray) throws IOException{
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Feedback.txt"));
        outputStream.writeObject(_feedbackArray);   
    }
    public static void displayFeedback(){
        Feedback feedbacks[] =  null;
        try{
            feedbacks = FileIO.readFeedback();
        }catch(Exception e){
            System.out.println(e);
        }
        for(int i = 0; i < feedbacks.length; i++){
            System.out.println(feedbacks[i].getDoctorID() + ":" + feedbacks[i].getPatientID() 
                    + ":" + feedbacks[i].getAdminID() + ":" + feedbacks[i].getFeedback());
        }
    }
    public static void addFeedback(Feedback _feedback){
        Feedback feedbackArray[] = null;
        boolean hasNull = false;
        try{
            feedbackArray = FileIO.readFeedback();
        }catch(Exception e){
            System.out.println(e);
        }
        for(int i = 0; i < feedbackArray.length; i++){
            if(feedbackArray[i] == null){
                feedbackArray[i] = _feedback;
                hasNull = true;
                break;
            }
        }
        if(hasNull == false){
            feedbackArray = Functions.resizeFeedback(feedbackArray, feedbackArray.length + 1);
            feedbackArray[feedbackArray.length - 1] = _feedback;
        }
        try{
            FileIO.writeFeedback(feedbackArray);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
