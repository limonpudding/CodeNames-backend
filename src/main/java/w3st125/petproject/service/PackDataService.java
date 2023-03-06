package w3st125.petproject.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import w3st125.petproject.repository.PackRepository;
import w3st125.petproject.repository.WordRepository;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class PackDataService {
    private final PackRepository packRepository;
    private final WordRepository wordRepository;

    @Transactional
    public void testCustomizedPackCrudRepository(){
    }
}

