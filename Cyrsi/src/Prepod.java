
public class Prepod {
    
   private String Pname;
   private String Psurname;
   private String Preporting;
   private long Pphone;
   private String Staj;
    
   public Prepod(String Pname,String Psurname,String Preporting, long Pphone,String Staj ){
        this.Pname = Pname;
        this.Psurname = Psurname;
        this.Preporting= Preporting;
        this.Pphone = Pphone;
        this.Staj=Staj;
   }
   
   public Prepod() {
       
   }
   public String getPname() {
            return Pname;       
        }
   public void setPname(String Pname){
            this.Pname = Pname;
        }
        
   public String getPsurname() {
            return Psurname; 
        }
   public void setPsurname(String Psurname){
            this.Psurname = Psurname;
        }
   public String getPreporting(){
            return Preporting;
        }
   public void setPreporting(String Preporting){
            this.Preporting= Preporting;
        }
 
   public long getPphone() {
            return Pphone;
        }
        public void setPphone(long Pphone){
            this.Pphone = Pphone;
}
        public String getStaj() {
            return Staj;       
        }
   public void setStaj(String Staj){
            this.Staj = Staj;
        }
        






}
