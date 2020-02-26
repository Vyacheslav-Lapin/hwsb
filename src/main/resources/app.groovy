import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
/* other imports */

@RestController
class WebApplication {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
