package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println("Test version");
        SearchEngine searchEngine = new SearchEngine(10);
        //Обычные продукты
        searchEngine.add(new SimpleProduct("Кукуруза", 245));
        searchEngine.add(new SimpleProduct("Варенье", 175));
        searchEngine.add(new SimpleProduct("Шоколад", 365));
        searchEngine.add(new SimpleProduct("Помидоры ташкент", 345));
        //Прдукты со скидкой
        searchEngine.add(new DiscountedProduct("Сироп кофейный", 820, 20));
        //Продукты с фикс ценой
        searchEngine.add(new FixPriceProduct("Бумага туалетная"));

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
