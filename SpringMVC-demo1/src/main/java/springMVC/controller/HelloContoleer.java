package springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloContoleer {

    // "/" ->/WEB-INF/templates/index.html

    @RequestMapping("/") // 处理请求和控制器方法之间的映射关系
    public String index(){
            //返回视图名称
        return "index";
    }


    @RequestMapping("/hello")
    public String HelloWorld(){
        return "target";
    }
}
