package simple.tutorial.service;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Игорь on 10.12.2015.
 */
@Service (value = "personService")
public class PersonServiceImp implements PersonService {

    @Override
    public List getAll() {
        System.out.println("PersonServiceImp.getAll");
        return null;
    }
}
