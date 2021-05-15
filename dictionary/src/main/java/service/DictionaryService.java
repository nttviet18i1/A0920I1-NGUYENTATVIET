package service;

import com.repository.IDictionary;
import com.service.iDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;


public class DictionaryService implements iDictionaryService {
    @Autowired
    IDictionary iDictionary;

    @Override
    public String toVn(String english) {
        return iDictionary.findOne(english);
    }
}
