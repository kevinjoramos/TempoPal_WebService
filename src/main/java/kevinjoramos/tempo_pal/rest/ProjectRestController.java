package kevinjoramos.tempo_pal.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProjectRestController {

    @GetMapping("/timers")
    public String greeting() {
        return "Hello World!";
    }
}
