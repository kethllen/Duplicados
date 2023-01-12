package org.example;
import java.util.ArrayList;
import java.util.List;
public class Listas {
    private List<String> meuArray;
    private List<String> meuArray2;

    public Listas(List<String> meuArray, List<String> meuArray2) {
        this.meuArray = meuArray;
        this.meuArray2 = meuArray2;
    }

    public List<String> getMeuArray() {
        return meuArray;
    }

    public void setMeuArray(List<String> meuArray) {
        this.meuArray = meuArray;
    }

    public List<String> getMeuArray2() {
        return meuArray2;
    }

    public void setMeuArray2(List<String> meuArray2) {
        this.meuArray2 = meuArray2;
    }

    public List<String> duplicadas(){
        List<String> duplicados = new ArrayList<>();
        for(String i: this.meuArray){
            if(this.meuArray2.contains(i))
                duplicados.add(i);
        }
        return duplicados;
    }
}
