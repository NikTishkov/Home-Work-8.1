package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();

        Product apple = new SimpleProduct("Яблоко", 89) {
            @Override
            public String getName() {
                return "";
            }

            @Override
            public String getStringRepresentation() {
                return super.getStringRepresentation();
            }
        };
        Product bread = new SimpleProduct("Хлеб", 56) {
            @Override
            public String getName() {
                return "";
            }

            @Override
            public String getStringRepresentation() {
                return super.getStringRepresentation();
            }
        };
        Product milk = new SimpleProduct("Молоко", 125) {
            @Override
            public String getName() {
                return "";
            }

            @Override
            public String getStringRepresentation() {
                return super.getStringRepresentation();
            }
        };
        Product cheese = new DiscountedProduct("Сыр", 195, 60) {
            @Override
            public String getName() {
                return "";
            }

            @Override
            public String getStringRepresentation() {
                return super.getStringRepresentation();
            }
        };
        Product butter = new FixPriceProduct("Масло") {
            @Override
            public String getName() {
                return "";
            }

            @Override
            public String getStringRepresentation() {
                return super.getStringRepresentation();
            }
        };
        Product banana = new SimpleProduct("Банан", 239) {
            @Override
            public String getName() {
                return "";
            }

            @Override
            public String getStringRepresentation() {
                return super.getStringRepresentation();
            }
        };

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

        System.out.println("Test version");
        SearchEngine searchEngine = new SearchEngine(10);
        //Обычные продукты
        searchEngine.add(new SimpleProduct("Кукуруза", 230) {
            @Override
            public String getName() {
                return "";
            }

            @Override
            public String getStringRepresentation() {
                return super.getStringRepresentation();
            }
        });
        searchEngine.add(new SimpleProduct("Варенье", 175) {
            @Override
            public String getName() {
                return "";
            }

            @Override
            public String getStringRepresentation() {
                return super.getStringRepresentation();
            }
        });
        searchEngine.add(new SimpleProduct("Шоколад", 365) {
            @Override
            public String getName() {
                return "";
            }

            @Override
            public String getStringRepresentation() {
                return super.getStringRepresentation();
            }
        });
        searchEngine.add(new SimpleProduct("Помидоры ташкент", 345) {
            @Override
            public String getName() {
                return "";
            }

            @Override
            public String getStringRepresentation() {
                return super.getStringRepresentation();
            }
        });
        //Прдукты со скидкой
        searchEngine.add(new DiscountedProduct("Сироп кофейный", 820, 20) {
            @Override
            public String getName() {
                return "";
            }

            @Override
            public String getStringRepresentation() {
                return super.getStringRepresentation();
            }
        });
        //Продукты с фикс ценой
        searchEngine.add(new FixPriceProduct("Бумага туалетная") {
            @Override
            public String getName() {
                return "";
            }

            @Override
            public String getStringRepresentation() {
                return super.getStringRepresentation();
            }
        });
        System.out.println("Добавлено товаров: " + searchEngine.getCurrentSize());
        System.out.println("Article add");
        //Статьи
        searchEngine.add(new Article("Бешенные скидки", "Только сегодня скидка 20% на кофейный сироп!"));
        searchEngine.add(new Article("Новости Apple", "Вышел новый Iphone 17!"));
        System.out.println("Добавлено статей: " + (searchEngine.getCurrentSize() - 6));
        System.out.println("Всего добавленно элементов в SearchEngine: " + searchEngine.getCurrentSize());
        System.out.println("Пробуем искать");
        //1
        System.out.println("Поиск по 'Бумага' :");
        Searchable[] paperResults = searchEngine.search("Бумага");
        System.out.println("Результаты: " + Arrays.toString(paperResults));
        //2
        System.out.println("Поиск по 'скидки' :");
        Searchable[] discounterResults = searchEngine.search("скидки");
        System.out.println("Результаты: " + Arrays.toString(discounterResults));
        //3
        System.out.println("Поиск по 'кофейный' :");
        Searchable[] coffeeResults = searchEngine.search("кофейный");
        System.out.println("Результаты: " + Arrays.toString(coffeeResults));
    }
}
