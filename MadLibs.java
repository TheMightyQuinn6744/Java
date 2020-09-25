//define a public class called MadLibs
public class MadLibs {
  /*
  This program generates a mad libbed story.
Author: Laura
Date: 2/19/2049
  */
  	public static void main(String[] args){
      String name1 = "Zoe";

      String adjective1 = "grouchy";
      String adjective2 = "rough";
      String adjective3 = "concerned";

      String noun1 = "workers";
      String noun2 = "fortnite";
      String verb1 = "chant";
      String noun3 = "music";
      String noun4 = "neighbor";
      
      String name2 = "Quinn"; 
      String place1 = "California";
      String noun5 = "apple juice";
      int number = 1993;
      String noun6 = "Bill Clinton";

      
      
      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
    }       
}
