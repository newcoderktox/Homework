class Book{
    String title;
    String author;
    int pageCount;

    public Book(String title, String author, int pageCount){
        this.title=title;
        this.author=author;
        this.pageCount=pageCount;
        System.out.println("New book object is created:");
    }
    public void showInfoBook(){
        System.out.println("Book title: "+ title);
        System.out.println("The author of the book: "+ author);
        System.out.println("Book's page: "+ pageCount);
    }
}

class EBook extends Book{
    double fileSize;
    String format;

    public EBook(String title, String author, int pageCount,double fileSize, String format){
        super(title, author, pageCount);
        this.fileSize=fileSize;
        this.format=format;
        System.out.println("New EBook object is created:");
    }
    @Override
    public void showInfoBook(){
        System.out.println("Book title: "+ super.title);
        System.out.println("The author of the book: "+ super.author);
        System.out.println("Book's page: "+ super.pageCount);
        System.out.println("File size: "+ fileSize);
        System.out.println("Book format: "+ format);
    }
}

public class BookSystem {
    public static void main(String [] args){
        Book book = new Book("Trees", "Nisa", 150);
        EBook ebook = new EBook("Flowers","Nisanur", 200, 20,"PDF");
        book.showInfoBook();
        ebook.showInfoBook();
    }
}
