
public class Zavedenie {
    
    private int number;
    private String adress;
    
    public Zavedenie(int number, String adress){
        
        this.number=number;
        this.adress=adress;
    }
    
    public Zavedenie(){  
    }
    public int getumber() {
            return number;       
        }
        public void setnumber(int number){
            this.number = number;
        }
        
    public String getadress() {
            return adress;       
        }
        public void setadress(String adress){
            this.adress = adress;
        }
 
}
