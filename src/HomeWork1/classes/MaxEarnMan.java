package HomeWork1.classes;

import HomeWork1.Decision;
import HomeWork1.Employee;
import HomeWork1.ReadFromFile;

import java.io.IOException;
import java.util.Comparator;
import java.util.Objects;

public class MaxEarnMan implements Decision {
    public ReadFromFile streamApi;

    public MaxEarnMan() throws IOException {
        streamApi = new ReadFromFile();
    }

    @Override
    public void decide() {
        int a = streamApi.getListEmployee().stream()
                .filter(e -> Objects.equals(e.getName(), "Andrew"))
                .max(Comparator.comparing(Employee::getEarn)).get().getEarn();
        System.out.println("Name Andrew and max earn: " + a);
    }
}
