import java.util.Random;
import java.text.ParseException;
public class dedomenapolewn {

    public dedomenapolewn() {
    }

    public String getPolh(String pol) {
        if(pol.equals("Thessaloniki")){
              return "Makedonia(SKG)";
        }else if(pol.equals("Athens")){
               return "Eleftherios Venizelos(ATH)";
        }
        else if(pol.equals("London")){
               Random rand = new Random(); 
               int num=rand.nextInt(6);
               switch(num){
                   case 0:
                       return "Heathrow Airport (LHR)";
                   case 1:
                       return "Gatwick Airport (LGW)";
                   case 2:
                       return "Stansted Airport (STN)";
                   case 3:
                       return "Luton Airport (LTN)";
                   case 4:
                       return "London City Airport (LCY)";
                   case 5:
                       return "Southend Airport (SEN)";
               }
        }
        else if(pol.equals("Barcelona")){
            
               return "Barcelona-El Prat Josep Tarradellas(BCN)";
        }
        else if(pol.equals("Berlin")){
               return "Berlin Brandenburg(BER)";
        }
        else if(pol.equals("Paris")){
               return "Paris Charles de Gaulle(CDG)";
        }
        else if(pol.equals("Rome")){
            Random rand = new Random(); 
               int num=rand.nextInt(2);
               switch(num){
                   case 0:
                       return "Ciampino–G. B. Pastine(CIA)";
                   case 1:
                       return "Leonardo da Vinci–Fiumicino(FCO)";
           }
        }
        else if(pol.equals("Istanbul")){
               Random rand = new Random(); 
               int num=rand.nextInt(2);
               switch(num){
                   case 0:
                       return "Istanbul Airport(IST)";
                   case 1:
                       return "Sabiha Gökçen(SAW)";
           }
        }
        else if(pol.equals("New York")){
               Random rand = new Random(); 
               int num=rand.nextInt(4);
               switch(num){
                   case 0:
                       return "John F. Kennedy(JFK)";
                   case 1:
                       return "LaGuardia(LGA)";
                   case 2:
                       return "Newark Liberty(EWR)";
                   case 3:
                       return "Stewart(SWF)";
               }
        }
        else if(pol.equals("Tokyo")){
               Random rand = new Random(); 
               int num=rand.nextInt(2);
               switch(num){
                   case 0:
                       return "Narita(NRT)";
                   case 1:
                       return "Haneda(HND)";
           }
        }else if(pol.equals("Rio de Janeiro")){
               Random rand = new Random(); 
               int num=rand.nextInt(2);
               switch(num){
                   case 0:
                       return "Galeão(GIG)";
                   case 1:
                       return "Santos Dumont(SDU)";
           }
        }
        
        return "";}

    public String getTime(String t, String dep, String ret) throws ParseException {
         
         return "";
    }
    
    
    
}
