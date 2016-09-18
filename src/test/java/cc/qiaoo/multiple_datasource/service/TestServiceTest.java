package cc.qiaoo.multiple_datasource.service;

import cc.qiaoo.multiple_datasource.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by qiaoo on 2016/9/18.
 */
public class TestServiceTest extends BaseTest {

    @Autowired
    private TestService testService;

    @Test
    public void testTest1() throws Exception {
        testService.test();
    }
}