package com.java_24_25.finalProject.services;


import com.java_24_25.finalProject.models.Page;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope("singleton")
public class PageDataService {
    @Value("${final_project.title}")     /// THIS HAS TO BE ADJUSTED
    String projectTitle;
    List<Page> availablePages = new ArrayList<>();

    PageDataService() {
        availablePages.add(new Page("index", "Personalised books", "Home page", "/"));
        availablePages.add(new Page("createTheBook", "Create your book", "Choose features for your personal book", "/choose"));
        availablePages.add(new Page("yourBook", "Your book", "Review your book order and add shipping details", "/the_book"));
        availablePages.add(new Page("receipt", "Receipt", "See your order and assess its status", "/receipt"));
    }

    public Page getPage(String pageName) {
        for (Page page : this.availablePages) {
            if (page.getName().equalsIgnoreCase(pageName)) return page;
        }
        return null;
    }

    public List<Page> getPages() {
        return availablePages;
    }

    public String getProjectTitle() {
        return projectTitle;
    }
}