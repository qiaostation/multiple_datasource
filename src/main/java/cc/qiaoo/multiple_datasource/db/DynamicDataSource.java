package cc.qiaoo.multiple_datasource.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by qiaoo on 2016/9/18.
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
      protected Object determineCurrentLookupKey() {
        return DbContextHolder.getDbKey();
    }
}
