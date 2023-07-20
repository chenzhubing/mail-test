package com.example.mail.test;

import com.mail.starter.ISendMail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MailTestApplicationTests {

    @Autowired
    private ISendMail sendMail;

    @Test
    void testMail() {
        sendMail.send("this is a test mail !!!");
    }

}
