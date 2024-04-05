public abstract class Coin {

    /**
     * abstract class coin that defines what a coin within the parametres of the project is
     *
     */
    public abstract double getValue();

    /**
     * getvalue method that is used to get how much the coin is worth in dollars
     * @return double that represents the value of the coin
     */
    public abstract String getName();
    /**
     * getname method that will be used to identify the coin by name
     * @return String value that will return the name of the coin
     */

    /**
     * how to print the names of the coin if there are multiple of them, except for pennies, all have "s" added to their name
     * @return String value that represents how they are written in plural
     */
    public String getPluralName() {
        if(getName().equals("penny"))
            return "pennies";
        else
            return getName() + "s";
    }
}
