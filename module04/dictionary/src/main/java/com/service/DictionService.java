package com.service;

import com.repository.IDictionary;
import org.springframework.beans.factory.annotation.Autowired;

public class DictionService implements IDictionary {
    @Autowired
        IDictionary iDictionary;
    @Override
    public String findOne(String english) {
        return iDictionary.findOne(english);
    }
}
