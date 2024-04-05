import java.io.File;
import java.text.DecimalFormat;
import java.util.*;

/**
 * coins sorter machine class that will complete the calculations for the given coins
 * @author joshuayoon
 * @version 4th April 2024
 */
public class CoinSorterMachine { //possible extra which is minimum weight

    private ArrayList<Coin> coins;
    private int[] coinCounts = {0,0,0,0,0,0};
    HashMap<String, Coin> coinMap;

    public CoinSorterMachine(){
        /**
         * default constructor that initializes fields and adds the key value pairs to the hashmap
         */
        coinMap = new HashMap<>();
        coins = new ArrayList<>();
        coinMap.put("1", new Penny());
        coinMap.put("5", new Nickel());
        coinMap.put("10", new Dime());
        coinMap.put("25", new Quarter());
        coinMap.put("50", new HalfDollar());
        coinMap.put("100", new Dollar());
    }
    public double getTotalValue() {
        /**
         * Gets the total value of the deposited coins using the getValue method of each coins
         * @param no
         * @return boolean value that represents the total value
         */
        double sum = 0;
        for(Coin c: coins) {
            sum += c.getValue();
        }
        return sum;
    }

    public void depositCoins() {
        /**
         * Deposits coins by reading in the file and keeps track of how many coins there were while putting
         * @param no
         * @return void
         */
        try {
            Scanner scanner = new Scanner(System.in);
            String fileName = scanner.nextLine();
            Scanner scannertwo = new Scanner(new File(fileName));
            System.out.println("depositing coins...");
            while(scannertwo.hasNext()){
                String s = scannertwo.nextLine();
                if(coinMap.containsKey(s)) {
                    //coins.add(coinMap.get(s));
                    switch (s){
                        case "1":
                            coinCounts[0]++;
                            coins.add(coinMap.get("1"));
                            break;
                        case "5":
                            coinCounts[1]++;
                            coins.add(coinMap.get("5"));
                            break;
                        case "10":
                            coinCounts[2]++;
                            coins.add(coinMap.get("10"));
                            break;
                        case "25":
                            coinCounts[3]++;
                            coins.add(coinMap.get("25"));
                            break;
                        case "50":
                            coinCounts[4]++;
                            coins.add(coinMap.get("50"));
                            break;
                        case "100":
                            coinCounts[5]++;
                            coins.add(coinMap.get("100"));
                            break;
                    }

                } else {
                    System.out.println("Coin value " + s + " not recognized");
                }
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * prints the summary of the deposited coins
     * @param 
     * @return void
     */
    public void depositSummary() {

        DecimalFormat df = new DecimalFormat("$0.00");
        String[] keys = {"1", "5", "10", "25", "50", "100"};
        System.out.println("Summary of deposit: ");
        for(int i = 0; i < coinCounts.length; i++){
            System.out.println("\t"+ coinCounts[i] + " " + (coinCounts[i] == 1 ? coinMap.get(keys[i]).getName() : coinMap.get(keys[i]).getPluralName() + " " + df.format(coinCounts[i]*(coinMap.get(keys[i]).getValue())))); //use treemap here too!
        }
        System.out.println("TOTAL DEPOSIT: "+ df.format(getTotalValue()));
    }

    /**
     * Main method for class coin sorter machine
     * Prompts the users for a file name input to analyze
     * @param args
     */
    public static void main(String[] args) {
        CoinSorterMachine csm = new CoinSorterMachine();
        System.out.print("Enter the name of the data file for coin deposit: ");
        csm.depositCoins();
        csm.depositSummary();


    }




}
