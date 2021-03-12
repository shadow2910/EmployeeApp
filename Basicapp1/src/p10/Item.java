package p10;

public class Item {
	
	private int productId;
	private int quantity;
	private String name;
	private String brand;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int productId, int quantity, String name, String brand) {
		super();
		this.productId = productId;
		this.quantity = quantity;
		this.name = name;
		this.brand = brand;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Item [productId=" + productId + ", quantity=" + quantity + ", name=" + name + ", brand=" + brand + "]";
	}
	@Override
	public int hashCode() {
		int result=(this.brand.length()+this.productId+this.name.length());
		System.out.println("Hash Code"+result);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		boolean isEqual=false;
		if(obj instanceof Item) {
			Item item2=(Item)obj;
			if(this.productId != item2.productId) {
				isEqual=false;
			}
			else if(!this.name.equals(item2.name)){
				isEqual=false;
			}
			else if(!this.brand.equals(item2.brand)){
				isEqual=false;
			}
			else
				isEqual=true;
		}
		else
			isEqual=false;
		
		if(isEqual)
		{
			System.out.println("Equals Called-Same Product");
		}
		else
			System.out.println("EqualsCalled-Different Product");
	
		return isEqual;
	}
	
	

}
