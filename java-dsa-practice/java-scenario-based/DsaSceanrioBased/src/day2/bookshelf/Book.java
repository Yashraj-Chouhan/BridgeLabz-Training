package day2.bookshelf;
class Book {
    String id;
    String title;
    String author;

    Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}
