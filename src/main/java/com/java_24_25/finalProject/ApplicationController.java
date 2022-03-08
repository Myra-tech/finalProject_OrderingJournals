package com.java_24_25.finalProject;

import org.springframework.stereotype.Controller;

// HTTP request goes to the controller.
// This annotation marks that the class acts as a controller.
@Controller // It will interact with the HTTP request when a user looks to visit a page.
public class ApplicationController {}


//        addAttribute(String attributeName, Object attributeValue) ---> Add the supplied attribute under the supplied name.
//        @ModelAttribute methods are invoked before the controller methods annotated with @RequestMapping are invoked.

//    @GetMapping("/create")
//    public String showCreateTheBookPage(Model model) {
////        Šim būtu jādarbojas /the_book lapā
//        model.addAttribute("coverType", "hardcover");
//        model.addAttribute("leatherType", "vegetable tanned");
//        model.addAttribute("colourOfLeather", "black");  // colour hex black #000
//        return "createTheBook";
//    }

//    @GetMapping("/the_book")
//    public String showTheBookPage(Model model) {
//
//        model.addAttribute("theChosenCoverType", "hardcover");
//        model.addAttribute("theChosenLeatherType", "vegetable tanned");
//        model.addAttribute("theChosenColourOfLeather", "black");  // colour hex black #000
//
//        model.addAttribute("yourOrder",
//                new Orders(1,
//                        new Customer("Lilian Walko", "20 Kildare Street, D2 F8HK, Dublin, Ireland", "lilianwalko@email.com"),
//                        200,
//                        true,
//                        OrderStatus.PLACED));
//
//        List<BookDetail> myBookDetails = new ArrayList<>();
//
//        myBookDetails.add(new BookDetail("Cover type:", "hardcover", 50));
//        myBookDetails.add(new BookDetail("Leather type:","chrome tanned", 20));
//        myBookDetails.add(new BookDetail("Colour of the leather:","black", 0));
//        model.addAttribute("myBookDetails", myBookDetails);
//
//        System.out.println("The user has submitted the order.");
//
//        return "yourBook";
//    }






