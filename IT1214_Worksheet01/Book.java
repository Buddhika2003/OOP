//Q06
class Book{
	private String title;
	private String author;
	private double price;

	Book(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}

	Book(String title,String author){
		this.title=title;
		this.author=author;
		this.price=0;

	}

	public String getTitle(){
		return title;
	}

	public String getAuthor(){
		return author;
	}

	public double getPrice(){
		return price;
	}

	public void setTitle(String title){
		this.title=title;
	}

	public void setAuthor(String author){
		this.author=author;
	}

	public void setPrice(double price){
		this.price=price;
	}

	void displayDetail(){
		System.out.println("Title of the Book : "+title);
		System.out.println("Author of the Book :"+author);
		System.out.println("Book Price : Rs."+price);
	}
}


class BookMain{
	public static void main(String[]args){
		Book book1=new Book("Java Basics","Arthur A",300);
		Book book2=new Book("Python Essential","Arthur B");
		book1.displayDetail();
		book2.displayDetail();
	}
}