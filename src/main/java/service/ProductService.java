package service;

import model.Product;
import model.Publisher;
import repository.ProductRepository;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.Set;

public class ProductService {
    private ProductRepository productRepository = new ProductRepository();

    private PublisherService publisherService;

    public ProductService(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    public void save(String name, BigDecimal amount, String description, String publisherName) {

        Optional<Publisher> publisher = publisherService.getByName(publisherName);

        System.out.println(publisherService.hashCode());

        if (publisher.isEmpty()) {
            System.out.println("publisher bulamadım : " + publisherName);
            throw new RuntimeException("publisher bulamadım");
        }

        Product product = new Product(name, amount, description, publisher.get());

        productRepository.save(product);

        System.out.println("Product Service: saved -> " + product);
    }

    public Set<Product> getAll() {
        return productRepository.getAll();
    }

    public void listAll() {
        getAll().forEach(System.out::println);
    }
}
