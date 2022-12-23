import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Recipe {
    private String name;
    private Map<Product, Integer> products;
    private double totalCost;

    public Recipe(String name) {
        this.name = name;
        this.products = new HashMap();
        this.totalCost = 0;
    }
    public void add(Product product){
        add(product, 1);
    }
    public void add(Product product, int amount){
        if (products.containsKey(product)){
            throw new IllegalArgumentException("Такой продукт уже есть!");
        }
        products.put(product, amount);
        totalCost += amount * product.getCost();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
