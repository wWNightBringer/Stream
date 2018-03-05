package HomeWork1.classes;

import HomeWork1.Decision;
import HomeWork1.Employee;
import HomeWork1.ReadFromFile;

import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class IntemidiateAgeEmployees implements Decision {
    public ReadFromFile streamApi;

    public IntemidiateAgeEmployees() throws IOException {
        streamApi = new ReadFromFile();
    }

    @Override
    public void decide() {
        double a = streamApi.getListEmployee().stream()
                .mapToInt(e ->
                        LocalDate.now().getYear() - e.getBirthday().getYear()
                ).average().getAsDouble();
        System.out.println("Average age all employees: " + a);
    }
}
