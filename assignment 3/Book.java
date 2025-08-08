
public class Book {
    String name;
    int totalPages;
    double coverPages;
    String author_name;

    public Book(String name,int totalPages,double coverPages,String author_name){
        this.name = name;
        this.totalPages = totalPages;
        this.coverPages = coverPages;
        this.author_name = author_name;
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book("Book A",200,20.20,"Auhor1"),
            new Book("Book B",300,10.20,"Auhor2"),
            new Book("Book C",400,50.20,"Auhor3"),
            new Book("Book D",500,30.20,"Auhor4"),
        };

        int totalPageSum = 0;
        double totalPriceSum = 0;

        for (Book b : books){
            totalPageSum += b.totalPages;
            totalPriceSum += b.coverPages;
        }

        System.out.println("Avrage pages" +(totalPageSum / books.length));
        System.out.println("Avrage cover price" +(totalPriceSum / books.length));
    }

}
