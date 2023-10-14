package Iterator;

import java.util.List;

public class SomeStringIterator implements Iterator<String> {
    private List<String> data;
    private int idx;

    public SomeStringIterator(List<String> data){
        this.data = data;
        this.idx = 0;
    }

    @Override
    public Boolean hasNext() {
        return idx < data.size();
    }

    @Override
    public String next() {
        if(hasNext()){
            String item = data.get(this.idx);
            idx++;
            return item;
        }
        else{
            return null;
        }
    }
}
