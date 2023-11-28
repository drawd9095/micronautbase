package pe.com.bn.ms;

import io.micronaut.http.annotation.*;

@Controller("/loginService")
public class LoginServiceController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}