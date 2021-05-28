
public class Main {
    public static void main(String[] args) {
        Client Yousuf = new Client("юсуф", "мавлянов","КамалдиновичАбдулаГлавный", 21695400, "Паркурист умный", 5000, "Паркурист", "Главный отдел");
        
        String name = Yousuf.getname();
        String surname = Yousuf.getsurname();
        String reporting = Yousuf.getreporting();
        long phone= Yousuf.getphone();
        String activity= Yousuf.getactivity();
        int oplata= Yousuf.getoplata();
        String otdel= Yousuf.getotdel();
        
        System.out.println("Имя: " +name+ "\nФамилия:"+ surname+"\nОтчество:"+ reporting+"\nРабота:"+activity+"\nТелефон:"+phone+"\nОплата: "+oplata+"\nОтделение:"+ otdel);
        
        Cvitance cvit= new Cvitance("Повышение уменя паркуринства", 5000, "Паркурр!");
        String Opisan=cvit.getOpisan();
        int sum = cvit.getsum();
        String Curs= cvit.getCurs();
        
        System.out.println("\nОписание курса:"+Opisan+"\nЦена курса:"+ sum+"\nНазвание курса:"+Curs);
        
        Zavedenie zav= new Zavedenie(228337, "Пушкина, дома Калатушкина, Узбекисатн");
        int number= zav.getumber();
        String adress= zav.getadress();
        
        System.out.println("\nНомер заведения:"+ number+"\nАдрес заведения:"+adress);
        
        Prepod prep= new Prepod("Абдула", "Курбамбек", "Аравфакаж", 23434556 ,"5 лет");
        String Pname= prep.getPname();
        String Psurname= prep.getPsurname();
        String Preporting= prep.getPreporting();
        long Pphone= prep.getPphone();
        String Staj= prep.getStaj();
        System.out.println("\nИмя преподавателя:"+Pname+"\nФамилия преподавателя:"+Psurname+"\nОтчество преподавателя:"+Preporting+"\nНомер преподавателя:"+Pphone+"\nСтаж преподавателя:"+Staj );
        

}
}

