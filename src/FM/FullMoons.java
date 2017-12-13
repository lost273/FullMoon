
package FM;

import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class FullMoons {
    static int DAY_IM = 60 * 60 *24;
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        long day1 = c.getTimeInMillis();
        c.set(2004,1,7,15,40);
        c.setTimeInMillis(day1);
        
        out.println(String.format("Full moon on %tc", c));
        day1 += (DAY_IM * 29.52);
        for (int x = 0; x < 60; x++){

        }
    }
}
