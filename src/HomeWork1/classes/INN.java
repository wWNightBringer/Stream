package HomeWork1.classes;

import HomeWork1.Decision;
import HomeWork1.Employee;
import HomeWork1.ReadFromFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class INN implements Decision {
    public ReadFromFile streamApi;

    public INN() throws IOException {
        streamApi = new ReadFromFile();
    }

    @Override
    public void decide() {
        Map<Integer, Employee> map = new HashMap<>();
        int x = 0;
    }
}
