
public class Client {
    
   private String name;
   private String surname;
   private String reporting;
   private long phone;
   private String activity;
   private int oplata;
   private String specialnost;
   private String otdel;


public Client(String name, String surname,String reporting,long phone, String activity,int oplata,  String specialnost, String otdel) {

        this.name = name;
        this.surname = surname;
        this.reporting= reporting;
        this.phone = phone;
        this.activity = activity;
        this.oplata= oplata;
        this.specialnost=specialnost;
        this.otdel=otdel;

}

public Client() {

}

        public String getname() {
            return name;       
        }
        public void setname(String name){
            this.name = name;
        }
                public String getsurname() {
            return surname; 
        }
        public void setsurname(String surname){
            this.surname = surname;
        }
        public String getreporting(){
            return reporting;
        }
        public void setreporting(String reporting){
            this.reporting= reporting;
        }
        public String getactivity(){
            return activity;
        }
        public void setactivity(String activity){
            this.activity = activity;
        }
        public long getphone() {
            return phone;       
        }
        public void setphone(long phone){
            this.phone = phone;
        }
        public int getoplata() {
            return oplata;       
        }
        public void setoplata(int oplata){
            this.oplata = oplata;
        }
        public String getspecialnost() {
            return specialnost;       
        }
        public void setspecialnost(String specialnost){
            this.specialnost = specialnost;
        }
        public String getotdel() {
            return otdel;       
        }
        public void setotdel(String otdel){
            this.otdel = otdel;
        }

}
