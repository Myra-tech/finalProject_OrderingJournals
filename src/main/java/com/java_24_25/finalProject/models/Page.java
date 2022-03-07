package com.java_24_25.finalProject.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Page {
    private String name;
    private String pageTitle;
    private String pageDescription;
    private String pageUrl;
}
