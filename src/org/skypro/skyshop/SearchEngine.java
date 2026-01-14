package org.skypro.skyshop;

public class SearchEngine {
    private Searchable[] searchableItems;
    private int currentSize;

    public SearchEngine(int capacity) {
        this.searchableItems = new Searchable[capacity];
        this.currentSize = 0;
    }

    public Searchable[] search(String query) {
        Searchable[] results = new Searchable[5];
        int resultIndex = 0;

        // Перебираем все элементы массива
        for (int i = 0; i < currentSize; i++) {
            Searchable item = searchableItems[i];
            if (item != null) {
                // Используем indexOf для поиска подстроки
                String searchTerm = item.getSearchTerm();
                if (searchTerm != null &&
                        searchTerm.toLowerCase().indexOf(query.toLowerCase()) >= 0) {
                    results[resultIndex] = item;
                    resultIndex++;

                    if (resultIndex >= 5) {
                        break;
                    }
                }
            }
        }

        return results;
    }

    public void add(Searchable item) {
        if (currentSize < searchableItems.length) {
            searchableItems[currentSize] = item;
            currentSize++;
        }
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public int getCapacity() {
        return searchableItems.length;
    }
}
