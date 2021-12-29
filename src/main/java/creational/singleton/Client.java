package creational.singleton;

import creational.singleton.connectionPool.ConnectionPool;

import java.util.Objects;

public class Client {
    public static void doQuery1() {
        var conn = ConnectionPool.getInstance().getConnection();
        if (conn != null) conn.query("SELECT * FROM A1");
//        ConnectionPool.getInstance().leaveConnection(Objects.requireNonNull(conn));
    }

    public static void doQuery2() {
        var conn = ConnectionPool.getInstance().getConnection();
        if (conn != null) conn.query("SELECT * FROM A2");
    }

    public static void doQuery3() {
        var conn = ConnectionPool.getInstance().getConnection();
        if (conn != null) conn.query("SELECT * FROM A3");
    }

    public static void main(String[] args) {
        doQuery1();
        doQuery2();
        doQuery3();
    }
}
