package json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class JSONEditor {
    private final Gson gson;
    private Employee employee;

    public JSONEditor(File file) {
        gson = new GsonBuilder().setPrettyPrinting().create();
        try (Reader reader = new FileReader(file)) {
            employee = gson.fromJson(reader, Employee.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeObjectToJSONFile(File file) {
        try (FileWriter writer = new FileWriter(file)) {
            gson.toJson(employee, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setEmployeeName(String newName) {
        employee.setName(newName);
    }

    public void setEmployeeSureName(String newSureName) {
        employee.setSureName(newSureName);
    }

    public void setEmployeeAge(int newAge) {
        employee.setAge(newAge);
    }

    public void setEmployeeAddress(Address address) {
        employee.setAddress(address);
    }

    public String getEmployee() {
        return employee.toString();
    }

    public static void main(String[] args) {
        File fileToJSON = new File("src/main/resources/Employee.json");
        Address address = new Address("USA", "Texas");
        JSONEditor editor = new JSONEditor(fileToJSON);
        //Update address
        editor.setEmployeeAddress(address);

        //write Employee with updated Address to the file
        editor.writeObjectToJSONFile(fileToJSON);

    }
}
