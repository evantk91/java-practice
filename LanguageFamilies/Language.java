package LanguageFamilies;

public class Language {
   protected String name;
   protected int numSpeakers;
   protected String regionsSpoken;
   protected String wordOrder;
  
   public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
      this.name = name;
      this.numSpeakers = numSpeakers;
      this.regionsSpoken = regionsSpoken;
      this.wordOrder = wordOrder;  
   }
  
   public void getInfo() {
      System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + "."); 
      System.out.println("The language follows the word order: " + this.wordOrder + ".");
   }
   public static void main(String[] args) {
    //   Language english = new Language("English", 500000000, "North America, Europe", "subject-verb-object");
    //   english.getInfo();

    //   Mayan spanish = new Mayan("Spanish", 120000000);
    //   spanish.getInfo();

      SinoTibetan chinese = new SinoTibetan("Mandarin Chinese", 1000000);
      chinese.getInfo();
   }      
}
