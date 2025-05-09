package com.gstbilling.controller;

import com.gstbilling.model.EmailModel;
import com.gstbilling.services.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {
    @Autowired
    private IEmailService emailService;

    @PostMapping("/send")
    public ResponseEntity<String> sendEmail(@RequestBody EmailModel emailModel) {
        emailService.sendEmail(emailModel);

        return ResponseEntity.ok("Email sent Successfully");
    }
}
