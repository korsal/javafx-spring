package simple.tutorial.view;

import javafx.fxml.FXML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import simple.tutorial.service.PersonService;

/**
 * Created by Игорь on 10.12.2015.
 */
@Controller
public class RootLayoutController {

    @Autowired
    private PersonService service;

    @FXML
    public void initialize() {
        System.out.println("RootLayoutController.initialize");
        service.getAll();
    }

    public PersonService getService() {
        return service;
    }

    public void setService(PersonService service) {
        this.service = service;
    }
}
