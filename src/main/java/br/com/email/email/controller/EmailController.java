package br.com.email.email.controller;

import br.com.email.email.model.Email;
import br.com.email.email.service.EmailService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
@AllArgsConstructor
@RequestMapping("api/email")
public class EmailController {

    private EmailService emailService;

    @PostMapping
    public void enviarEmail(@RequestBody Email email) throws MessagingException {
        emailService.enviarEmail(email);
    }

}
