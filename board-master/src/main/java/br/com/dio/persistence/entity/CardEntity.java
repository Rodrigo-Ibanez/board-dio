package br.com.dio.persistence.entity;

import lombok.Data;

@Data
public class CardEntity {

    private Long id;
    private String title;
    private String description;
    private BoardColumnEntity boardColumn = new BoardColumnEntity();

    public String getTitle() {
        return "";
    }

    public String getDescription() {
        return "";
    }

    public Thread getBoardColumn() {
        return null;
    }
}
