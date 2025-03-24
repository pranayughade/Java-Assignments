//Q1.	Create a class called Library to hold accession number,title of the book,author name,price of the book
//		and write a menu driven program in java that implements the working of a library :
//		The menu options should be: 
//		1. Add Book Details.
//		2. Display All Book Details.
//		3. Display List of all book of given author.
//		4. Display list the title of specified book.
//		5. Display list count of the book in the library.
//		6. Display list the books in the ascending order of accession number.
//		7. Update book details by title of book.
//		8. Delete book details by price.
//		9. Exit.

import java.util.*;

class LibraryApp{
	public static void main(String[] x){
		Scanner sc = new Scanner(System.in);
		Library l1 = new Library();
		Book[] b = new Book[5];
		
		do{
			System.out.println("1. Add Book and Details.");
			System.out.println("2. Display All Book Details.");
			System.out.println("3. Display List of all book of given author.");
			System.out.println("4. Display list the title of specified book.");
			System.out.println("5. Display list count of the book in the library.");
			System.out.println("6. Display list the books in the ascending order of accession number.");
			System.out.println("7. Update book details by title of book.");
			System.out.println("8. Delete book details by price.");
			System.out.println("9. Exit.");
			
			int button = sc.nextInt();
			
			switch(button){
				
				case 1:
					System.out.println("==========================================/n");
					System.out.println("Add " + b.length + " books in library.");
					
					for(int i= 0; i<b.length; i++){
						System.out.println("Enter access Number, title, author, price: ");
						b[i] = new Book();
						int an = sc.nextInt();
						sc.nextLine();
						String t = sc.nextLine();
						String author = sc.nextLine();
						int price = sc.nextInt();
						
						b[i].setAccessNum(an);
						b[i].setTitle(t);
						b[i].setAuthor(author);
						b[i].setPrice(price);
						
					}
					l1.setBooks(b);
					System.out.println("Succesfully added books in library;");
					System.out.println("==========================================/n");
					break;
					
				case 2:
					System.out.println("==========================================/n");
					l1.showBooks();
					System.out.println("==========================================/n");
					break;
					
				case 3:
					System.out.println("==========================================/n");
					System.out.println("Enter book author name: ");
					sc.nextLine();
					String s = sc.nextLine();
					l1.showBookByAuthor(s);
					System.out.println("==========================================/n");
					break;
				case 4:
					System.out.println("==========================================/n");
					System.out.println("Enter book Title to see details: ");
					sc.nextLine();
					String bt = sc.nextLine();
					l1.showBookByTitle(bt);
					System.out.println("==========================================/n");
					break;
				case 5:
					System.out.println("==========================================/n");
					l1.totalBookInLib();
					System.out.println("==========================================/n");
					break;
				case 6:
					System.out.println("==========================================/n");
					l1.showBookInAscendingAccess();
					System.out.println("==========================================/n");
					break;
				case 7:
					System.out.println("==========================================/n");
					System.out.println("To update book enter author name: ");
					sc.nextLine();
					String auth= sc.nextLine();
					l1.updateBookByAuthor(auth);
					System.out.println("==========================================/n");
					break;
				case 8:
					System.out.println("==========================================/n");
					System.out.println("To delete a book in library search by entering price: ");
					int pr= sc.nextInt();
					l1.deleteBook(pr);
					System.out.println("==========================================/n");
					break;
				case 9:
					System.out.println("==========================================/n");
					System.out.println("Logged out");
					System.out.println("==========================================/n");
					return;
				default: 
					System.out.println("Invalid entry");
				
					
			}
			
			
		}while(true);
		
	}
}