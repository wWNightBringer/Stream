package HomeWork1.classes;

import HomeWork1.Decision;
import HomeWork1.ReadFromFile;

import java.io.IOException;

public class NumberFireEmployees implements Decision {
    public ReadFromFile streamApi;

    public NumberFireEmployees() throws IOException {
        streamApi = new ReadFromFile();
    }

    @Override
    public void decide() {
        System.out.println();
        long a = streamApi.getListEmployee().stream()
                .filter(e -> e.getDateOfWorkDown().getYear() == 2017)
                .count();
        System.out.println("Count firing in past year: " + a);
    }
}