/*
    // HTTP request goes to the controller.
// This annotation marks that the class acts as a controller.
// It will interact with the HTTP request when a user looks to visit a page.

/*@GetMapping("/create")
public String handleBookOrderSubmission(Model model,
                                        @RequestParam(name = "coverType", required = true) String  coverType,
                                        @RequestParam(name = "leatherType") String leatherType,
                                        @RequestParam(name = "colourOfLeather") String colourOfLeather,
                                        @RequestParam(name = "size") String size,
                                        @RequestParam(name = "numberOfPages") int numberOfPages,
                                        @RequestParam(name = "paperType") String paperType,
                                        @RequestParam(name = "paperBaseColour") String paperBaseColour,
                                        @RequestParam(name = "vintageLook", required = false) String vintageLook,
                                        @RequestParam(name = "coverPrints", required = false) String coverPrints,
                                        @RequestParam(name = "additionalStyleElements", required = false) String additionalStyleElements,
                                        @RequestParam(name = "customerWishes", required = false) String customerWishes
                                        ) {
    System.out.println("The user is creating a book.");
    System.out.println("Book's input parameters are being extracted." + '\''
            + "Cover type: " + coverType + '\''
            + "Leather type: " + leatherType + '\''
            + "Colour of the leather: " + colourOfLeather + '\''
            + "Size of the book: " + size + '\''
            + "Number of pages: " + numberOfPages + '\''
            + "Paper type: " + paperType + '\''
            + "Paper base colour: " + paperBaseColour + '\''
            + "Vintage look: " + vintageLook + '\''
            + "Cover prints: " + coverPrints + '\''
            + "Additional style elements: " + additionalStyleElements + '\''
            + "Customer wishes: " + customerWishes);


    // model.addAttribute("The book order submitted" + '\n' + "Please add the shipping details.");
    return "bookCreated";
}
    @GetMapping("/bookCreated")                                                           // By default, it goes to the index page.
    public String showBookCreatedPage(Model model) {                               // The following method shows what happens when a user arrives to that page.

        model.addAttribute("coverType", "hardcover");
        model.addAttribute("leatherType", "vegetable tanned");
        model.addAttribute("leatherColour", "onionBrown");
        model.addAttribute("size", "A4");
        model.addAttribute("numberOfPages", 200);
        model.addAttribute("paperType","sketch-paper");
        model.addAttribute("paperBaseColour", "beige");
        model.addAttribute("coverPrints", "handEngravings");
        model.addAttribute("additionalStyleElements", "bookmarks");

        //System.out.println("The user is creating a book.");
        return "bookCreated";
    }


    /*@GetMapping("/create")                                                           // By default, it goes to the index page.
public String showCreateTheBookPage(Model model) {                               // The following method shows what happens when a user arrives to that page.

    System.out.println("The user is creating a book.");

    List<BookDetail> myBookDetails = new ArrayList<>();  // once selections will be made this should replace the code in yourBook page

    myBookDetails.add(new BookDetail("Cover type:", "hardcover", 50));
    myBookDetails.add(new BookDetail("Leather type:","chrome tanned", 20));
    myBookDetails.add(new BookDetail("Colour of the leather:","hardcover", 0));
    myBookDetails.add(new BookDetail("Size:","A5", 20));
    myBookDetails.add(new BookDetail("The number of pages:","150", 30));
    myBookDetails.add(new BookDetail("The type of paper:","thin", 10));
    myBookDetails.add(new BookDetail("Base colour of the paper:","beige", 0));
    myBookDetails.add(new BookDetail("Vintage look features:","distress spray stain", 30));
    myBookDetails.add(new BookDetail("Cover prints:","hand engravings", 50));
    model.addAttribute("myBookDetails", myBookDetails);

    return "createTheBook";
}


    @GetMapping("/create")                                                           // By default, it goes to the index page.

    public String handleBookOrderSubmission(Model model,
                                            @RequestParam(name = "coverType", required = true) String  coverType,
                                            @RequestParam(name = "leatherType") String leatherType,
                                            @RequestParam(name = "colourOfLeather") String colourOfLeather,
                                            @RequestParam(name = "size") String size,
                                            @RequestParam(name = "numberOfPages") int numberOfPages,
                                            @RequestParam(name = "paperType") String paperType,
                                            @RequestParam(name = "paperBaseColour") String paperBaseColour,
                                            @RequestParam(name = "vintageLook", required = false) String vintageLook,
                                            @RequestParam(name = "coverPrints", required = false) String coverPrints,
                                            @RequestParam(name = "additionalStyleElements", required = false) String additionalStyleElements,
                                            @RequestParam(name = "customerWishes", required = false) String customerWishes
    ) {

        System.out.println("The user is creating a book. Book's input parameters are being extracted.");

        // model.addAttribute("The book order submitted" + '\n' + "Please add the shipping details.");
        //return "bookCreated";
        return "createTheBook";
    }


    @GetMapping("/the_book")  // By default, it goes to the index page.
    // The following method shows what happens when a user arrives to that page.
    public String showTheBookPage(Model model) {

        model.addAttribute("coverType", "hardcover");
        model.addAttribute("leatherType", "vegetable tanned");
        model.addAttribute("leatherColour", "onionBrown");
        model.addAttribute("size", "A4");
        model.addAttribute("numberOfPages", 200);
        model.addAttribute("paperType","sketch-paper");
        model.addAttribute("paperBaseColour", "beige");
        model.addAttribute("coverPrints", "handEngravings");
        model.addAttribute("additionalStyleElements", "bookmarks");
        model.addAttribute("yourOrder", new Orders(1, "Lilian Walko",
                "20 Kildare Street, D2 F8HK, Dublin, Ireland", "lilianwalko@email.com",
                200, true, OrderStatus.PLACED));

        System.out.println("The user has submitted the order.");

        // return "<h2> Welcome to your personal orders page. </h2>";
        return "yourBook";
    }



            List<String> myBookDetails = new ArrayList<>();

        myBookDetails.add(String.valueOf(new BookDetail("Cover type:", "hardcover", 50)));
        myBookDetails.add(String.valueOf(new BookDetail("Leather type:","chrome tanned", 20)));
        myBookDetails.add(String.valueOf(new BookDetail("Colour of the leather:","hardcover", 0)));
        myBookDetails.add(new BookDetail("Size:","A5", 20));
        myBookDetails.add(new BookDetail("The number of pages:","150", 30));
        myBookDetails.add(new BookDetail("The type of paper:","thin", 10));
        myBookDetails.add(new BookDetail("Base colour of the paper:","beige", 0));
        myBookDetails.add(new BookDetail("Vintage look features:","distress spray stain", 30));
        myBookDetails.add(new BookDetail("Cover prints:","hand engravings", 50));
        model.addAttribute("myBookDetails", myBookDetails);

        Book book1 = new Book("hardcover", "chrome tanned", "black", "A5", 150,
                "thin","beige", "distress spray stain", "hand engravings"));

 */


