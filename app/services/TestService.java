package services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import services.sub.Test;

public class TestService {

    private static final Logger logger = LoggerFactory.getLogger(TestService.class);


    public String add(){

        logger.debug(" :debug - TestService - Test - first - log !");
        logger.info(" :info - TestService - Test - first - log !");
        logger.warn(" :warn - TestService - Test - first - log !");
        logger.error(" :error - TestService - Test - first - log !");

        logger.error("1 {} asdkfj dsf d {} dfg {}","2",1,434);
        logger.debug("Processing trade with id: {} and symbol : {} \n", 1, 2 );

        for (int i=0; i<100000; i++){
            //System.out.println(i);
            logger.error("rolling {} size aa asdlgja;skgdh; klasdgnl;ka;sdfkjasdkfjlajksdfl; kljasdlfkjl;akjsdf klasdjfl;kasjdf;lkjasdfl;jka;lsdkf", i);
        }

//        int i=0;
//        int j=1;
//        int k = j/i;
        Test test = new Test();
        test.add();

        return "a-b-c";
    }

}
