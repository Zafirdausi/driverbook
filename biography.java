public class biography extends TextBook {
    String about;

    public String getAbout() {
        return this.about;
    }

    public void setAbout() {
        this.about = about;

    }

    public biography() {
        super();
        about = "";
                
    }
    
    public biography(String title, String subject, String about, int year, double price) {
        super(title,subject,year,price);
        this.about = about;
    }

    public void print() {
        super.print();
        System.out.println("about" + about);
    }
}
