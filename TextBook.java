public class TextBook extends Book {
    String subject;

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public TextBook() {
        super();
        subject = "kosong";
    }

    public TextBook(String subject, String title, int year, double price) {
        super(title,year,price);
        this.subject = subject;
    }

    public void print() {
        System.out.println("Subject" + subject);
    }
}
