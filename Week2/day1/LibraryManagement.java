package Week2.day1;

public class LibraryManagement {

	public static void main(String[] args) {
		Library Library = new Library();
		String addBook = Library.addBook("The Scret");
		System.out.println("Book Name :"+ addBook);
		Library.issueBook();
	}
}
