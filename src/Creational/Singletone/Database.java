package Creational.Singletone;

public class Database {
    private static Database database;

    private Database() {
    }

    public static Database getDatabase() {
        if (Database.database == null) {
            return new Database();
        }
        return database;
    }
}
