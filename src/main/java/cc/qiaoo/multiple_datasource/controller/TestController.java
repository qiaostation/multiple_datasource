package cc.qiaoo.multiple_datasource.controller;

import cc.qiaoo.multiple_datasource.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by qiaoo on 2016/9/18.
 */
@Controller
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    public ModelAndView query3() {
        testService.test();

        ModelAndView modelAndView = new ModelAndView("success");
        return modelAndView;
    }
}
