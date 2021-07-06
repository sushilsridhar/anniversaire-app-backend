package service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String Test()
    {
        return "Hello from service layer :D";
    }
}
