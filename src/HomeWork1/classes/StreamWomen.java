package HomeWork1.classes;

import HomeWork1.Decision;
import HomeWork1.Employee;
import HomeWork1.ReadFromFile;

import java.io.IOException;

public class StreamWomen implements Decision {
    public ReadFromFile streamApi;

    public StreamWomen() throws IOException {
        streamApi = new ReadFromFile();
    }

    @Override
    public void decide() {
        long a = streamApi.getListEmployee().stream()
                .filter(e -> e.getSex() == Employee.Sex.FEMALE)
                .count();
        System.out.println("Count women: " + a);
    }
}
