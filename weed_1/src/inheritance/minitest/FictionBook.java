package inheritance.minitest;

public class FictionBook extends Book {
    private String Category = "Viễn Tưởng";

    public FictionBook() {
    }

    public FictionBook(String bookCode, String name, int price, String author, String Category) {
        super(bookCode, name, price, author);
        this.Category = Category;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public int getPrice() {
        return super.getPrice() * 93 / 100;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Category='" + Category + '\'' +
                '}';
    }
}