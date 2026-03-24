package com.example.demo;

import org.springframework.stereotype.Indexed;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CatalanService {

    public CatalanResponse catalan(int num){
        int c0 = 1;
        List<Integer> list = new ArrayList<>();
        list.add(c0);
        for (int i = 1; i< num+1; i++){
            int result = 0;
            for(int n = 0; n < i; n++){
                result += list.get(n) * list.get(i-1-n);
            }
            list.add(result);
        }
        return new CatalanResponse("Secuencia de Catalan", num,list);
    }
}
