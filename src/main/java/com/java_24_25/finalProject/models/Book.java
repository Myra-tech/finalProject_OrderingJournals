package com.java_24_25.finalProject.models;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
//MAIN DETAILS
    private String bookName;
    private String coverType;
    private String leatherType;
    private String size;
    private int numberOfPages;
    private String paperType;
    private String paperColor;
    private String leatherColor;
    private String leatherColorComment;;
//OPTIONAL DETAILS
    private String vintagePaper;
    private String coverLayer;
    private String closure;
    private String print;
    private String printComment;
    private String bookmark;
    private String screwStuds;
    private String screwStudComment;
    private String generalComment;
//ORDERING DETAIL
    private Date orderDate;

    public Book(String bookName, String coverType, String leatherType, String size, int numberOfPages,
                String paperType, String paperColor, String leatherColor, String leatherColorComment,
                String vintagePaper, String coverLayer, String closure, String print, String printComment,
                String bookmark, String screwStuds, String screwStudComment, String generalComment) {
        this.bookName = bookName;
        this.coverType = coverType;
        this.leatherType = leatherType;
        this.size = size;
        this.numberOfPages = numberOfPages;
        this.paperType = paperType;
        this.paperColor = paperColor;
        this.leatherColor = leatherColor;
        this.leatherColorComment = leatherColorComment;
        this.vintagePaper = vintagePaper;
        this.coverLayer = coverLayer;
        this.closure = closure;
        this.print = print;
        this.printComment = printComment;
        this.bookmark = bookmark;
        this.screwStuds = screwStuds;
        this.screwStudComment = screwStudComment;
        this.generalComment = generalComment;
    }

    public Book(String bookName, String coverType, String leatherType, String size, int numberOfPages, String paperType,
                String paperColor, String leatherColor, String vintagePaper, String coverLayer, String closure,
                String print, String bookmark, String screwStuds) {
        this.bookName = bookName;
        this.coverType = coverType;
        this.leatherType = leatherType;
        this.size = size;
        this.numberOfPages = numberOfPages;
        this.paperType = paperType;
        this.paperColor = paperColor;
        this.leatherColor = leatherColor;
        this.vintagePaper = vintagePaper;
        this.coverLayer = coverLayer;
        this.closure = closure;
        this.print = print;
        this.bookmark = bookmark;
        this.screwStuds = screwStuds;
    }
}