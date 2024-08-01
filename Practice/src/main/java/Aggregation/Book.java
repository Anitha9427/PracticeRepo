package Aggregation;

public class Book {
	String bookName;
	int id;
	Author a;
	public Book(String bookName,int id,Author a)
	{
	this.bookName=bookName;
	this.id=id;
	this.a=a;
	}
	public void dis()
	{
		System.out.println("The Author is: "+a.name+", "+"Age:  "+a.age);
		System.out.println("TheBookName: "+bookName+", "+"Th BookId: "+id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Author obj=new Author("Benyamin",45);
Book obj1=new Book("Aadujeevitham",121,obj);
obj1.dis();
	}

}
