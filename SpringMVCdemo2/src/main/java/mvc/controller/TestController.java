package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller

public class TestController {
    // 请求的路径为 /test/testRequestMapping
    @RequestMapping(value = {"testRequestMapping"}, method = {RequestMethod.GET,RequestMethod.POST})
    public String testRequestMapping(){
        return "success";
    }
    @RequestMapping("/**/testAnt")  // 支持ant风格的路径 ？表示任意的单个字符 *：表示任意的0或多个字符
    // ** 表示任意的一层或多层目录 使用**时 只能使用/**/***的方式
    public String testAnt(){
        return "success";
    }

    @RequestMapping("/testRest/{id}/{username}") // 通过占位符来表示传输的数据 然后通过@PatbVariable
    // 将占位符表示的数据 赋值给行参
    public String testRest(@PathVariable("id") String id ,@PathVariable("username") String username){
        System.out.println("id = " + id + "username = "+username);
        return "success";
    }

    // 通过servletapi获取
    @RequestMapping("/testParam")
    public String testParam(HttpServletRequest httpServletRequest){
        String username = httpServletRequest.getParameter("username");
        String password = httpServletRequest.getParameter("password");
        System.out.println("username:"+username+" == " +"password:"+password);
        return "test_param";
    }
}
