package w3st125.petproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import w3st125.petproject.repository.PackRepository;

import javax.transaction.Transactional;

@Service
public class PackDataService {
    @Autowired
    private PackRepository customizedPackCrudRepository;

    @Transactional
    public void testCustomizedPackCrudRepository(){

    }
}

