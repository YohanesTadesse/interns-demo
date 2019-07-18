package startech.calendar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping(path = "health")
public class PingController {

    @GetMapping(path = "/check")
    @ResponseBody
    public String healthCheck() {
        return "working fine!";
    }


    @GetMapping(path = "/ping")
    @ResponseBody
    public String pingPong(@RequestParam("parameter") String input) {
        if(input.equals("Ping"))
            return "Pong!";
        return "not working";
    }

}
