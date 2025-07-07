package DesignPatterns.Singleton;

public class Client {
    public static void main(String[] args) {
        DbConnection dbConn1 = DbConnection.getInstance("admin", "1234");
        DbConnection dbConn2 = DbConnection.getInstance("admin", "1234");

        System.out.println("DEBUG");
        System.out.println(dbConn1 == dbConn2); // true
    }
}
