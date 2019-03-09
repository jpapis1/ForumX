package app.rest;

import app.model.Status;
import app.service.StatusManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class StatusRestController {
    @Autowired
    StatusManager statusManager;

    @RequestMapping("/greeting")
    public String greeting() {
        statusManager.addStatus(new Status("JEST OK"));
        return "Hello";
    }
}
