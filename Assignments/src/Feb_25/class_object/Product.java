/**
 * 
 */
package Feb_25.class_object;

/**
 * 
 */
public class Product {
	int id;
	String brand;
	String name;
	double price;
	/**
	 * @param id
	 * @param brand
	 * @param name
	 * @param price
	 */
	public Product(int id, String brand, String name, double price) {
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Id : " + id + " , Brand : " + brand + " , Name : " + name + " , Price : " + price;
	}
	@Override
	public boolean equals(Object obj) {
		Product product = (Product) obj;
		
		if(this.id == product.id && this.brand.equals(product.brand) && this.name.equals(product.name) && this.price == product.price) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return java.util.Objects.hash(id, brand, name, price);
	}
}
