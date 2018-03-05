package HomeWork1;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    private static AllVactory allVactory;

    public static void main(String[] args) throws IOException {
        allVactory = new AllVactory();
        for (Decision d : allVactory.getList()) {
            d.decide();
        }

    }


}
