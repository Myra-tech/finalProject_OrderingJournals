package com.java_24_25.finalProject;

public class Calculator {

    public double calculateThePriceForTheCover(String coverType) {
        double coverPrice = 0.0;

        if (coverType.equals("journal")) {
            coverPrice = 20.0d;
            System.out.println("The price of journal is " + coverPrice);
        } else {
            coverPrice = 30.0d;
            System.out.println("The price of hardcover is " + coverPrice);
        }
        return coverPrice;
    }

    public double calculateLeatherTypePrice(String leatherType, String coverType, String size) {
        double leatherTypePrice = 0;

        if (coverType.equals("journal")) {
            if (leatherType.equals("chrome")) {
                if (size.equals("A5")) {
                    leatherTypePrice = 6.0;
                } else if (size.equals("B5")) {
                    leatherTypePrice = 7;
                } else if (size.equals("A4")) {
                    leatherTypePrice = 9.0;
                } else {
                    System.out.println("The entry is not recognized.");
                }
            } else if (leatherType.equals("vegetable")) {
                if (size.equals("A5")) {
                    leatherTypePrice = 9.2;
                } else if (size.equals("B5")) {
                    leatherTypePrice = 11.0;
                } else if (size.equals("A4")) {
                    leatherTypePrice = 14.0;
                }
            }
        } else if (coverType.equals("hardcover")) {
            if (leatherType.equals("chrome")) {
                if (size.equals("A5")) {
                    leatherTypePrice = 8.3;
                } else if (size.equals("B5")) {
                    leatherTypePrice = 10;
                } else if (size.equals("A4")) {
                    leatherTypePrice = 12.5;
                }
            } else if (leatherType.equals("vegetable")) {
                if (size.equals("A5")) {
                    leatherTypePrice = 12.5;
                } else if (size.equals("B5")) {
                    leatherTypePrice = 15.0;
                } else if (size.equals("A4")) {
                    leatherTypePrice = 19.0;
                }
            }
        } else {
            System.out.println("The entry is not recognized.");
        }
        System.out.println("'leatherTypePrice' for coverType: " + coverType + "; leatherType: " + leatherType + "; of size: " + size + " IS " + leatherTypePrice);
        return leatherTypePrice;
    }

    public double calculatePaperTypePrice(String paperType, String size) {
        double paperTypePrice = 0;

        if (paperType.equals("sketch")) {
            if (size.equals("A5")) {
                paperTypePrice = 3.0;
            } else if (size.equals("B5")) {
                paperTypePrice = 3.5;
            } else if (size.equals("A4")) {
                paperTypePrice = 4.3;
            }
        } else if (paperType.equals("drawing")) {
            if (size.equals("A5")) {
                paperTypePrice = 3.5;
            } else if (size.equals("B5")) {
                paperTypePrice = 4.4;
            } else if (size.equals("A4")) {
                paperTypePrice = 5.3;
            }
        } else if (paperType.equals("watercolor")) {
            if (size.equals("A5")) {
                paperTypePrice = 5.0;
            } else if (size.equals("B5")) {
                paperTypePrice = 7.0;
            } else if (size.equals("A4")) {
                paperTypePrice = 8.5;
            }
        } else System.out.println("The entry is not recognized.");

        System.out.println("Price for the paper type " + paperType + " of size " + size + " equals " + paperTypePrice + ".");
        return paperTypePrice;
    }

    public double calculateNumberOfPagesPrice(double paperTypePrice, int numberOfPages) {
        double newPaperTypePrice = paperTypePrice;

        if (numberOfPages == 100) {
            newPaperTypePrice = paperTypePrice * 2;
        } else if (numberOfPages == 150) {
            newPaperTypePrice = paperTypePrice * 3;
        } else if (numberOfPages == 200) {
            newPaperTypePrice = paperTypePrice * 4;
        } else if (numberOfPages == 250) {
            newPaperTypePrice = paperTypePrice * 5;
        } else if (numberOfPages == 300) {
            newPaperTypePrice = paperTypePrice * 6;
        } else {
            System.out.println("The entry is not recognized.");
        }

        System.out.println("Price for the paper when number of pages is " + numberOfPages + " is " + newPaperTypePrice + ".");
        return newPaperTypePrice;
    }

