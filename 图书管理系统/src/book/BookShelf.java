package book;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-22
 * Time: 14:11
 */
public class BookShelf {
    public Book[] books = new Book[5];
    private int allBooksCount;

    public BookShelf() {
        this.books = new Book[]{
                new Book("三国演义", "罗贯中", 56, "小说"),
                new Book("西游记", "吴承恩", 62, "小说"),
                new Book("红梦楼", "曹雪芹", 76, "小说"),
                new Book("水浒传", "施耐庵", 96, "小说")
        };
        this.allBooksCount = 4;
    }

    public int bookSize(){
        return books.length;
    }

    public void setBooks(int pos, Book book) {
        this.books[pos] = book;
    }

    public Book getBook(int pos) {
        return this.books[pos];
    }


    public void setAllBooksCount(int allBooksCount) {
        this.allBooksCount = allBooksCount;
    }

    public int getAllBooksCount() {
        return this.allBooksCount;
    }
}
