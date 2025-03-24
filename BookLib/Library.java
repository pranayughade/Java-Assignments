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
class Library{
	Book[] books;
	Scanner sc = new Scanner(System.in);
	public void setBooks(Book... books){
		this.books = books;
	}
	public Book[] getBooks(){ return books; }
	
	//2
	public void showBooks(){
		Book[] b = this.getBooks();
		System.out.println("ANum" + "\t" + "Book Title" + "\t" + "Book Author" + "\t" + "Price");
		System.out.println("---------------------------------------------------");
		for(int i = 0; i<b.length; i++){
			if(b[i]!= null)
			System.out.println(b[i].getAccessNum() + "\t" + b[i].getTitle() + "\t" + b[i].getAuthor() + "\t" + b[i].getPrice());
		}
		
	}
	
	//3 by auth
	public void showBookByAuthor(String a){
		Book[] b = this.getBooks();
		System.out.println("Books available of author " + a + ": ");
		System.out.println("ANum" + "\t" + "Book Title" + "\t" + "Book Author" + "\t" + "Price");
		System.out.println("---------------------------------------------------");
		for(int i = 0; i<b.length; i++){
			if(b[i]!= null){
				if(b[i].getAuthor().equals(a)){
					System.out.println(b[i].getAccessNum() + "\t" + b[i].getTitle() + "\t" + b[i].getAuthor() + "\t" + b[i].getPrice());
				}
			}
			
			
		}
		
	}
	
	//4 by title
	public void showBookByTitle(String a){
		Book[] b = this.getBooks();
		System.out.println("Book detail of book named " + a + ": ");
		System.out.println("ANum" + "\t" + "Book Title" + "\t" + "Book Author" + "\t" + "Price");
		System.out.println("---------------------------------------------------");
		for(int i = 0; i<b.length; i++){
			if(b[i]!=null && b[i].getTitle().equals(a)){
				System.out.println(b[i].getAccessNum() + "\t" + b[i].getTitle() + "\t" + b[i].getAuthor() + "\t" + b[i].getPrice());
			}
			
		}
		
	}
	
	//5 count of books
	public void totalBookInLib(){
		System.out.println("There are total: " + books.length + " available in library.");
		
	}
	
	//6 display in ascending order of acess number
	public void showBookInAscendingAccess(){
		Book[] b = new Book[books.length];
		for(int i = 0; i<b.length; i++){
			b[i] = books[i];
		}
		
		//sort
		for(int i = 0; i<b.length-1; i++){
			for(int j= 0; j<b.length-i-1; j++){
				if (b[j] != null && b[j + 1] != null) {
					int a1 = b[j].getAccessNum();
					int a2 = b[j + 1].getAccessNum();

					// If the current book has a greater accession number, swap them
					if (a1 > a2) {
						Book temp = b[j];
						b[j] = b[j + 1];
						b[j + 1] = temp;
					}
					
				} else if (b[j] == null && b[j + 1] != null) {
                
					Book temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}
		}
		
		//Show in ascending order 
		System.out.println("ANum" + "\t" + "Book Title" + "\t" + "Book Author" + "\t" + "Price");
		System.out.println("---------------------------------------------------");
		for(int i = 0; i<b.length; i++){
			if(b[i]!= null)
				System.out.println(b[i].getAccessNum() + "\t" + b[i].getTitle() + "\t" + b[i].getAuthor() + "\t" + b[i].getPrice());
			
			
		}
		
		
	}
	
	//update book detail by auth
	
	
	public void updateBookByAuthor(String auth){
		
		Book[] b = this.getBooks();
		int count = 0;
		System.out.println("detail of " + auth + "'s book: ");
		
		System.out.println("---------------------------------------------------");
		for(int i = 0; i<b.length; i++){
			if(b[i].getAuthor().equals(auth) && b[i] != null){
				System.out.println("ANum" + "\t" + "Book Title" + "\t" + "Book Author" + "\t" + "Price");
				System.out.println(b[i].getAccessNum() + "\t" + b[i].getTitle() + "\t" + b[i].getAuthor() + "\t" + b[i].getPrice() + "\n");
				
				System.out.println("Enter updated accessNum, title, author and price:");
				int aNum = sc.nextInt(); sc.nextLine();
				String t = sc.nextLine();
				String author = sc.nextLine();
				int price = sc.nextInt();
				
				b[i].setAccessNum(aNum);
				b[i].setTitle(t);
				b[i].setAuthor(author);
				b[i].setPrice(price);
				count++;
				System.out.println();
			}
			
		}
		if(count == 1){
			System.out.println("Succesfully updated the details!!!!.");
		}else{
			System.out.println("Books not available for author " + auth);
		}
		
		
	}
	
	//8 
	public void deleteBook(int price){
		Book[] b = this.getBooks();
		System.out.println("Books available of price " + price + ": ");
		System.out.println("ANum" + "\t" + "Book Title" + "\t" + "Book Author" + "\t" + "Price");
		System.out.println("-----------------------------------------------------");
		int count = 0;
		for(int i = 0; i<b.length; i++){
			if(b[i].getPrice() == price){
				System.out.println(b[i].getAccessNum() + "\t" + b[i].getTitle() + "\t" + b[i].getAuthor() + "\t" + b[i].getPrice()+"\n");
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Press 1 to delete: ");
				int n = sc.nextInt();
				if(n == 1){
					b[i] = null;
					System.out.println("Successfully deleted the book from library.");
					break;
				}else{
					System.out.println("No books foud for price " + price);
				}
			}
			
		}
		
	}
	
}