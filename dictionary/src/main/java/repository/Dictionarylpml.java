package repository;

import model.DictionModel;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionarylpml implements IDictionary {
   private static  Map<Integer, DictionModel> dic = new HashMap<>();

    static {
        dic.put(1, new DictionModel("hello","Xin chào"));
        dic.put(2, new DictionModel("books","sách vở"));
        dic.put(3, new DictionModel("computer","máy tính"));
        dic.put(4, new DictionModel("vocabulary","từ vựng"));
        dic.put(5, new DictionModel("classroom","phòng học"));


    }


    @Override
    public String findOne(String english) {
        String result = null;

        List<DictionModel> dictionaries = new ArrayList<>(Dictionarylpml.dic.values());

        for (int i = 0; i < dic.size(); i++) {
            if(dic.get(i).getVietname().equalsIgnoreCase(english)){
                result = dictionaries.get(i).getVietname();
            }
        }

        return result;

    }
}
