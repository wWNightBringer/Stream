package HomeWork1.classes;

import HomeWork1.Decision;
import HomeWork1.Employee;
import HomeWork1.ReadFromFile;

import java.io.IOException;
import java.util.Comparator;
import java.util.Objects;

public class FIOAllEmployees implements Decision {
    public ReadFromFile streamApi;

    public FIOAllEmployees() throws IOException {
        streamApi = new ReadFromFile();
    }

    @Override
    public void decide() {
        System.out.print("FIO: ");
        streamApi.getListEmployee().stream()
                .filter(e -> (e.getDateOfWorkDown().getYear() - e.getDateOfWorkUp().getYear()) > 10)
                .forEach(s -> System.out.print(s.getSurname() + "." + s.getName().substring(0, 1)
                        + "." + s.getPatronymic().substring(0, 1) + ", "));
        System.out.println();
    }
}
