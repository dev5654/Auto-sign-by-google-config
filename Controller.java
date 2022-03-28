package uz.aktamov;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/")
    @ResponseBody
    private String home() {
        return "open api";
    }

    @RequestMapping("/s")
    @ResponseBody
    private String s34e() throws JsonProcessingException {
        String s = new ObjectMapper().writeValueAsString(SecurityContextHolder.getContext().getAuthentication());
        System.out.println("data : " + s);
        return "secured api";
    }
}
