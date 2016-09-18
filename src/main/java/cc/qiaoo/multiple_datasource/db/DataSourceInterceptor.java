package cc.qiaoo.multiple_datasource.db;

import org.springframework.stereotype.Component;

/**
 * Created by qiaoo on 2016/9/18.
 */
@Component
public class DataSourceInterceptor {
    public static final String DB_ONE = "db_one";
    public static final String DB_TWO = "db_two";

    public static void setDataSourceOne() {
        DbContextHolder.setDbKey(DB_ONE);
    }

    public static void setDataSourceTwo() {
        DbContextHolder.setDbKey(DB_TWO);
    }
}
