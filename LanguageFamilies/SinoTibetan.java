package LanguageFamilies;

public class SinoTibetan extends Language {
   public SinoTibetan(String languageName, int numSpeakers) {
      super(languageName, numSpeakers, "Asia", "subject-object-verb");
      if(this.name.contains("Chinese")) {
         this.wordOrder = "subject-verb-object";  
      }  
   }       
}
