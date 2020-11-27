/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupeproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroupEproject {
/** Task 1
 *
 * @author Bekezhan
 */    
    static void bekezhanMethod(){
        Scanner userKB = new Scanner(System.in);
        
            
            System.out.println("What is your name?");
            while(userKB.hasNextInt()){
                
                System.err.println("It is not a name, please try again!");
                userKB.next();
            }
            
            String name = userKB.next();
            System.out.println("What is your surname?");
            while(userKB.hasNextInt()){
                
                userKB.next();
                System.err.println("It is not a surname, please try again!");
              
            }
            String surname = userKB.next();
            System.out.println("Hey " + name + " " + surname + ", nice to meet you!");
            
        }
/** Task 2
 * @author Kevin Leira 2020364
 */
    static void kevinLeiraMethod(){
        // Scanner for readign input 
        Scanner myKb = new Scanner(System.in);
        int keyInput; 
        System.out.println("Hey! How old are you?"); //Asks the user for their age
        keyInput = myKb.nextInt();

        if (keyInput >= 0 && keyInput <= 17){ //For integer between this range System will print "too young"
            System.out.println("You're too young!");}
        if ((keyInput >= 18) && (keyInput <=100)){
            System.out.println("WOOOWW! Your age is " + keyInput + " That's very nice");} //For input between this range System will print a messsage an age introduced     
        else { // Anything else is considered invalid!!!
            System.err.println("I'm so sorry but this is not valid");}
}
    
    
/** Task 3
 * @author Shivam Kumar 2020359
 */

    static void shivamKumarMethod(){
        List < String > colours1 = new ArrayList < > ();

        colours1.add("blue");
        colours1.add("red");
        colours1.add("green");

        List < String > colours2 = new ArrayList < > ();

        colours2.add("yellow");
        colours2.add("pink");
        colours2.add("brown");

        List < String > colours3 = new ArrayList < > ();
        colours3.add("white");
        colours3.add("orange");

        colours3.addAll(colours1);
        colours3.addAll(2, colours2);

        for (String col: colours3) {

            System.out.println(col);
        }
    }
/** Task 4
 *
 * @author FernandoValle
 */
    static void fernandoValleMethod(){
        String placeOfBirth;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your place of birth: ");
        placeOfBirth = scan.nextLine();
        System.out.println(placeOfBirth+" Wow realy? I have friends there!");
  }    

/** Task 5
 * 
 * @author Leisly Pino 2020303
 */    
    static void leislyPinoMethod(){
        
        // 5) Ask user his email (and  check if it is valid ( Should have ‘@’ ) if not output ( “wrong”) 
        Scanner myKB = new Scanner(System.in);
        String email;
        System.out.println("What is your e-mail? ");
        email = myKB.nextLine();
        int length = email.length();
        char value;
   
        for(char i = 0; i < length; i++) {
            value = email.charAt(i);
            
            if(value == '@' && i == 0){
            System.out.println("Your e-mail is wrong");
            break; }
            if(value == '@'){
            System.out.println("Your e-mail is correct");
            break; }
            else if(i == length-1){
            System.out.println("Your e-mail is wrong");	
            break;}
        }
    }

/** Task 6
 *
 * @author xiaohui weng2020387
 */

    static void xiaoHuiMethod(){
        System.out.println("Do you like this CA? (enter yes or no)");
        Scanner myReader = new Scanner(System.in);
        String answer;
        
        answer = myReader.nextLine();
        if(answer.equals("yes")){
            System.out.println(" That’s good");
        }
        else if(answer.equals("no")){
            System.out.println("That's bad");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        bekezhanMethod(); // Task 1
        
        kevinLeiraMethod();// Task 2
        shivamKumarMethod(); // Task 3
        fernandoValleMethod(); // Task 4
        leislyPinoMethod(); // Task 5
        xiaoHuiMethod(); // Task 6
        System.out.println("test,new changed! ");
        // Task 7 
    }
}
