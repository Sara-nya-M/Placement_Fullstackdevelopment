package com.example.Amazonclone;

import com.example.Amazonclone.Model.Product;
import com.example.Amazonclone.Repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataInitializer implements CommandLineRunner {

    private final ProductRepository productRepository;

    public DataInitializer(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (productRepository.count() == 0) {
            Product p1 = new Product();
            p1.setName("Kindle Paperwhite (16 GB)");
            p1.setPrice(139.99);
            p1.setImage("https://images-na.ssl-images-amazon.com/images/I/61k99+Yw63L._AC_SX679_.jpg");

            Product p2 = new Product();
            p2.setName("Echo Dot (5th Gen, 2022 release) | Smart speaker with Alexa");
            p2.setPrice(49.99);
            p2.setImage("https://images-na.ssl-images-amazon.com/images/I/6182B7QCoDL._AC_SX679_.jpg");

            Product p3 = new Product();
            p3.setName("Apple AirPods Pro (2nd Generation) Wireless Earbuds");
            p3.setPrice(249.00);
            p3.setImage("https://images-na.ssl-images-amazon.com/images/I/61SUj2aKoEL._AC_SX679_.jpg");

            Product p4 = new Product();
            p4.setName("Sony WH-1000XM4 Wireless Premium Noise Canceling Headphones");
            p4.setPrice(348.00);
            p4.setImage("https://images-na.ssl-images-amazon.com/images/I/71o8Q5GLAbL._AC_SX679_.jpg");

            Product p5 = new Product();
            p5.setName("ASUS ROG Zephyrus G14 Gaming Laptop");
            p5.setPrice(1599.99);
            p5.setImage("https://images-na.ssl-images-amazon.com/images/I/71R2Hw22T6L._AC_SX679_.jpg");

            Product p6 = new Product();
            p6.setName("Fujifilm Instax Mini 12 Instant Camera");
            p6.setPrice(79.95);
            p6.setImage("https://images-na.ssl-images-amazon.com/images/I/61r590h0CBL._AC_SX679_.jpg");

            productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6));
            System.out.println("Seeded database with initial Amazon products.");
        }
    }
}
