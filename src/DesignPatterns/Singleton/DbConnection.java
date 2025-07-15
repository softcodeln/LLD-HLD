package DesignPatterns.Singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DbConnection {
    String userName;
    String passWord;
    private static DbConnection dbInstance;
    private static Lock lock = new ReentrantLock();

    private DbConnection(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public static DbConnection getInstance(String userName, String passWord) {
        if (dbInstance == null) {
            lock.lock();
            if (dbInstance == null) {
                dbInstance = new DbConnection(userName, passWord);
            }
            lock.unlock();
        }
        return dbInstance;
    }
}
