package curso_programacao.entities;

/* Author Everton Mota
 *  Date 18/11/2021
 *  Curso Programação Orientada Objetos - Java.
 *  
 *  Enter Product data :
 *  Name : TV
 *  Price : 4000
 *  Quantity : 10
 *  
 *  Product : Tv , $ 900.00 , 10 units, Total : $ 9000
 * 
 *  Enter the number of product to be added in stock : 5
 *  Update data : TV , $ 900.00 , 15 units, total $ 13500.00
 *  
 *  Enter the number to be removed from stock : 3
 *  
 *  Update data : TV , $ 900.00 , 12 units , total $ 10800.00
 *  
 */
public class ProductFake {

	public String name;
	public double price;
	public int quantity;
	
	public ProductFake( String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProduct(int quantity) {
		 this.quantity += quantity;
	}
	
	public void removeProduct(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return  "Product data : " + name + ",  $ " 
								  + String.format("%.2f", price) + ", " 
								  + quantity+ " units, Total : " 
								  + String.format("%.2f", totalValueInStock() );
	}
}
