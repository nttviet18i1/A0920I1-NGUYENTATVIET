package com.repository;

import com.model.DictionarySimple;

import java.util.*;

public class Dictionarylpml implements IDictionary  {
    private static Map<Integer, DictionarySimple> dic = new HashMap<>();

    static {
        dic.put(1, new DictionarySimple("hello","Xin chào"));
        dic.put(2, new DictionarySimple("books","sách"));
        dic.put(3, new DictionarySimple("program","chường trình"));
        dic.put(4, new DictionarySimple("play","chơi"));
        dic.put(5, new DictionarySimple("soccer","bóng đá"));
        dic.put(6, new DictionarySimple("success","thành công"));
        dic.put(7, new DictionarySimple("good","tốt"));



    }

    @Override
    public String findOne(String english) {
      String  result= null;
        List<DictionarySimple> dictionarySimples = new ArrayList<>(Dictionarylpml.dic.values());
        for(int i=0; i< dictionarySimples.size();i++)
        {
            if(dictionarySimples.get(i).getEnglish().equalsIgnoreCase(english)){
                result= dictionarySimples.get(i).getVietnam();
            };
        }
        return  result;


    }
}
