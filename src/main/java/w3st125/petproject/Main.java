package w3st125.petproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
    TestHSQLDB baza = new TestHSQLDB();
    if (!baza.loadDriver()) return;
    if (!baza.getConnection()) return;


    baza.printTable();
    baza.closeConnection();
  }
}
