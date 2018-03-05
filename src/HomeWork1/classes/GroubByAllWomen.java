package HomeWork1.classes;

import HomeWork1.Decision;
import HomeWork1.Employee;
import HomeWork1.ReadFromFile;

import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class GroubByAllWomen implements Decision {
    public ReadFromFile streamApi;

    public GroubByAllWomen() throws IOException {
        streamApi = new ReadFromFile();
    }

    @Override
    public void decide() {
        streamApi.getListEmployee().stream()
                .filter(e ->
                        LocalDate.now().getYear() - e.getBirthday().getYear() > 30 &&
                                LocalDate.now().getYear() - e.getBirthday().getYear() < 40
                )
                .collect(Collectors.groupingBy(p -> p.getBirthday().getMonth()))
                .forEach(((month, list) -> System.out.format("%s \t", month)));
        System.out.println();
    }
}
