package controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import play.mvc.*;
import services.TestService;

import java.util.HashMap;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    }
    
    public Result explore() {
        return ok(views.html.explore.render());
    }
    
    public Result tutorial() {
        return ok(views.html.tutorial.render());
    }

    public Result test(){

        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();

        LOGGER.debug(" :debug - HomeController - Test - first - log !");
        LOGGER.info(" :info - HomeController - Test - first - log !");

        LOGGER.warn(" :warn - HomeController - Test - first - log !");
        LOGGER.error(" :error - HomeController - Test - first - log !\n");



        TestService testService = new TestService();

        String add = testService.add();


        return ok(add);
    }

}
/**
 *　　1、Logback的配置文件
 * Logback 配置文件的语法非常灵活。
 * 正因为灵活，所以无法用 DTD 或 XML schema 进行定义。
 * 尽管如此，可以这样描述配置文件的基本结构：
 * 以<configuration>开头，后面有零个或多个<appender>元素，
 * 有零个或多个<logger>元素，有最多一个<root>元素。
 */