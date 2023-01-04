package com.example.materialepladsenappui.Database_Connection;

import static java.sql.DriverManager.println;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelper {
    public static String selectSome() throws SQLException {
        String response = "";

        DatabaseConnection db = new DatabaseConnection();
        Connection conn = db.getConnection();

        String query = "SELECT TOP (1000) [product_group]\n" +
                "      ,[id]\n" +
                "      ,[product_articlenumber]\n" +
                "      ,[product_articleName]\n" +
                "      ,[product_size]\n" +
                "      ,[product_WeightM3]\n" +
                "      ,[product_price_dkk_excludingTax]\n" +
                "      ,[product_price_dkk_includingTax]\n" +
                "      ,[unit]\n" +
                "      ,[availability]\n" +
                "      ,[product_image]\n" +
                "  FROM [materialepladsen_core_DTUMP2].[dbo].[v_mobileApp_products]";

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            String tableName = rs.getString("TABLE_NAME");
            println("Table name: $tableName");
        }

        return response;
    }
}
