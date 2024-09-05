import java.util.List;
import java.util.Optional;

interface ProductRepository {
      void addProduct(Product product);
      Optional<Product> findProductById(int productId);
      List<Product> getAllProducts();
      void updateProduct(Product product);
      void deleteProduct(int productId);
  }