/*@GetMapping("/create")
public String handleBookOrderSubmission(Model model,
                                        @RequestParam(name = "coverType", required = true) String  coverType,
                                        @RequestParam(name = "leatherType") String leatherType,
                                        @RequestParam(name = "colourOfLeather") String colourOfLeather,
                                        @RequestParam(name = "size") String size,
                                        @RequestParam(name = "numberOfPages") int numberOfPages,
                                        @RequestParam(name = "paperType") String paperType,
                                        @RequestParam(name = "paperBaseColour") String paperBaseColour,
                                        @RequestParam(name = "vintageLook", required = false) String vintageLook,
                                        @RequestParam(name = "coverPrints", required = false) String coverPrints,
                                        @RequestParam(name = "additionalStyleElements", required = false) String additionalStyleElements,
                                        @RequestParam(name = "customerWishes", required = false) String customerWishes
                                        ) {
    System.out.println("The user is creating a book.");
    System.out.println("Book's input parameters are being extracted." + '\''
            + "Cover type: " + coverType + '\''
            + "Leather type: " + leatherType + '\''
            + "Colour of the leather: " + colourOfLeather + '\''
            + "Size of the book: " + size + '\''
            + "Number of pages: " + numberOfPages + '\''
            + "Paper type: " + paperType + '\''
            + "Paper base colour: " + paperBaseColour + '\''
            + "Vintage look: " + vintageLook + '\''
            + "Cover prints: " + coverPrints + '\''
            + "Additional style elements: " + additionalStyleElements + '\''
            + "Customer wishes: " + customerWishes);


    // model.addAttribute("The book order submitted" + '\n' + "Please add the shipping details.");
    return "bookCreated";
}
    @GetMapping("/bookCreated")                                                           // By default, it goes to the index page.
    public String showBookCreatedPage(Model model) {                               // The following method shows what happens when a user arrives to that page.

        model.addAttribute("coverType", "hardcover");
        model.addAttribute("leatherType", "vegetable tanned");
        model.addAttribute("leatherColour", "onionBrown");
        model.addAttribute("size", "A4");
        model.addAttribute("numberOfPages", 200);
        model.addAttribute("paperType","sketch-paper");
        model.addAttribute("paperBaseColour", "beige");
        model.addAttribute("coverPrints", "handEngravings");
        model.addAttribute("additionalStyleElements", "bookmarks");

        //System.out.println("The user is creating a book.");
        return "bookCreated";
    }
*/

    /*@GetMapping("/create")                                                           // By default, it goes to the index page.
public String showCreateTheBookPage(Model model) {                               // The following method shows what happens when a user arrives to that page.

    System.out.println("The user is creating a book.");

    List<BookDetail> myBookDetails = new ArrayList<>();  // once selections will be made this should replace the code in yourBook page

    myBookDetails.add(new BookDetail("Cover type:", "hardcover", 50));
    myBookDetails.add(new BookDetail("Leather type:","chrome tanned", 20));
    myBookDetails.add(new BookDetail("Colour of the leather:","hardcover", 0));
    myBookDetails.add(new BookDetail("Size:","A5", 20));
    myBookDetails.add(new BookDetail("The number of pages:","150", 30));
    myBookDetails.add(new BookDetail("The type of paper:","thin", 10));
    myBookDetails.add(new BookDetail("Base colour of the paper:","beige", 0));
    myBookDetails.add(new BookDetail("Vintage look features:","distress spray stain", 30));
    myBookDetails.add(new BookDetail("Cover prints:","hand engravings", 50));
    model.addAttribute("myBookDetails", myBookDetails);

    return "createTheBook";
}
*/

//    @GetMapping("/create")                                                           // By default, it goes to the index page.
//
//    public String handleBookOrderSubmission(Model model,
//                                            @RequestParam(name = "coverType", required = true) String  coverType,
//                                            @RequestParam(name = "leatherType") String leatherType,
//                                            @RequestParam(name = "colourOfLeather") String colourOfLeather,
//                                            @RequestParam(name = "size") String size,
//                                            @RequestParam(name = "numberOfPages") int numberOfPages,
//                                            @RequestParam(name = "paperType") String paperType,
//                                            @RequestParam(name = "paperBaseColour") String paperBaseColour,
//                                            @RequestParam(name = "vintageLook", required = false) String vintageLook,
//                                            @RequestParam(name = "coverPrints", required = false) String coverPrints,
//                                            @RequestParam(name = "additionalStyleElements", required = false) String additionalStyleElements,
//                                            @RequestParam(name = "customerWishes", required = false) String customerWishes
//    ) {
//
//        System.out.println("The user is creating a book. Book's input parameters are being extracted.");
//
//        // model.addAttribute("The book order submitted" + '\n' + "Please add the shipping details.");
//        //return "bookCreated";
//        return "createTheBook";
//    }


//    @GetMapping("/the_book")  // By default, it goes to the index page.
//    // The following method shows what happens when a user arrives to that page.
//    public String showTheBookPage(Model model) {
//
//        model.addAttribute("coverType", "hardcover");
//        model.addAttribute("leatherType", "vegetable tanned");
//        model.addAttribute("leatherColour", "onionBrown");
//        model.addAttribute("size", "A4");
//        model.addAttribute("numberOfPages", 200);
//        model.addAttribute("paperType","sketch-paper");
//        model.addAttribute("paperBaseColour", "beige");
//        model.addAttribute("coverPrints", "handEngravings");
//        model.addAttribute("additionalStyleElements", "bookmarks");
//        model.addAttribute("yourOrder", new Orders(1, "Lilian Walko",
//                "20 Kildare Street, D2 F8HK, Dublin, Ireland", "lilianwalko@email.com",
//                200, true, OrderStatus.PLACED));
//
//        System.out.println("The user has submitted the order.");
//
//        // return "<h2> Welcome to your personal orders page. </h2>";
//        return "yourBook";
//    }



