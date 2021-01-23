package co.edu.udea.microserviciosudearegistration.api;

import co.edu.udea.microserviciosudearegistration.dto.ContactDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ContactApi {
    @GetMapping("/contact")
    public ContactDto getContact() {
        return new ContactDto(1515151L, "someName", "someLastName", "3213515", "asdasd@email.com");
    }
}
