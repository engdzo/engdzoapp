package com.example.jamyangthinley.engdzoterminologyapp.utils;

public class DictionaryModel {
    private String id;
    private String term;
    private String acronyms;
    private String wordclass;
    private String dzongkhaequivalent;
    private String definition;
    private String category;

    public DictionaryModel(String id, String term, String acronyms, String wordclass, String dzongkhaequivalent, String definition, String category) {
        this.id = id;
        this.term = term;
        this.acronyms = acronyms;
        this.wordclass = wordclass;
        this.dzongkhaequivalent = dzongkhaequivalent;
        this.definition = definition;
        this.category = category;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getAcronyms() {
        return acronyms;
    }

    public void setAcronyms(String acronyms) {
        this.acronyms = acronyms;
    }

    public String getWordclass() {
        return wordclass;
    }

    public void setWordclass(String wordclass) {
        this.wordclass = wordclass;
    }

    public String getDzongkhaequivalent() {
        return dzongkhaequivalent;
    }

    public void setDzongkhaequivalent(String dzongkhaequivalent) {
        this.dzongkhaequivalent = dzongkhaequivalent;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

