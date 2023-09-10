package org.weeklyTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private Person person;

    @Autowired
    private Address address;

    @Autowired
    private EmailService emailService;

    @GetMapping("/getMap")
    public String getMappings() {
        String response = "Person: " + person.toString() + "\nAddress: " + address.toString();

        // Send the email here
        String emailSubject = "Object Data";
        String emailText = response;

        emailService.sendEmail("dassambit16@gmail.com", "Test","GEEKSTER ASSIGNMENT" );

        return response;
    }

}
