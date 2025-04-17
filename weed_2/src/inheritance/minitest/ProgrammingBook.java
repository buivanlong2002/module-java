package inheritance.minitest;

public class ProgrammingBook extends Book {
    private String language = "Java";
    private String framework = "MVC";
    public ProgrammingBook() {
    }

    public ProgrammingBook(String bookCode, String name, int price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }


    public int getPrice() {
        return super.getPrice() * 95 / 100;
    }

    @Override
    public String toString() {
        return super.toString() +
                " language='" + language + '\'' +
                ", framework='" + framework + '\'' +
                '}';
    }
}
