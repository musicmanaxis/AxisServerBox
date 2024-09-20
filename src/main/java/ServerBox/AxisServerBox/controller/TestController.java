package ServerBox.AxisServerBox.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/api/server")
public class TestController {
   // private final Logger LOGGER= LoggerFactory.getLogger(TestController.class);

    @GetMapping(value = "axis")
    public String getTest(){
        return "Hello Axis from AxisServerBox";

    }


}
