package DesignPatterns.Singleton;

public class DbConnection {
    String userName;
    String passWord;
    private static DbConnection dbInstance;

    private DbConnection(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public static DbConnection getInstance(String userName, String passWord) {
        if (dbInstance == null) {
            dbInstance = new DbConnection(userName, passWord);
        }
        return dbInstance;
    }
}
