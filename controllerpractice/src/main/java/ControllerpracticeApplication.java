import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/hello")
public class ControllerpracticeApplication {
        @RequestMapping("")
        public String home() {
                return "Hello World!";
        }
        @RequestMapping("/world")
        public String world() {
                return "Class level annotations are cool too!";
        }
}
