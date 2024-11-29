/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.controller;

import com.mycompany.java.model.ITRequest;
import com.mycompany.java.model.ConnectDatabase;
import com.mycompany.java.model.ITRequest;
import java.sql.Date;
import java.sql.Connection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author MyPC
 */
import java.sql.Connection;
import java.sql.SQLException;

public class ITRequestController {

    public static boolean addRequest(String ReqName, Date ReqDate,
            String ReqEmail, String ReqType, String ReqDetails) {
        String sql = "INSERT INTO ITRequest (ReqName, ReqDate, ReqEmail, ReqType, ReqDetails) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = ConnectDatabase.getConnection();
               PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, ReqName);
            preparedStatement.setDate(2, ReqDate);
            preparedStatement.setString(3, ReqEmail);
            preparedStatement.setString(4, ReqType);
            preparedStatement.setString(5, ReqDetails);

            int rowsEffected = preparedStatement.executeUpdate();
            
            if (rowsEffected > 0) {
                return true;
            }
            
            ConnectDatabase.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static ITRequest findRequestById(int Id) {
        String sql = "SELECT *  FROM ITRequest WHERE ReqID = ? ";
        ITRequest itRequest = new ITRequest();
        try (Connection connection = ConnectDatabase.getConnection(); PreparedStatement preparedstatement = connection.prepareStatement(sql)) {
            preparedstatement.setInt(1, Id);

            ResultSet rs = preparedstatement.executeQuery();

            if (rs.next()) {
                itRequest.setReqID(rs.getInt(1));
                itRequest.setReqName(rs.getString(2));
                itRequest.setReqDate(rs.getDate(3));
                itRequest.setReqEmail(rs.getString(4));
                itRequest.setReqType(rs.getString(5));
                itRequest.setReqDetails(rs.getString(6));
            }

            ConnectDatabase.closeConnection();
            return itRequest;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }
}
