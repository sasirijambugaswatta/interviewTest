import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class ProductRepositoryImpl implements ProductRepository {
    private List<Product> products = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public Optional<Product> findProductById(int productId) {
        return products.stream()
                .filter(p -> p.getProductId() == productId)
                .findFirst();
    }

    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }

    @Override
    public void updateProduct(Product updatedProduct) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductId() == updatedProduct.getProductId()) {
                products.set(i, updatedProduct);
                return;
            }
        }
    }

    @Override
    public void deleteProduct(int productId) {
        products.removeIf(p -> p.getProductId() == productId);
    }
}