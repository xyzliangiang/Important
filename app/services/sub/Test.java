package services.sub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    private static final Logger logger = LoggerFactory.getLogger(Test.class);


    public String add(){

        logger.debug(" :debug - Test - Test - first - log !");
        logger.info(" :info - Test - Test - first - log !");
        logger.warn(" :warn - Test - Test - first - log !");
        logger.error(" :error - Test - Test - first - log !");

        logger.error("1 {} asdkfj dsf d {} dfg {}","2",1,434);
        logger.debug("Processing trade with id: {} and symbol : {} \n", 1, 2);



        return "a-b-c";
    }

}
