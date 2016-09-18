package cc.qiaoo.multiple_datasource.db;

/**
 * Created by qiaoo on 2016/9/18.
 */
public class DbContextHolder {
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    public static String getDbKey() {
        return contextHolder.get();
    }

    public static void setDbKey(String dbKey) {
        contextHolder.set(dbKey);
    }

    public static void clearDbKey(String dbKey) {
        contextHolder.remove();
    }

}
