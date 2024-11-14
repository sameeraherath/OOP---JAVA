import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getters and Setters
    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Display book details
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Member {
    private String name;
    private int memberId;

    // Constructor
    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void registerMember(Member member) {
        members.add(member);
        System.out.println("Member registered: " + member.getName());
    }

    public void borrowBook(Member member, Book book) {
        if (books.contains(book)) {
            if (book.getIsAvailable()) {
                book.setIsAvailable(false);
                System.out.println(member.getName() + " borrowed " + book.getTitle());
            } else {
                System.out.println("Book is currently unavailable.");
            }
        } else {
            System.out.println("This book is not in the library's collection.");
        }
    }

    public void returnBook(Book book) {
        if (books.contains(book)) {
            book.setIsAvailable(true);
            System.out.println("Book returned: " + book.getTitle());
        } else {
            System.out.println("This book is not from our library.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create library and register members
        Library library = new Library();
        Member member1 = new Member("Alice", 1);
        library.registerMember(member1);

        // Create and add books to library
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        library.addBook(book1);
        library.addBook(book2);

        // Perform borrowing and returning actions
        library.borrowBook(member1, book1);  // Alice borrows "1984"
        library.returnBook(book1);           // Alice returns "1984"

        library.borrowBook(member1, book2);  // Alice borrows "To Kill a Mockingbird"
    }
}
