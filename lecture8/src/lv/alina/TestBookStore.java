package lv.alina;


import lv.alina.bookstore.Author;
import lv.alina.bookstore.Book;


public class TestBookStore {


	public static void main(String[] args) {
		Author rowling=new Author("J.K.Rowling", "rowling@gmail.com", 'f');
		Author rainis=new Author("Rainis", "rainis@gmail.com", 'm');
		System.out.println(rowling.getEmail());
		rowling.setEmail("jk@gmail.com");
		System.out.println(rowling.getEmail());
		
		
		
		
		Book harrypotter=new Book ("Harry Potter", rowling, 3.45, 3);
		
		System.out.println(harrypotter.toString());

		System.out.println(("**************************"));
		
		Author test1=new Author("name", "name@name",'f');
		Author test2=new Author("name1", "name1@name1",'6');
		
		System.out.println(test1.toString());
		System.out.println(test2.toString());
		
		System.out.println(("**************************"));
		
		
		
		
		
		
		
		
		
		
		
		
		char m = 'm';
		char f = 'f';
		char o = 'o';
		
		if (m==o || f==o){
			System.out.println("It is M or F");
		}else{
			System.out.println("It is not M or F");
		}
		
		
		switch(o){
		case 'm':
			System.out.println("Its m");
			break;
		case 'f':
			System.out.println("Its f");
			break;
			default:
				System.out.println("Not in the list");
			
		}
	
	}

}
