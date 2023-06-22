package com.spring.core.sendEmailAssignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PostgreSQLDataSource implements DataSource{
    @Override
    public String[] getEmails() {

        String[] emails = {"deneme123@gmail.com", "deneme456@gmail.com","deneme789@gmail.com"};
        return emails;
    }
}
