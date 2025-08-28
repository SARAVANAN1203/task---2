package task2;



	import java.util.Scanner;

	// Book class
	class Book {
	    private int bookID;
	    private String title;
	    private String author;
	    private boolean isAvailable;

	    // Constructor
	    public Book(int bookID, String title, String author) {
	        this.bookID = bookID;
	        this.title = title;
	        this.author = author;
	        this.isAvailable = true;
	    }

	    // Getters & Setters
	    public int getBookID() {
	        return bookID;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    public boolean isAvailable() {
	        return isAvailable;
	    }

	    public void setAvailable(boolean available) {
	        isAvailable = available;
	    }

	    // Display book details
	    public void displayBook() {
	        System.out.println("ID: " + bookID + " | Title: " + title +
	                " | Author: " + author +
	                " | Available: " + (isAvailable ? "Yes" : "No"));
	    }
	}

	// Library class
	class Library {
	    private Book[] books;
	    private int count; // to keep track of how many books are added

	    public Library() {
	        this.books = new Book[5]; // Fixed size 5
	        this.count = 0;
	    }

	    // Add a book
	    public void addBook(Book book) {
	        if (count < books.length) {
	            books[count] = book;
	            count++;
	            System.out.println("Book added successfully.");
	        } else {
	            System.out.println("Library is full. Cannot add more books.");
	        }
	    }

	    // Replace a book (update title and author by bookID)
	    public void replaceBook(int bookID, String newTitle, String newAuthor) {
	        for (int i = 0; i < count; i++) {
	            if (books[i].getBookID() == bookID) {
	                books[i].setTitle(newTitle);
	                books[i].setAuthor(newAuthor);
	                System.out.println("Book details updated successfully.");
	                return;
	            }
	        }
	        System.out.println("Book with ID " + bookID + " not found.");
	    }

	    // Display all books
	    public void displayBooks() {
	        if (count == 0) {
	            System.out.println("No books in the library.");
	            return;
	        }
	        System.out.println("\n--- Library Books ---");
	        for (int i = 0; i < count; i++) {
	            books[i].displayBook();
	        }
	    }
	}

	// Main class
	public class BookManagementSystem {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Library library = new Library();

	        int choice;
	        do {
	            System.out.println("\n=== Library Menu ===");
	            System.out.println("1. Add Book");
	            System.out.println("2. Replace Book Details");
	            System.out.println("3. Display All Books");
	            System.out.println("4. Exit");
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();
	            sc.nextLine(); // consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Book ID: ");
	                    int id = sc.nextInt();
	                    sc.nextLine();
	                    System.out.print("Enter Title: ");
	                    String title = sc.nextLine();
	                    System.out.print("Enter Author: ");
	                    String author = sc.nextLine();
	                    library.addBook(new Book(id, title, author));
	                    break;

	                case 2:
	                    System.out.print("Enter Book ID to replace: ");
	                    int replaceId = sc.nextInt();
	                    sc.nextLine();
	                    System.out.print("Enter New Title: ");
	                    String newTitle = sc.nextLine();
	                    System.out.print("Enter New Author: ");
	                    String newAuthor = sc.nextLine();
	                    library.replaceBook(replaceId, newTitle, newAuthor);
	                    break;

	                case 3:
	                    library.displayBooks();
	                    break;

	                case 4:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice!");
	            }

	        } while (choice != 4);

	        sc.close();
	    }
	}


