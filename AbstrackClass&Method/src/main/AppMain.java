package main;
import child.Item;
import parents.Product;

public class AppMain {
	Product product1  = new Product();//Tidak dapat langsung diinstansiasi menjadi object karena class Product adalah Abstract/
	Product product2 = new Item();//Dapat membuat objek Product dari instansiasi Child class item.
}
