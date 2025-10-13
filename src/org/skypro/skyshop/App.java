package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();

        Product apple = new SimpleProduct("Яблоко", 89);
        Product bread = new SimpleProduct("Хлеб", 56);
        Product milk = new SimpleProduct("Молоко", 125);
        Product cheese = new DiscountedProduct("Сыр", 195, 60);
        Product butter = new FixPriceProduct("Масло");
        Product banana = new SimpleProduct("Банан",239);

        System.out.println("Task 1. Добавление продуктов в корзину:");
        basket.addProduct(apple);
        basket.addProduct(bread);
        basket.addProduct(milk);
        basket.addProduct(cheese);
        basket.addProduct(butter);
        System.out.println("   Добавлено 5 продуктов");

        System.out.print("Task 2. Попытка добавления в заполненную корзину: ");
        basket.addProduct(banana);

        System.out.println("Task 3. Содержимое корзины с товарами:");
        basket.printBasketContents();
        System.out.println();

        System.out.println("Task 4. Общая стоимость корзины:");
        int totalCost = basket.getTotalCost();
        System.out.println("   Общая стоимость: " + totalCost + " руб.");
        System.out.println();

        System.out.println("Task 5. Поиск существующего товара:");
        boolean hasApple = basket.containsProduct("Яблоко");
        boolean hasBread = basket.containsProduct("Хлеб");
        System.out.println("   Яблоко в корзине: " + hasApple);
        System.out.println("   Хлеб в корзине: " + hasBread);
        System.out.println();

        System.out.println("Task 6. Поиск отсутствующего товара:");
        boolean hasBanana = basket.containsProduct("Банан");
        boolean hasOrange = basket.containsProduct("Апельсин");
        System.out.println("   Банан в корзине: " + hasBanana);
        System.out.println("   Апельсин в корзине: " + hasOrange);
        System.out.println();

        System.out.println("Task 7. Очистка корзины:");
        basket.clearBasket();
        System.out.println("   Корзина очищена");
        System.out.println("   Количество продуктов после очистки: " + basket.getProductCount());
        System.out.println();


        System.out.println("Task 8. Содержимое пустой корзины:");
        basket.printBasketContents();
        System.out.println();

        System.out.println("Task 9. Стоимость пустой корзины:");
        int emptyCost = basket.getTotalCost();
        System.out.println("   Стоимость пустой корзины: " + emptyCost + " руб.");
        System.out.println();

        System.out.println("Task 10. Поиск в пустой корзине:");
        boolean searchInEmpty = basket.containsProduct("Яблоко");
        System.out.println("   Поиск 'Яблоко' в пустой корзине: " + searchInEmpty);
    }
}
