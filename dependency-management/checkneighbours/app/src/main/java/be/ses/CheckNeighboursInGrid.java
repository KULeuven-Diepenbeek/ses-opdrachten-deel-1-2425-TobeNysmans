package be.ses;

import java.util.ArrayList;

import org.checkerframework.checker.formatter.qual.ReturnsFormat;
    
public class CheckNeighboursInGrid {
    /**
    * This method takes a 1D Iterable and an element in the array and gives back an iterable containing the indexes of all neighbours with the same value as the specified element
    *@return - Returns a 1D Iterable of ints, the Integers represent the indexes of all neighbours with the same value as the specified element on index 'indexToCheck'.
    *@param grid - This is a 1D Iterable containing all elements of the grid. The elements are integers.
    *@param width - Specifies the width of the grid.
    *@param height - Specifies the height of the grid (extra for checking if 1D grid is complete given the specified width)
    *@param indexToCheck - Specifies the index of the element which neighbours that need to be checked
    */
        /* write your code below so you return the correct result */
    public static Iterable<Integer> 
    getSameNeighboursIds(Iterable<Integer> grid,int width, int height, int indexToCheck){
        int waardeIndex = 0; //waarde van de index
        int i = 0;
        int j = 0;
        ArrayList <Integer> sameValueNeighbours = new ArrayList<Integer>(); //lijst voor de buren met dezelfde waarde

        for (int number : grid) {//om de waarde van de index te bepalen
            if (i == indexToCheck) {
                waardeIndex = number;
                break;
            }
            //System.out.println(number);
            i++;
        }

        for (int number : grid) { //om de buren met dezelfde waarde te zoeken
            if (number == waardeIndex) { //heeft het getal dezelfde waarde?
                //System.out.println("heeft zelfde waard: " + number);
                if (j == indexToCheck-1||j == indexToCheck+1 //links of rechts
                    ||j == indexToCheck-width||j == indexToCheck+width //boven of onder
                    ||j == indexToCheck-width-1||j == indexToCheck-width+1 //diagonaal boven
                    ||j == indexToCheck+width-1||j == indexToCheck+width+1 //diagonaal onder
                    ) { //is het getal een buur?
                    sameValueNeighbours.add(j); //zo ja voeg het toe aan de lijst
                    //System.out.println("is buur " + number);
                }
            }
            j++;
        }
        return sameValueNeighbours;
    }
}
