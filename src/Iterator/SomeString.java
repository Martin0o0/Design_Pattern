package Iterator;

import java.util.ArrayList;
import java.util.List;

public class SomeString implements Aggregate<String>{

    private List<String> data;
    public SomeString(){
        data = new ArrayList<>();
    }

    public void addData(String item){
        data.add(item);
    }

    @Override
    public Iterator<String> createdIterator() {
        return new SomeStringIterator(data);
    }
}
