public class Nickel extends Coin{
    /**
     * a nickel class that constructs the object nickel that extends a coin
     * @author joshuayoon
     * @version 4th April 2024
     */


    /**
     * getvalue method that is used to get how much the coin is worth in dollars
     * @return double that represents the value of the coin
     */
    public double getValue() {
        return 0.05;

    }

    /**
     * getname method that will be used to identify the coin by name
     * @return String value that will return the name of the coin
     */

    public String getName() {
        return "nickel";
    }

    /**
     * compares an object to see if it is a coin, and if it is, does it have the same value
     * @param other
     * @return boolean whether a given object equals the coin or not
     */
    public boolean equals(Object other){
        if(other != null && other instanceof Coin){
            Coin temp = (Coin)other;
            return this.getValue() == temp.getValue();
        }
        return false;
    }
}
