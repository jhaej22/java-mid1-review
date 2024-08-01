package nested.test.ex1;

public class Library {

    private Book[] books;
    private int bookcount;

    public Library(int size) {
        books = new Book[size];
        bookcount = 0;
    }

    public void addBook(String title, String author) {
        if (bookcount < books.length) {
            books[bookcount++] = new Book(title, author);
        } else {
            System.out.println("도서관 저장 공간이 부족합니다.");
        }
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (Book book : books) {
            System.out.println("도서 제목: " + book.title+ ", 저자: " + book.author);
        }
    }

    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
