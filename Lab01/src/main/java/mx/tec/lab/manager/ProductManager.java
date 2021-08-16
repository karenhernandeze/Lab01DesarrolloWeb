package mx.tec.lab.manager;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import mx.tec.lab.vo.Product;
import mx.tec.lab.vo.Sku;

/**
 * The ProductManager class exists to provide logic to operate on the data sent 
 * to and from the Value Objects class and the client. This layer provides code modularity, 
 * the business logic and rules are specified. 
 *
 * @author  Karen Alicia Hernandez
 * @version 1.0
 */

@Service
public class ProductManager {

	/**
	 * List that includes the Products added. 
	 */
	private List<Product> products;

	/**
	 * Create Products to add them to the products list.
	 * @throws MalformedURLException 
	 */
	public ProductManager() throws MalformedURLException {
		products = new ArrayList<>();

		Product product1 = new Product("prod123", "Levi's 501 Original Fit Jeans Jeans para Hombre", "100% algodón, Cierre de Cremallera, Lavar a máquina, Jeans corte ajustado, Pierna ajustada, Stretch especial que te brinda mayor movilidad", Collections.emptyList());
		List<Sku> childSkus1 = new ArrayList<>();
		URL blackImage = new URL("https://lsco.scene7.com/is/image/lsco/levis/clothing/005010165-front-pdp.jpg?fmt=jpeg&qlt=70,1&op_sharpen=0&resMode=sharp2&op_usm=0.8,1,10,0&fit=crop,0&wid=450&hei=750");
		URL darkStoneWashImage = new URL("https://target.scene7.com/is/image/Target/GUEST_7ccb0e2f-4ffb-4e21-893d-aadc3a5b188b?wid=488&hei=488&fmt=pjpeg");

		childSkus1.add(new Sku("sku1234", "Black", "29W X 32L", 1027.24, 1027.24, 500, blackImage, blackImage, blackImage));
		childSkus1.add(new Sku("sku1235", "Dark Stonewash", "29W X 32L", 1027.24, 706.93, 200, darkStoneWashImage, darkStoneWashImage, darkStoneWashImage));
		product1.setChildSkus(childSkus1);

		products.add(product1);

		Product product2 = new Product("prod124", "Levi's Innovation Super Skinny Jeans para Mujer", "85% Algodón, 9% Elastomultiester, 6% Elastano, Lavar a máquina, Pantalón, Mezclilla, Cintura Media, Ajustado Desde la Cadera al Muslo, Pierna Súper Ajustada", Collections.emptyList());
		List<Sku> childSkus2 = new ArrayList<>();	
		URL womanJeansImage = new URL("https://m.media-amazon.com/images/I/71xnxd2eGTL._AC_UY445_.jpg");
		childSkus2.add(new Sku("sku1236", "Black Galaxy", "25W X 30L", 661.79, 661.79, 300, womanJeansImage, womanJeansImage, womanJeansImage));
		childSkus2.add(new Sku("sku1237", "Black Galaxy", "26W X 30L", 661.79, 661.79, 400, womanJeansImage, womanJeansImage, womanJeansImage));
		childSkus2.add(new Sku("sku1238", "Black Galaxy", "27W X 30L", 661.79, 661.79, 800, womanJeansImage, womanJeansImage, womanJeansImage));
		product2.setChildSkus(childSkus2);

		products.add(product2);
	}

	/**
	 * This method is used to retrieve all the products currently in the 'products' list. 
	 * @return a List with the type Product. 
	 */
	public List<Product> getProducts() {
		return products;
	}

	/**
	 * This method is used to retrieve a product using its id.
	 * @param id of the product. 
	 * @return an object of type Product. 
	 */
	public Optional<Product> getProduct(final String id) {
		Optional<Product> foundProduct = Optional.empty();

		for (final Product product : products) {
			if (product.getId().equals(id)) {
				foundProduct = Optional.of(product);
				break;
			}
		}
		return foundProduct;
	}

	/**
	 * This method is used to create a new product. The Product type attributes can be found in 
	 * the mx.tec.lab.vo Product class. 
	 * @param Product object.
	 * @return the Product that was given in the param.
	 */
	public Optional<Product> addProduct(final Product newProduct) {
		products.add(newProduct);
		return Optional.of(newProduct);
	}

	/**
	 * This method is used to delete a product given an id. 
	 * @param Product id.
	 * @return the Product that was deleted.
	 */
	public Optional<Product> deleteProduct(final String id) {
		Optional<Product> deletedProduct = Optional.empty();

		for (final Product product : products) {
			if (product.getId().equals(id)) {
				deletedProduct = Optional.of(product);
				products.remove(product);
				break;
			}
		}



		return deletedProduct;
	}

	/**
	 * This method is used to update an existing product. Given an id and the new attributes of 
	 * given product. 
	 * @param Product id and object.
	 * @return the Product updated.
	 */
	public Optional<Product> updateProduct(final String id, final Product updatedProduct) {

		Optional<Product> existingProduct = Optional.empty();

		for (final Product product : products) {
			if (product.getId().equals(id)) {
				product.setDescription(updatedProduct.getDescription());
				product.setName(updatedProduct.getName());
				product.setChildSkus(updatedProduct.getChildSkus());
				existingProduct = Optional.of(product);
				break;
			}
		}

		return existingProduct;
	}
}
