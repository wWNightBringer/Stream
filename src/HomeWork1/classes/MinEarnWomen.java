package HomeWork1.classes;

import HomeWork1.Decision;
import HomeWork1.Employee;
import HomeWork1.ReadFromFile;

import java.io.IOException;
import java.util.Comparator;
import java.util.Objects;

public class MinEarnWomen implements Decision {
    public ReadFromFile streamApi;

    public MinEarnWomen() throws IOException {
        streamApi = new ReadFromFile();
    }

    @Override
    public void decide() {
        int a = streamApi.getListEmployee().stream()
                .filter(e -> Objects.equals(e.getName(), "Jane"))
                .min(Comparator.comparing(Employee::getEarn)).get().getEarn();
        System.out.print("Name Jane and min earn: " + a);
    }
}
