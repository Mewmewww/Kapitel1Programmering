// Opgave 1
public class Loop {
    // initializing the codeblock with pvsm
    public static void main(String[] args) {
        // Using sout to shorten the length of the code.
        System.out.println("welcome to java, learning Java Now");
        System.out.println("Programming is fun");
        // Using a for-loop whilst simultaneously using an int-type to increase the statement, "I lova Java"
        // up to 5 times. ++i is adding the statement with an increment, until the loop has reached its maximum.
        for (int i = 0; i <= 4; ++i) {
            System.out.println("I love Java");
        }
        // Declaring a table as a string, and making a limitation of 5 strings.
        String[][] table = new String[5][];
        table[0] = new String[] {"a", "a^2", "a^3","a^4"};
        table[1] = new String[] {"1",  "1" ,  "1" , "1" };
        table[2] = new String[] {"2",  "4",   "8" , "16"};
        table[3] = new String[] {"3", "9", "27", "81"};
        table[4] = new String[] {"4", "16", "64","256"};
        // Using a for loop, that will use the inbuilt functions of row and table to seperate them into rows and
        // in to a column form. Additionally, an inbuilt function of Java is System.out.format that will simply allign the
        // displayed code to the right or left - depending on whether you insert a - before 15.
        for (String[] row : table) {
            System.out.format("%15s%15s%15s%15s\n", row);
        }
        // As the result of this calculation ends with decimals, using either float or double is required.
        // Printing for sum after the expression is defined.
        double sum = (7.5 * 6.5 - 4.5 * 3) / (47.5 - 5.5);
        System.out.println(sum);
        // Changing double with int, since we have no decimals given via the sum.
        int sumint = (1+2+3+4+5+6+7+8+9+10);
        System.out.println(sumint);
        /* Converting miles to kilometers.
           Omregner alle værdier til sekunder, ganger summen af de forrigenævnte værdier med 3600 som er en time, og
           Dividerer dernæst time-vær   dien med distancen givet i kilometer.
        */
        double sumdistance = (38.4) / ((1*3600) + (40*60) + 35)*3600 ;
        System.out.println(sumdistance);
    }
}
