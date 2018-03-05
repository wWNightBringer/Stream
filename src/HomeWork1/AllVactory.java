package HomeWork1;

import HomeWork1.classes.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AllVactory {
    private List<Decision> list;

    public AllVactory() throws IOException {
        this.list = new ArrayList<>();
        list.add(new EarnMan());
        list.add(new FIOAllEmployees());
        list.add(new GroubByAllWomen());
        list.add(new INN());
        list.add(new IntemidiateAgeEmployees());
        list.add(new IntemidiateEarnMans());
        list.add(new IntemidiateEarnWomen());
        list.add(new MaxEarnMan());
        list.add(new MinEarnWomen());
        list.add(new NumberFireEmployees());
        list.add(new StreamWomen());
    }

    public List<Decision> getList() {
        return list;
    }
}
