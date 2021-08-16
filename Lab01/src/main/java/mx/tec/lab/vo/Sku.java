package mx.tec.lab.vo;

import java.net.URL;

/**
* The Sku class uses the Value Objects pattern. This pattern does just that, 
* transform our values into objects. 
* 
* @author  Karen Alicia Hernandez
* @version 1.0
*/
public class Sku {
	
	private String id;
	private String color;
	private String size;
	private double listPrice;
	private double salePrice;
	private long quantityOnHand;
	private URL imageS;
	private URL imageM;
	private URL imageL;
	
	/**
	 * A Sku is an object used to identify the differences that exist in a product.
	 * It incorporate different values, as id, color, size, price as listed, price 
	 * in sale, quantity available in hand, and three URLs to the image to display 
	 * (small, medium and large).
	 */
	public Sku() {
	}
	
	/**
	 * @param id
	 * @param color
	 * @param size
	 * @param listPrice
	 * @param salePrice
	 * @param quantityOnHand
	 * @param imageS
	 * @param imageM
	 * @param imageL
	 */
	public Sku(String id, String color, String size, double listPrice, double salePrice, long quantityOnHand, 
			URL imageS, URL imageM, URL imageL) {
		this.id = id;
		this.color = color;
		this.size = size;
		this.listPrice = listPrice;
		this.salePrice = salePrice;
		this.quantityOnHand = quantityOnHand;
		this.imageS = imageS;
		this.imageM = imageM;
		this.imageL = imageL;
	}
	
	

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	
	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}
	
	
	/**
	 * @return the listPrice
	 */
	public double getListPrice() {
		return listPrice;
	}
	/**
	 * @param listPrice the listPrice to set
	 */
	public void setListPrice(double listPrice) {
		this.listPrice = listPrice;
	}
	
	
	/**
	 * @return the salePrice
	 */
	public double getSalePrice() {
		return salePrice;
	}
	/**
	 * @param salePrice the salePrice to set
	 */
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	
	
	/**
	 * @return the quantityOnHand
	 */
	public long getQuantityOnHand() {
		return quantityOnHand;
	}
	/**
	 * @param quantityOnHand the quantityOnHand to set
	 */
	public void setQuantityOnHand(long quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}
	
	
	/**
	 * @return the imageS
	 */
	public URL getImageS() {
		return imageS;
	}
	/**
	 * @param imageS the imageS to set
	 */
	public void setImageS(URL imageS) {
		this.imageS = imageS;
	}
	
	
	/**
	 * @return the imageM
	 */
	public URL getImageM() {
		return imageM;
	}
	/**
	 * @param imageM the imageM to set
	 */
	public void setImageM(URL imageM) {
		this.imageM = imageM;
	}
	
	
	/**
	 * @return the imageL
	 */
	public URL getImageL() {
		return imageL;
	}
	/**
	 * @param imageL the imageL to set
	 */
	public void setImageL(URL imageL) {
		this.imageL = imageL;
	}

}
