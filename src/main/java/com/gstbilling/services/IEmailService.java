package com.gstbilling.services;

import com.gstbilling.model.EmailModel;

public interface IEmailService {

    void sendEmail(EmailModel emailModel);
}
