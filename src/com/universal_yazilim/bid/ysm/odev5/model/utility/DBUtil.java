package com.universal_yazilim.bid.ysm.odev5.model.utility;


import com.universal_yazilim.bid.ysm.odev5.utility.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;

public final class DBUtil
{
    //private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String DB_URL = "jdbc:oracle:thin:@engizek.iski.local:1521:testdb";

    private DBUtil() {}

    public static Connection createConnection(String username, String password)
    {
        try
        {
            return DriverManager.getConnection(DB_URL, username, password);
        }
        catch (SQLTimeoutException e)
        {
            DBUtil.showSQLException(e);
            return null;
        }
        catch (SQLException e)
        {
            DBUtil.showSQLException(e);
            return null;
        }
    }

    public static void showSQLException(SQLException e)
    {
        Util.showWarningMessage(createSQLException(e));
    }

    public static String createSQLException(SQLException e)
    {
        return "Error Code: " + e.getErrorCode() + "\nSQL State: " + e.getSQLState()
                + "\nException Message: " + e.getMessage();
    }
}
