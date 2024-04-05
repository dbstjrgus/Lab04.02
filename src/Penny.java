public class Penny extends Coin {

    /**
     * a penny class that constructs the object penny that extends a coin
     * @author joshuayoon
     * @version 4th April 2024
     */


    /**
     * method that gets the value, or in this case how much the penny is worth
     * @return double value that represents the value of the coin
     */
    public double getValue() {
        return 0.01;
    }

    /**
     * method that will get the name of the coin
     * @return String value that gets the name "penny"
     */
    public String getName() {
        return "penny";
    }

    /**
     * compares an object to see if it is a coin, and if it is, does it have the same value
     * @param other
     * @return boolean whether a given object equals the coin or not
     */
    public boolean equals(Object other){
        if(other != null && other instanceof Coin){
            Coin temp = (Coin)other;
            /*
            Double v1 = this.getValue();
            Double v2 = temp.getValue();
            return v1.compareTo(v2)==0;
             */
            return this.getValue() == temp.getValue();
        }
        return false;
    }
}
