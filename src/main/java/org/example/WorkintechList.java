package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList extends ArrayList {

    @Override
    public boolean add(Object object) {
        if(!this.contains(object)){ //obje listede yok ise
return super.add(object); //ArrayList add methoduna ekle
        }

        return false;
    }

    public void sort(){
        Collections.sort(this);
    }

    @Override
    public boolean remove(Object object) {
        boolean result = super.remove(object);
        if(result) {
            sort(); // basarili remove isleminden sonra sirala.
        }
        return result;
    }
}
