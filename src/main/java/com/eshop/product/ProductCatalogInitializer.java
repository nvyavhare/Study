package com.eshop.product;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductCatalogInitializer {

	@Bean
	ApplicationRunner initializeProducts(ProductRepository productRepository) {
		return args -> {
			if (productRepository.count() == 0) {
				productRepository.saveAll(List.of(
						new Product("ELEC-001", "Wireless Headphones", "Electronics",
								"Over-ear Bluetooth headphones with active noise cancellation.",
								new BigDecimal("89.99"), 24, "/images/wireless-headphones.jpg"),
						new Product("HOME-001", "Ceramic Table Lamp", "Home",
								"Minimal ceramic lamp with a warm fabric shade.",
								new BigDecimal("54.50"), 12, "/images/ceramic-table-lamp.jpg"),
						new Product("FASH-001", "Everyday Backpack", "Accessories",
								"Lightweight water-resistant backpack with a padded laptop sleeve.",
								new BigDecimal("39.95"), 30, "/images/everyday-backpack.jpg"),
						new Product("KITCH-001", "Stainless Steel Bottle", "Kitchen",
								"Insulated reusable bottle that keeps drinks cold or hot.",
								new BigDecimal("22.00"), 50, "/images/steel-bottle.jpg"),
						new Product("BOOK-001", "The Practical Home Cook", "Books",
								"A beginner-friendly cookbook for everyday meals.",
								new BigDecimal("18.99"), 16, "/images/practical-home-cook.jpg")));
			}
		};
	}
}
