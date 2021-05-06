package Entities;

public class Game {
	private int Id;
	private String Name;
	private int Price;
	
	
	public Game(int id, String name, int price) {
		
		Id = id;
		Name = name;
		Price = price;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getPrice() {
		return Price;
	}


	public void setPrice(int price) {
		Price = price;
	}
		
	
	

}
