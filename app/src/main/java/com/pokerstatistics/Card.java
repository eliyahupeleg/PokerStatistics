package com.pokerstatistics;

public class Card {

    // the card in numbers. 1-13. "as" is 1. king is 13.
    private int number = 0;

    // the shape on the card. 'd', 'h', 's', 'c'.
    private char shape = ' ';

    // constructor. always with all the values.
    Card(int number, char shape){

        // check if the values of number and shape is valid.
        switch (shape){
            case 'd':
            case 'c':
            case 's':
            case 'h':
                if (number > 0 && number < 14){
                    break;
                }

            default:
                return;
        }

        this.number = number;
        this.shape = shape;
    }

    // get the number of the card.
    public int getNumber(){
        return number;
    }

    // get the shape on the card.
    public char getshape(){
        return shape;
    }

}
