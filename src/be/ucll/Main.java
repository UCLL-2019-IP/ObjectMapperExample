package be.ucll;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee(1, "Rudy", "Dekeerschieter", "ICT");

        // need this to convert to json - see imports
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            String jsonString = objectMapper.writeValueAsString(employee);
            System.out.println(jsonString);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
