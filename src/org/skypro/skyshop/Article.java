package org.skypro.skyshop;

public class Article implements Searchable {
    private final String articleTitle;
    private final String articleText;

    public Article(String articleTitle, String articleText) {
        this.articleTitle = articleTitle;
        this.articleText = articleText;
    }

    @Override
    public String getSearchTerm() {
        return articleTitle + " " + articleText;
    }

    @Override
    public String getContentType() {
        return "ARTICLE";
    }

    @Override
    public String toString() {
        return "Article: " +
                "articleTitle - '" + articleTitle + "' " +
                ", articleText - '" + articleText + "'";
    }

    @Override
    public String getName() {
        return articleTitle;
    }

    public String getArticleText() {
        return articleText;
    }
}
