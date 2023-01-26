package harrypotter;

import org.junit.Test;
import java.sql.Connection;

/**
 *
 * @author fattani computers
 */
public class databaseTesting {
    @Test
    public void test() {
        Connection con;
        con = database.mycon();
        System.out.println(con);
    }
}
