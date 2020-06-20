package club.dhbxs.test;

import club.dhbxs.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;

/**
 * @ClassName JdbcUtilsTest
 * @Description
 * @Author 17235
 * @Date 2020/6/17 上午 8:59
 * @Version 1.0
 **/
public class JdbcUtilsTest {
    @Test
    public void testJducUtils() {
        for (int i = 0; i < 100; i++) {
            Connection connection = JdbcUtils.getConnection();
            System.out.println(connection);
            JdbcUtils.closeConnection(connection);
        }
    }
}
