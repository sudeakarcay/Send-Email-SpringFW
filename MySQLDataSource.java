package com.spring.core.sendEmailAssignment;

import org.springframework.stereotype.Component;
@Component
public class MySQLDataSource implements DataSource{

    @Override
    public String[] getEmails() {

        String[] emails = {"deneme123@gmail.com", "deneme456@gmail.com","deneme789@gmail.com"};
        return emails;
    }
}
