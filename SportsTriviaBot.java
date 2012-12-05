/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class SportsTriviaBot {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args){ 
       ArrayList<String> greetings = new ArrayList<>();
       ArrayList<String> teams = new ArrayList<>();
       ArrayList<String> celtictrivia = new ArrayList<>();
       ArrayList<String> latrivia = new ArrayList<>();
       ArrayList<String> miamitrivia = new ArrayList<>();
       ArrayList<String> sftrivia = new ArrayList<>();
       ArrayList<String> nyytrivia = new ArrayList<>();
       ArrayList<String> tortrivia = new ArrayList<>();
       ArrayList<String> ninerstrivia = new ArrayList<>();
       ArrayList<String> nygtrivia = new ArrayList<>();
       ArrayList<String> patstrivia = new ArrayList<>();
       ArrayList<String> vantrivia = new ArrayList<>();
       ArrayList<String> pitttrivia = new ArrayList<>();
       ArrayList<String> mltrivia = new ArrayList<>();
       ArrayList<String> triviaanswers = new ArrayList<>();
       
       greetings.add("Hey");
       greetings.add("Hello!");
       greetings.add("Hi!");
       teams.add("Boston Celtics");
       teams.add("Los Angeles Lakers");
       teams.add("Miami Heat");
       teams.add("San Fransisco Giants");
       teams.add("New York Yankees");
       teams.add("Toronto Blue Jays");
       teams.add("San Fransisco 49ers");
       teams.add("New York Giants");
       teams.add("New England Patriots");
       teams.add("Vancouver Canucks");
       teams.add("Pittsburgh Penguins");
       teams.add("Toronto Maple Leafs");
       celtictrivia.add("How many NBA Championships have they won?");
       celtictrivia.add("Who is #9 on their team?");
       celtictrivia.add("Who is #34 on their team?");
       latrivia.add("Who holds the franchise record for points scored?");
       latrivia.add("Who was the last Laker to win 6th man of the year?");
       latrivia.add("Which famous actor is always in courtside attendance?");
       miamitrivia.add("LeBron James, Dwayne Wade and which player make up Miami's Big Three?");
       miamitrivia.add("A recent addition, Ray Allen played for which team before moving to Miami?");
       miamitrivia.add("Prior to last season what year was Miami's last championship?");
       sftrivia.add("Who pitched a perfect game last season?");
       sftrivia.add("Who did the Giants beat in the World Series last season?");
       sftrivia.add("What is Pablo Sandoval's nickname?");
       nyytrivia.add("Which Japanese all star did the Yankees trade for last season?");
       nyytrivia.add("Which team is considered the Yankees rival?");
       nyytrivia.add("Why do the Yankees suck so much?");
       tortrivia.add("Which team did Toronto recently make a 12 player trade with?");
       tortrivia.add("What city do the Toronto Blue Jays play in?");
       tortrivia.add("What was the other Canadian team to play in the league aside from Toronto?");
       ninerstrivia.add("Who is the coach of the 49ers");
       ninerstrivia.add("Who did the 49ers lose to in last season's NFC Championship?");
       ninerstrivia.add("What does a duck smoke?");
       nygtrivia.add("Which player is known for his Salsa Dance after scoring a touchdown?");
       nygtrivia.add("Which Manning is the quarterback for the Giants?");
       nygtrivia.add("What is the primary color of the Giants jersey?");
       patstrivia.add("Who is the coach of the Patriots?");
       patstrivia.add("Who is the quarterback of the Patriots?");
       patstrivia.add("Who did the Patriots lose to in the NFL Title Game last season?");
       vantrivia.add("Who is #22 on the Canucks?");
       vantrivia.add("Who is #17 on the Canucks?");
       vantrivia.add("Who did the Canucks lose to in last years playoffs?");
       pitttrivia.add("Which player is nicknamed Sid the Kid?");
       pitttrivia.add("What # is Evgeni Malkin");
       pitttrivia.add("Which team beat Pittsburgh in last season's playoffs?");
       mltrivia.add("Who is the GM of the Toronto Maple Leafs");
       mltrivia.add("What country does Phil Kessel play for in international play?");
       mltrivia.add("Toronto is part of the group of original teams when the league first opened known as what?");
       triviaanswers.add("17");
       triviaanswers.add("Rajon Rondo");
       triviaanswers.add("Paul Pierce");
       triviaanswers.add("Kobe Bryant");
       triviaanswers.add("Lamar Odom");
       triviaanswers.add("Jack Nicholson");
       triviaanswers.add("Chris Bosh");
       triviaanswers.add("Boston Celtics");
       triviaanswers.add("2005");
       triviaanswers.add("Matt Cain");
       triviaanswers.add("Detroit Tigers");
       triviaanswers.add("Panda");
       triviaanswers.add("Ichiro");
       triviaanswers.add("Boston Red Sox");
       triviaanswers.add("Because they do");
       triviaanswers.add("Miami Marlins");
       triviaanswers.add("Toronto");
       triviaanswers.add("Montreal Expos");
       triviaanswers.add("Jim Harbaugh");
       triviaanswers.add("New York Giants");
       triviaanswers.add("Quack");
       triviaanswers.add("Victor Cruz");
       triviaanswers.add("Eli");
       triviaanswers.add("Blue");
       triviaanswers.add("Bill Belichek");
       triviaanswers.add("Tom Brady");
       triviaanswers.add("New York Giants");
       triviaanswers.add("Daniel Sedin");
       triviaanswers.add("Ryan Kesler");
       triviaanswers.add("Los Angeles Kings");
       triviaanswers.add("Sidney Crosby");
       triviaanswers.add("71");
       triviaanswers.add("Philadelphia Flyers");
       triviaanswers.add("Brian Burke");
       triviaanswers.add("USA");
       triviaanswers.add("Original Six");
       
       String botname;
       String username;
       int topic = 0;
       
       Scanner name = new Scanner (System.in);
       
       System.out.println("What is my name?");
       botname = name.nextLine();
       
       System.out.println("What is your name?");
       username = name.nextLine();
       
       Random greet = new Random();
       int x = greet.nextInt(3);
       System.out.println(botname +": " + greetings.get(x));
       
       Scanner speak = new Scanner (System.in);
       String talk = speak.nextLine();
       System.out.println(username+ ": " +talk);
       
       while(topic == 0){
       System.out.println(botname + ": What is your favourite sport?");
       
       Scanner speak2 = new Scanner (System.in);
       String talk2 = speak2.nextLine();
       System.out.println(username+ ": " +talk2);
       if (talk2.equals("change")){
                     topic = 0;
                 }
       
       switch (talk2) {
            case "Basketball":
                topic = 1;
                break;
            case "Baseball":
                topic = 2;
                break;
            case "Football":
                topic = 3;
                break;
            case "Hockey":
                topic = 4;
                break;
        }
       
      
       if (topic == 1 || topic == 2 || topic == 3 || topic == 4) {
            System.out.println(botname + ": What is your favourite team?");
                                              
                
       }
       else {
            System.out.println(botname + ": I don't recognize that sport");
           
                  
                                     }
                                  
       while (topic == 1) { //basketball
           Scanner speak3 = new Scanner (System.in);
           String talk3 = speak3.nextLine();
           System.out.println(username+ ": " +talk3);
           if (talk3.equals("change")){
                     topic = 0;
                 }
           
          if (talk3.equals(teams.get(0)) || (talk3.equals(teams.get(1))) || (talk3.equals(teams.get(2))))
       {
            System.out.println(botname + ": I love the " +talk3 + " also!");
            
            Random trivia = new Random();
            int z = trivia.nextInt(3);
          
           
           if (talk3.equals(teams.get(0))) { //Boston Celtics
            System.out.println(botname +": " + celtictrivia.get(z)); 
            topic = 5; //answers
           }
           else if (talk3.equals(teams.get(1))) { //La Lakers
             System.out.println(botname +": " + latrivia.get(z));
             topic = 6; //answers
           }
           else if (talk3.equals(teams.get(2))) { //Miami Heat
             System.out.println(botname +": " + miamitrivia.get(z));
             topic = 7; //answers
           }
       
           while (topic == 5) {
               Scanner speak7 = new Scanner(System.in);
               String talk7 = speak7.nextLine();
               if (talk7.equals("change")){
                     topic = 0;
                 }
               else if (z == 0) {
                   if (talk7.equals(triviaanswers.get(0))) {
                       System.out.println(botname + ": Correct " + triviaanswers.get(0));
                   
                       topic = 1;
                       System.out.println(botname + ": You are one smart person! Give me another team you like!");
                   } else {
                       System.out.println(botname + ": Incorrect try again");
                       topic = 5;

                   }}
                 else if (z == 1) {
                   if (talk7.equals(triviaanswers.get(1))) {
                       System.out.println(botname + ": Correct " + triviaanswers.get(1));
                       topic = 1;
                       System.out.println(botname + ": Woah your good at this! Another team?");
                   } else {
                       System.out.println(botname + ": Incorrect, try again");
                       topic = 5;

                   }}
                   else if (z == 2) {
                   if (talk7.equals(triviaanswers.get(2))) {
                       System.out.println(botname + ": Correct " + triviaanswers.get(2));
                       topic = 1;
                       System.out.println(botname + ": You are a smart cookie! Another team name please?");
                   } else {
                       System.out.println(botname + ": Incorrect, try again");
                       topic = 5;
                   }
               }
        else {
           System.out.println(botname + ": I do not know what you are talking about kid!");
           
       }}
              while (topic == 6){
              Scanner speak8 = new Scanner (System.in);
              String talk8 = speak8.nextLine();
              if (talk8.equals("change")){
                     topic = 0;
                 }
               else  if (z == 0){
                    if(talk8.equals(triviaanswers.get(3))){
                        System.out.println(botname +": Correct " + triviaanswers.get(3));
                        
                        topic = 1;
                        System.out.println(botname +": You beat me this time, do you know any other teams?");
                    }
                    else {
                        System.out.println(botname +": Incorrect, try again");
                        topic = 6;
                    } }
                 
             
          
                 else if (z == 1){
                    if(talk8.equals(triviaanswers.get(4))){
                        System.out.println(botname +": Correct " + triviaanswers.get(4));
                        topic = 1;
                        System.out.println(botname +": Wow your good at trivia! Name me another team!");
                    }
                    else {
                        System.out.println(botname +": Incorrect, try again");
                        topic = 6;
                    }
                 }
             
          
                 else if (z == 2){
                    if(talk8.equals(triviaanswers.get(5))){
                        System.out.println(botname +": Correct " + triviaanswers.get(5));
                        topic = 1;
                        System.out.println(botname +": Do you enjoy winning at trivia? Pick another team.");
                    }
                    else {
                        System.out.println(botname +": Incorrect, try again");
                        topic = 5;
                    }
                 }
                  else {
                    System.out.println(botname + ": I don't know that team, pick another one");
                 }}
                 
                 
                 while (topic == 7){
                 Scanner speak9 = new Scanner (System.in);
                 String talk9 = speak9.nextLine();
                 if (talk9.equals("change")){
                     topic = 0;
                 }
                 else if (z == 0){
                    if(talk9.equals(triviaanswers.get(6))){
                        System.out.println(botname +": Correct " + triviaanswers.get(6));
                        
                        topic = 1;
                        System.out.println(botname +": We've got a genius in the house!!! Give me another team...I dare you.");
                    }
                    else {
                        System.out.println(botname +": Incorrect, try again");
                        topic = 7;
                    }
                 }
             
          
                 else if (z == 1){
                    if(talk9.equals(triviaanswers.get(7))){
                        System.out.println(botname +": Correct " + triviaanswers.get(7));
                        topic = 1;
                        System.out.println(botname +": How did you know that....got another team for me?");
                    }
                    else {
                        System.out.println(botname +": Incorrect, try again");
                        topic = 7;
                    }
                 }
             
          
                 else if (z == 2){
                    if(talk9.equals(triviaanswers.get(8))){
                        System.out.println(botname +": Correct " + triviaanswers.get(8));
                        topic = 1;
                        System.out.println(botname +": You must be using google...or reading my source code hahahaha...tell me another team!");
                    }
                    else {
                        System.out.println(botname +": Incorrect, try again");
                        topic = 7;
                    }
                 }}}
                  else {
                    System.out.println(botname + ": I don't like that team, pick another one!");
                 }}
                 
                 
                  while (topic == 2) { //baseball
                    Scanner basescan = new Scanner (System.in);
                    String baseballtalk = basescan.nextLine();
                    System.out.println(username+ ": " +baseballtalk);
                    if (baseballtalk.equals("change")){
                     topic = 0;
                 }
                 
           
            if (baseballtalk.equals(teams.get(3)) || (baseballtalk.equals(teams.get(4))) || (baseballtalk.equals(teams.get(5))))
       {
            System.out.println(botname + ": I don't like baseball very much but here's a trivia question!");
            
            Random basetrivia = new Random();
            int base = basetrivia.nextInt(3);
          
           
           if (baseballtalk.equals(teams.get(3))) { //Giants
            System.out.println(botname +": " + sftrivia.get(base)); 
            topic = 8; //answers
           }
           else if (baseballtalk.equals(teams.get(4))) { //NYY
             System.out.println(botname +": " + nyytrivia.get(base));
             topic = 9; //answers
           }
           else if (baseballtalk.equals(teams.get(5))) { //TOR
             System.out.println(botname +": " + tortrivia.get(base));
             topic = 10; //answers
           }
       
           while (topic == 8) {
               Scanner speak7 = new Scanner(System.in);
               String talk7 = speak7.nextLine();
               if (talk7.equals("change")){
                     topic = 0;
                 }
              else if (base == 0) {
                   if (talk7.equals(triviaanswers.get(9))) {
                       System.out.println(botname + ": Correct " + triviaanswers.get(9));
                   
                       topic = 2;
                       System.out.println(botname + ": Smartypants in the building..tell me another team.");
                   } else {
                       System.out.println(botname + ": Incorrect try again");
                       topic = 8;

                   }}
                 else if (base == 1) {
                   if (talk7.equals(triviaanswers.get(10))) {
                       System.out.println(botname + ": Correct " + triviaanswers.get(10));
                       topic = 2;
                       System.out.println(botname + ": You just can't get it wrong can "+username+"! give me another team");
                   } else {
                       System.out.println(botname + ": Incorrect, try again");
                       topic = 8;

                   }}
                   else if (base == 2) {
                   if (talk7.equals(triviaanswers.get(11))) {
                       System.out.println(botname + ": Correct " + triviaanswers.get(11));
                       topic = 2;
                       System.out.println(botname + ": This just in "+username+" is the best at sports trivia! bet you can't get the next one though. Give me another team");
                   } else {
                       System.out.println(botname + ": Incorrect, try again");
                       topic = 8;
                   }
               }
        else {
           System.out.println(botname + ": I don't know that team, tell me about it?");
           
       }}
              while (topic == 9){
              Scanner speak8 = new Scanner (System.in);
              String talk8 = speak8.nextLine();
              if (talk8.equals("change")){
                     topic = 0;
                 }
               else  if (base == 0){
                    if(talk8.equals(triviaanswers.get(12))){
                        System.out.println(botname +": Correct " + triviaanswers.get(12));
                        
                        topic = 2;
                        System.out.println(botname +": You should be on Jeopardy! give me another team");
                    }
                    else {
                        System.out.println(botname +": Incorrect, try again");
                        topic = 9;
                    } }
                 
             
          
                 else if (base == 1){
                    if(talk8.equals(triviaanswers.get(13))){
                        System.out.println(botname +": Correct " + triviaanswers.get(13));
                        topic = 2;
                        System.out.println(botname +": Your so smart you should get a trophy. Another team please.");
                    }
                    else {
                        System.out.println(botname +": Incorrect, try again");
                        topic = 9;
                    }
                 }
             
          
                 else if (base == 2){
                    if(talk8.equals(triviaanswers.get(14))){
                        System.out.println(botname +": Correct " + triviaanswers.get(14));
                        topic = 2;
                        System.out.println(botname +": The amount of IQ points you must have is extraordinary. Keep on giving me team names");
                    }
                    else {
                        System.out.println(botname +": Incorrect, try again");
                        topic = 9;
                    }
                 }
                  else {
                    System.out.println(botname + ": I hate " +talk8+" pick another one");
                 }}
                 
                 
                 while (topic == 10){
                 Scanner speak9 = new Scanner (System.in);
                 String talk9 = speak9.nextLine();
                 if (talk9.equals("change")){
                     topic = 0;
                 }
               else  if (base == 0){
                    if(talk9.equals(triviaanswers.get(15))){
                        System.out.println(botname +": "+ triviaanswers.get(15));
                        
                        topic = 2;
                        System.out.println(botname +": WRONG WRONG WRONG WRONG..just kidding you got that one right! give me another team!");
                    }
                    else {
                        System.out.println(botname +": Incorrect, try again");
                        topic = 10;
                    }
                 }
             
          
                 else if (base == 1){
                    if(talk9.equals(triviaanswers.get(16))){
                        System.out.println(botname +": Correct " + triviaanswers.get(16));
                        topic = 2;
                        System.out.println(botname +": Am I talking to Stephen Hawking? Your a genius! Next team please!");
                    }
                    else {
                        System.out.println(botname +": Incorrect, try again");
                        topic = 10;
                    }
                 }
             
          
                 else if (base == 2){
                    if(talk9.equals(triviaanswers.get(17))){
                        System.out.println(botname +": Correct " + triviaanswers.get(17));
                        topic = 2;
                        System.out.println(botname +": A+ for you my friend! Name me more teams");
                    }
                    else {
                        System.out.println(botname +": Incorrect, try again");
                        topic = 10;
                    }
                 }}}
                  else {
                    System.out.println(botname + ": Thats not a real team! Pick another one");
                 }}
                 
                 
                 while (topic == 3) { //football
                    Scanner footballscan = new Scanner (System.in);
                    String footballtalk = footballscan.nextLine();
                    System.out.println(username+ ": " +footballtalk);
                    if (footballtalk.equals("change")){
                     topic = 0;
                 }
           
             if (footballtalk.equals(teams.get(6)) || (footballtalk.equals(teams.get(7))) || (footballtalk.equals(teams.get(8))))
       {
            System.out.println(botname + ": I bet I know more about football than you do!");
            
            Random footballtrivia = new Random();
            int fb = footballtrivia.nextInt(3);
          
           
           if (footballtalk.equals(teams.get(6))) { //49ers
            System.out.println(botname +": " + ninerstrivia.get(fb)); 
            topic = 11; //answers
           }
           else if (footballtalk.equals(teams.get(7))) { //NYG
             System.out.println(botname +": " + nygtrivia.get(fb));
             topic = 12; //answers
           }
           else if (footballtalk.equals(teams.get(8))) { //Patriots
             System.out.println(botname +": " + patstrivia.get(fb));
             topic = 13; //answers
           }
       
           while (topic == 11) {
               Scanner speak7 = new Scanner(System.in);
               String talk7 = speak7.nextLine();
               if (talk7.equals("change")){
                     topic = 0;
                 }
               else if (fb == 0) {
                   if (talk7.equals(triviaanswers.get(18))) {
                       System.out.println(botname + ": Correct " + triviaanswers.get(18));
                   
                       topic = 3;
                       System.out.println(botname + ": I need to find harder questions! One more team!");
                   } else {
                       System.out.println(botname + ": Incorrect try again");
                       topic = 11;

                   }}
                 else if (fb == 1) {
                   if (talk7.equals(triviaanswers.get(19))) {
                       System.out.println(botname + ": Correct " + triviaanswers.get(19));
                       topic = 3;
                       System.out.println(botname + ": If this was a quiz you'd get 100%... more teams?");
                   } else {
                       System.out.println(botname + ": Incorrect, try again");
                       topic = 11;

                   }}
                   else if (fb == 2) {
                   if (talk7.equals(triviaanswers.get(20))) {
                       System.out.println(botname + ": Correct " + triviaanswers.get(20));
                       topic = 3;
                       System.out.println(botname + ": AND I WAS LIKE BABY BABY BABY OHHH...umm excuse me...I was uhh singing in the shower when you walked in on me...good job answering correctly..give me another team?");
                   } else {
                       System.out.println(botname + ": Incorrect, try again");
                       topic = 11;
                   }
               }
        else {
           System.out.println(botname + ": I am not a fan of that team, pick a different one");
           
       }}
              while (topic == 12){
              Scanner speak8 = new Scanner (System.in);
              String talk8 = speak8.nextLine();
              if (talk8.equals("change")){
                     topic = 0;
                 }
              else if (fb == 0){
                    if(talk8.equals(triviaanswers.get(21))){
                        System.out.println(botname +": Correct " + triviaanswers.get(21));
                        
                        topic = 3;
                        System.out.println(botname +": I think i'm too easy for you...go on a real game show! What other team do you like?");
                    }
                    else {
                        System.out.println(botname +": Incorrect, try again");
                        topic = 12;
                    } }
                 
             
          
                 else if (fb == 1){
                    if(talk8.equals(triviaanswers.get(22))){
                        System.out.println(botname +": Correct " + triviaanswers.get(22));
                        topic = 3;
                        System.out.println(botname +": Ahoy Matey lets speak like pirates arrr. Can ye name me a landlubber");
                    }
                    else {
                        System.out.println(botname +": Incorrect, try again");
                        topic = 12;
                    }
                 }
             
          
                 else if (fb == 2){
                    if(talk8.equals(triviaanswers.get(23))){
                        System.out.println(botname +": Correct " + triviaanswers.get(23));
                        topic = 3;
                        System.out.println(botname +": G'day Mate...I've suddenly come down with an Australian accent. A dingo ate ma babay..mate can you name me a team?");
                    }
                    else {
                        System.out.println(botname +": Incorrect, try again");
                        topic = 12;
                    }
                 }
                  else {
                    System.out.println(botname + ": I strongly dislike that team, pick another one");
                 }}
                 
                 
                 while (topic == 13){
                 Scanner speak9 = new Scanner (System.in);
                 String talk9 = speak9.nextLine();
                 if (talk9.equals("change")){
                     topic = 0;
                 }
                else if (fb == 0){
                    if(talk9.equals(triviaanswers.get(24))){
                        System.out.println(botname +": Correct " + triviaanswers.get(24));
                        
                        topic = 3;
                        System.out.println(botname +": How do you do that? Get my questions right? They are so hard! Care to play again? You know the drill.");
                    }
                    else {
                        System.out.println(botname +": Incorrect, try again");
                        topic = 13;
                    }
                 }
             
          
                 else if (fb == 1){
                    if(talk9.equals(triviaanswers.get(25))){
                        System.out.println(botname +": Correct " + triviaanswers.get(25));
                        topic = 3;
                        System.out.println(botname +": Do you feel lucky punk? DO YOU well then play again! Give me a team name");
                    }
                    else {
                        System.out.println(botname +": Incorrect, try again");
                        topic = 13;
                    }
                 }
             
          
                 else if (fb == 2){
                    if(talk9.equals(triviaanswers.get(26))){
                        System.out.println(botname +": Correct " + triviaanswers.get(26));
                        topic = 3;
                        System.out.println(botname +": I was going to ask you another question but then I kept on living my life...haha just kidding give me another team name!");
                    }
                    else {
                        System.out.println(botname +": Incorrect, try again");
                        topic = 13;
                    }
                 }}}
                  else {
                    System.out.println(botname + ": I hate you and your team, pick a different one.");
                 }}
                 
                 while (topic == 4) { //hockey
                    Scanner hockeyscan = new Scanner (System.in);
                    String hockeytalk = hockeyscan.nextLine();
                    System.out.println(username+ ": " +hockeytalk);
                   if (hockeytalk.equals("change")){
                     topic = 0;
                 }
                 
           
       if (hockeytalk.equals(teams.get(9)) || (hockeytalk.equals(teams.get(10))) || (hockeytalk.equals(teams.get(11))))
       {
            System.out.println(botname + ": too bad theres a lockout this year, the " +hockeytalk+ " were going to win the Stanley Cup this year");
            
            Random hockeytrivia = new Random();
            int hockey = hockeytrivia.nextInt(3);
          
           
           if (hockeytalk.equals(teams.get(9))) { //canucks
            System.out.println(botname +": " + vantrivia.get(hockey)); 
            topic = 14; //answers
           }
           else if (hockeytalk.equals(teams.get(10))) { //penguins
             System.out.println(botname +": " + pitttrivia.get(hockey));
             topic = 15; //answers
           }
           else if (hockeytalk.equals(teams.get(11))) { //maple leafs
             System.out.println(botname +": " + mltrivia.get(hockey));
             topic = 16; //answers
           }
       
           while (topic == 14) {
               Scanner speak7 = new Scanner(System.in);
               String talk7 = speak7.nextLine();
               if (talk7.equals("change")){
                     topic = 0;
                 }
               else if (hockey == 0) {
                   if (talk7.equals(triviaanswers.get(27))) {
                       System.out.println(botname + ": Correct " + triviaanswers.get(27));
                   
                       topic = 4;
                       System.out.println(botname + ": Well look who we have here..you must work for the NHL to know that kind of question. Are you Gary Bettman? No? Good give me another team");
                   } else {
                       System.out.println(botname + ": Incorrect try again");
                       topic = 14;

                   }}
                 else if (hockey == 1) {
                   if (talk7.equals(triviaanswers.get(28))) {
                       System.out.println(botname + ": Correct " + triviaanswers.get(28));
                       topic = 4;
                       System.out.println(botname + ": True hockey fan right here! name me another team");
                   } else {
                       System.out.println(botname + ": Incorrect, try again");
                       topic = 14;

                   }}
                   else if (hockey == 2) {
                   if (talk7.equals(triviaanswers.get(29))) {
                       System.out.println(botname + ": Correct " + triviaanswers.get(29));
                       topic = 4;
                       System.out.println(botname + ": Impressive that you know this much! Care to try again?");
                   } else {
                       System.out.println(botname + ": Incorrect, try again");
                       topic = 14;
                   }
               }
        else {
           System.out.println(botname + ": I hate " +talk7+ " with a passion, pick a new team.");
           
       }}
              while (topic == 15){
              Scanner speak8 = new Scanner (System.in);
              String talk8 = speak8.nextLine();
              if (talk8.equals("change")){
                     topic = 0;
                 }
               else if (hockey == 0){
                    if(talk8.equals(triviaanswers.get(30))){
                        System.out.println(botname +": Correct " + triviaanswers.get(30));
                        
                        topic = 4;
                        System.out.println(botname +": YOU ARE SO SMART YOU ARE SO SMART S-M-R-T I MEAN S-M-A-R-T...another team? :D");
                    }
                    else {
                        System.out.println(botname +": Incorrect, try again");
                        topic = 15;
                    } }
                 
             
          
                 else if (hockey == 1){
                    if(talk8.equals(triviaanswers.get(31))){
                        System.out.println(botname +": Correct " + triviaanswers.get(31));
                        topic = 4;
                        System.out.println(botname +": You should go play some real sports trivia games! Wanna go another round?");
                    }
                    else {
                        System.out.println(botname +": Incorrect, try again");
                        topic = 15;
                    }
                 }
             
          
                 else if (hockey == 2){
                    if(talk8.equals(triviaanswers.get(32))){
                        System.out.println(botname +": Correct " + triviaanswers.get(32));
                        topic = 4;
                        System.out.println(botname +": NA NA NA NA NA NA NA BETTMAN! another round?");
                    }
                    else {
                        System.out.println(botname +": Incorrect, try again");
                        topic = 15;
                    }
                 }
                  else {
                    System.out.println(botname + ": Nope, pick a different team.");
                 }}
                 
                 
                 while (topic == 16){
                 Scanner speak9 = new Scanner (System.in);
                 String talk9 = speak9.nextLine();
                 if (talk9.equals("change")){
                     topic = 0;
                 }
                 else if (hockey == 0){
                    if(talk9.equals(triviaanswers.get(33))){
                        System.out.println(botname +": Correct " + triviaanswers.get(33));
                        
                        topic = 4;
                        System.out.println(botname +": You know what I like about Hockey? The trivia questions on the megascreen. You should answer them! Next team please!");
                    }
                    else {
                        System.out.println(botname +": Incorrect, try again");
                        topic = 16;
                    }
                 }
             
          
                 else if (hockey == 1){
                    if(talk9.equals(triviaanswers.get(34))){
                        System.out.println(botname +": Correct " + triviaanswers.get(34));
                        topic = 4;
                        System.out.println(botname +": Too bad i'm out of questions goodbye...just joking give me another team");
                    }
                    else {
                        System.out.println(botname +": Incorrect, try again");
                        topic = 16;
                    }
                 }
             
          
                 else if (hockey == 2){
                    if(talk9.equals(triviaanswers.get(35))){
                        System.out.println(botname +": Correct " + triviaanswers.get(35));
                        topic = 4;
                        System.out.println(botname +": I don't know who you are but I will find you and I will ask you another question! team?");
                    }
                    else {
                        System.out.println(botname +": Incorrect, try again");
                        topic = 16;
                    }
                 }}}
                  else {
                    System.out.println(botname + ": I do not accept that as a valid team, pick a different one");
                 }}
                 
                 
                 
                     
       }}}
               
                 
                 
       
                 
        


    

    
   
   

  
    

    

