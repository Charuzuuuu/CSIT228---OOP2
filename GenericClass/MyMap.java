package Map;

import java.util.ArrayList;
import java.util.List;

public class MyMap<K, V> {
    private List<K> keys;
    private List<V> values;

    public MyMap(K key, V value) {
        keys = new ArrayList<>();
        values = new ArrayList<>();
        keys.add(key);
        values.add(value);
    }

    public List<K> getKeys(){
        return keys;
    }

    public List<V> getValues(){
        return values;
    }

    public void put(K key, V value){
        int index = keys.indexOf(key);

        if(index != -1){
            values.set(index, value);
        }else{
            keys.add(key);
            values.add(value);
        }
    }

    public V get(K key){
        int index = keys.indexOf(key);

        if(index != -1){
            return values.get(index);
        }

        return null;
    }

    public V remove(K key){

        int index = keys.indexOf(key);

        if(index != -1) {
            V val = values.get(index);
            keys.remove(key);
            values.remove(values.get(index));
            return val;
        }

        return null;
    }


}
