package webstar.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private final String serverName = "DESKTOP-G8H86K3";
    private final String dbName = "LapTrinhWebSangThu56";
    private final String portNumber = "1433";
    private final String instance = "SQLEXPRESS";

    public Connection getConnection() throws Exception {
        String url = "jdbc:sqlserver://" + serverName + "\\" + instance + ":" + portNumber
                   + ";databaseName=" + dbName
                   + ";integratedSecurity=true;"
                   + "encrypt=true;trustServerCertificate=true";

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url);
    }
}
