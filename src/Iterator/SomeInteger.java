package Iterator;

import java.util.ArrayList;
import java.util.List;

public class SomeInteger implements Aggregate<Integer>{

    private List<Integer> data;
    public SomeInteger(){
        this.data = new ArrayList<>();
    }

    public void addData(Integer item){
        data.add(item);
    }

    @Override
    public Iterator<Integer> createdIterator() {
        return new SomeIntegerIterator(data);
    }
}