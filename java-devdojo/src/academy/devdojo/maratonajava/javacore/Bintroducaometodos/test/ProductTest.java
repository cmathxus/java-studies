package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Product;

public class ProductTest {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.init("Bread", 20, 200);
        product1.printer();
        product1.addToStock(20);
        product1.printer(); // Teste adicionar ao estoque
        product1.removeFromStock(210);
        product1.printer(); // Teste remover do estoque
        product1.removeFromStock(200);
        product1.printer(); // Teste remover mais do que o numero em estoque
    }
}
