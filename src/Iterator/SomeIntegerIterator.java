package Iterator;

import java.util.List;

public class SomeIntegerIterator implements Iterator<Integer>{
    private List<Integer> data;
    private int idx;

    public SomeIntegerIterator(List<Integer> data){
        this.data = data;
        this.idx = 0;
    }

    @Override
    public Boolean hasNext() {
        return idx < data.size();
    }

    @Override
    public Integer next() {
        if(hasNext()){
            Integer item = data.get(this.idx);
            idx++;
            return item;
        }
        else{
            return null;
        }
    }
}
