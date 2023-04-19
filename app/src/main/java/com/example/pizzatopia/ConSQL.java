package com.example.pizzatopia;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.util.Log;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConSQL {
    Connection con;
    @SuppressLint("NewApi")
    public Connection conclass()
    {
        //String ip="cmstestserver.mysql.database.azure.com",port="3306",username="KolaniakAdmin",password="KucykoweKrulestwo123";

        String ip="cmstestserver.mysql.database.azure.com:3306/pizza?useSSL=true\";myDbConn=DriverManager.getConnection(url, \"KolaniakAdmin\", \"123\");";

        StrictMode.ThreadPolicy a= new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(a);
        String ConnectURL=null;
        try
        {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            ConnectURL ="jdbc:jtds:sqlserver://"+ip;
            con= DriverManager.getConnection(ConnectURL);
        }
        catch (Exception e)
        {
            Log.e("Error is ", e.getMessage());
        }
        return con;
    }
}
