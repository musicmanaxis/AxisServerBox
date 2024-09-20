package ServerBox.AxisServerBox.controller;

import ServerBox.AxisServerBox.dto.MemberDTO;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/api/server")
public class TestController {
 //  private final Logger LOGGER= (Logger) LoggerFactory.getLogger(TestController.class);

    @GetMapping(value = "/axis")
    public String getTest(){
   //     LOGGER.info("getTest1 호출");
        return "Hello Axis from AxisServerBox";
    }

    @GetMapping(value = "/name")
    public String getTest2(@RequestParam String name){
     //   LOGGER.info("getTest2 호출");
        return "Hello" +name+" AxisServerBox";
    }

    @GetMapping(value = "/path-variable/{name}")
    public String getTest3(@PathVariable String name){
     //   LOGGER.info("getTest3 호출");
        return "Hello" +name+" AxisServerBox";
    }

    @PostMapping(value = "/member")
    public ResponseEntity<MemberDTO> getMember(
             @RequestBody MemberDTO memberDTO,
             @RequestParam String name,
             @RequestParam String email,
             @RequestParam String group){

      //  LOGGER.info("getMember 호출");

        return ResponseEntity.status(HttpStatus.OK).body(memberDTO);
    }

    @PostMapping(value = "/add-header")
    public ResponseEntity<MemberDTO> addHeader(@RequestHeader("axis-header") String header, @RequestBody MemberDTO memberDTO ){

     //   LOGGER.info("add-header 호출");

        return ResponseEntity.status(HttpStatus.OK).body(memberDTO);
    }


}