    public double calculatePaperColorPrice(String paperBaseColour, String paperType, String size, int numberOfPages) {
        double paperColorPrice = 0;
        double tempColorPrice = 0;

        if (paperType.equals("sketch") && (!paperBaseColour.equals("white"))) {
            if (size.equals("A5")) {
                tempColorPrice = 2.2;
            } else if (size.equals("B5")) {
                tempColorPrice = 2.7;
            } else if (size.equals("A4")) {
                tempColorPrice = 3.3;
            }
        }
        System.out.println("Price for non-white sketch paper when size is " + size + " is " + tempColorPrice + ".");

        if (numberOfPages == 100) {
            paperColorPrice = tempColorPrice * 2;
        } else if (numberOfPages == 150) {
            paperColorPrice = tempColorPrice * 3;
        } else if (numberOfPages == 200) {
            paperColorPrice = tempColorPrice * 4;
        } else if (numberOfPages == 250) {
            paperColorPrice = tempColorPrice * 5;
        } else if (numberOfPages == 300) {
            paperColorPrice = tempColorPrice * 6;
        } else {
            System.out.println("The entry is not recognized.");
        }

        System.out.println("Price for " + numberOfPages + " pages of non-white sketch paper of size " + size + " is " + paperColorPrice + ".");
        return paperColorPrice;
    }

    public double calculateLeatherColorPrice(String leatherType, String colourOfLeather, String size) {
        double leatherColourPrice = 0;

        if (leatherType.equals("vegetable")) {
            if (colourOfLeather.equals("natural")) {
                if (size.equals("A5")) {
                    leatherColourPrice = 0.5;
                } else if (size.equals("B5")) {
                    leatherColourPrice = 0.75;
                } else if (size.equals("A4")) {
                    leatherColourPrice = 1;
                }
            } else if (colourOfLeather.equals("black") || colourOfLeather.equals("dark brown") || colourOfLeather.equals("caramel") ||
                    colourOfLeather.equals("red")) {
                if (size.equals("A5")) {
                    leatherColourPrice = 3.0;
                } else if (size.equals("B5")) {
                    leatherColourPrice = 4.0;
                } else if (size.equals("A4")) {
                    leatherColourPrice = 5.0;
                }
            } else if (colourOfLeather.equals("white leather")) {
                if (size.equals("A5")) {
                    leatherColourPrice = 4.0;
                } else if (size.equals("B5")) {
                    leatherColourPrice = 6.0;
                } else if (size.equals("A4")) {
                    leatherColourPrice = 8.0;
                }
            } else if (colourOfLeather.equals("multi")) {
                if (size.equals("A5")) {
                    leatherColourPrice = 5;
                } else if (size.equals("B5")) {
                    leatherColourPrice = 10;
                } else if (size.equals("A4")) {
                    leatherColourPrice = 15;
                }
            }
        } else {
            System.out.println("The entry is not recognized.");
        }

        System.out.println("Price for " + leatherType + " leather in " + colourOfLeather + " colour of " + size + " book is " + leatherColourPrice + ".");
        return leatherColourPrice;
    }

    public double calculateTotalBookPrice(double coverPrice, double leatherTypePrice, double numberOfPagesPrice, double paperColorPrice, double leatherColourPrice) {

        double totalBookPrice = coverPrice + leatherTypePrice + numberOfPagesPrice + paperColorPrice + leatherColourPrice;
        System.out.println("The total price of the book is " + totalBookPrice + ".");

        return totalBookPrice;
    }
}

