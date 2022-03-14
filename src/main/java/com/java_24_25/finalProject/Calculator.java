package com.java_24_25.finalProject;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Calculator {

    public double calculateThePriceForTheCover(String coverType) {
        double coverPrice = 0.0;

        if (coverType.equals("journal")) {
            coverPrice = 20d;
            System.out.println("The price of journal is " + coverPrice);
        } else {
            coverPrice = 30d;
            System.out.println("The price of hardcover is " + coverPrice);
        }
        return coverPrice;
    }

    public double calculateLeatherTypePrice(String leatherType, String coverType, String size) {
        double leatherTypePrice = 0.0;

        if (coverType.equals("journal")) {
            if (leatherType.equals("chrome")) {
                if (size.equals("A5")) {
                    leatherTypePrice = 6d;
                } else if (size.equals("B5")) {
                    leatherTypePrice = 7d;
                } else if (size.equals("A4")) {
                    leatherTypePrice = 9d;
                } else {
                    System.out.println("The entry is not recognized.");
                }
            } else if (leatherType.equals("vegetable")) {
                if (size.equals("A5")) {
                    leatherTypePrice = 9.2d;
                } else if (size.equals("B5")) {
                    leatherTypePrice = 11d;
                } else if (size.equals("A4")) {
                    leatherTypePrice = 14d;
                } else {
                }
            } else System.out.println("The entry is not recognized.");
        } else if (coverType.equals("hardcover")) {
            if (leatherType.equals("chrome")) {
                if (size.equals("A5")) {
                    leatherTypePrice = 8.3d;
                } else if (size.equals("B5")) {
                    leatherTypePrice = 10d;
                } else if (size.equals("A4")) {
                    leatherTypePrice = 12.5d;
                } else {
                    System.out.println("The entry is not recognized.");
                }
            } else if (leatherType.equals("vegetable")) {
                if (size.equals("A5")) {
                    leatherTypePrice = 12.5d;
                } else if (size.equals("B5")) {
                    leatherTypePrice = 15d;
                } else if (size.equals("A4")) {
                    leatherTypePrice = 19d;
                } else {
                    System.out.println("The entry is not recognized.");
                }
            } else System.out.println("The entry is not recognized.");
        } else System.out.println("The entry is not recognized.");

        System.out.println("Price of the leather for " + coverType + " and leather type " + leatherType + " equals " + leatherTypePrice + ".");
        return leatherTypePrice;
    }

    public double calculatePaperTypePrice(String paperType, String size, String numberOfPages) {
        double paperTypePrice = 0;

        if (paperType.equals("sketch")) {
            if (size.equals("A5")) {
                paperTypePrice = 3d;
            } else if (size.equals("B5")) {
                paperTypePrice = 3.5d;
            } else if (size.equals("A4")) {
                paperTypePrice = 4.3d;
            }
        } else if (paperType.equals("drawing")) {
            if (size.equals("A5")) {
                paperTypePrice = 3.5d;
            } else if (size.equals("B5")) {
                paperTypePrice = 4.4d;
            } else if (size.equals("A4")) {
                paperTypePrice = 5.3d;
            }
        } else if (paperType.equals("watercolor")) {
            if (size.equals("A5")) {
                paperTypePrice = 5d;
            } else if (size.equals("B5")) {
                paperTypePrice = 7d;
            } else if (size.equals("A4")) {
                paperTypePrice = 8.5d;
            }
        } else System.out.println("The entry is not recognized.");

        System.out.println("Price for the paper type " + paperType + " of size " + size + " equals " + paperTypePrice + ".");
        return paperTypePrice;
    }

    public double calculateNumberOfPagesPrice(double paperTypePrice, String numberOfPages) {
        double newPaperTypePrice = paperTypePrice;

        if (numberOfPages == "100") {
            newPaperTypePrice = paperTypePrice * 2;
        } else if (numberOfPages == "150") {
            newPaperTypePrice = paperTypePrice * 3;
        } else if (numberOfPages == "200") {
            newPaperTypePrice = paperTypePrice * 4;
        } else if (numberOfPages == "250") {
            newPaperTypePrice = paperTypePrice * 5;
        } else if (numberOfPages == "300") {
            newPaperTypePrice = paperTypePrice * 6;
        } else {
            System.out.println("The entry is not recognized.");
        }

        System.out.println("Price for the paper when number of pages is " + numberOfPages + " is " + newPaperTypePrice + ".");
        return newPaperTypePrice;
    }

    public double calculatePaperColorPrice(String paperBaseColour, String paperType, String size, String numberOfPages) {
        double paperColorPrice = 0;
        double tempColorPrice = 0;

        if (paperType.equals("sketch") && (!paperBaseColour.equals("white"))) {
            if (size.equals("A5")) {
                tempColorPrice = 2.2d;
            } else if (size.equals("B5")) {
                tempColorPrice = 2.7d;
            } else if (size.equals("A4")) {
                tempColorPrice = 3.3d;
            }
        }
        System.out.println("Price for non-white sketch paper when size is " + size + " is " + tempColorPrice + ".");

        if (numberOfPages == "100") {
            paperColorPrice = tempColorPrice * 2;
        } else if (numberOfPages == "150") {
            paperColorPrice = tempColorPrice * 3;
        } else if (numberOfPages == "200") {
            paperColorPrice = tempColorPrice * 4;
        } else if (numberOfPages == "250") {
            paperColorPrice = tempColorPrice * 5;
        } else if (numberOfPages == "300") {
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
                    leatherColourPrice = 0.5d;
                } else if (size.equals("B5")) {
                    leatherColourPrice = 0.75d;
                } else if (size.equals("A4")) {
                    leatherColourPrice = 1d;
                }
            } else if (colourOfLeather.equals("black") || colourOfLeather.equals("dark brown") || colourOfLeather.equals("caramel") ||
                    colourOfLeather.equals("red")) {
                if (size.equals("A5")) {
                    leatherColourPrice = 3d;
                } else if (size.equals("B5")) {
                    leatherColourPrice = 4d;
                } else if (size.equals("A4")) {
                    leatherColourPrice = 5d;
                }
            } else if (colourOfLeather.equals("white leather")) {
                if (size.equals("A5")) {
                    leatherColourPrice = 4d;
                } else if (size.equals("B5")) {
                    leatherColourPrice = 6d;
                } else if (size.equals("A4")) {
                    leatherColourPrice = 8d;
                }
            } else if (colourOfLeather.equals("multi")) {
                if (size.equals("A5")) {
                    leatherColourPrice = 5d;
                } else if (size.equals("B5")) {
                    leatherColourPrice = 10d;
                } else if (size.equals("A4")) {
                    leatherColourPrice = 15d;
                }
            }
        } else {
            System.out.println("The entry is not recognized.");
        }

        System.out.println("Price for " + leatherType + " leather in " + colourOfLeather + " colour of " + size +
                " book is " + leatherColourPrice + ".");
        return leatherColourPrice;
    }

    public double calculateTotalBookPrice(double coverPrice, double leatherTypePrice, double numberOfPagesPrice,
                                          double paperColorPrice, double leatherColourPrice) {

        double totalBookPrice = coverPrice + leatherTypePrice + numberOfPagesPrice + paperColorPrice + leatherColourPrice;
        System.out.println("The total price of the book is " + totalBookPrice + ".");
        return totalBookPrice;
    }
}