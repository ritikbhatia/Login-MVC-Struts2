/*
 * $Id$
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.ase.login.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Person {

    // set class variables
    private String username;
    private String password;

    // username getter
    public String getUsername() {
        return username;
    }

    // username setter, called by controller
    public void setUsername(String username) {
        this.username = username;
    }

    // password getter
    public String getPassword() {
        return password;
    }

    // password setter, called by controller
    public void setPassword(String password) {
        this.password = password;
    }

    // validation username - password combination
    public static boolean validate(String username, String userpass) {
        boolean status = false;

        try {

            // establish mysql connection
            Class.forName("com.mysql.jdbc.Driver");
            // create connection object
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aseProject", "root", "root");

            // template for mysql query to check for valid credential entered
            PreparedStatement ps = con.prepareStatement("select * from users where username=? and password=?");

            // query input uername and password
            ps.setString(1, username);
            ps.setString(2, userpass);
            //execute query
            ResultSet rs = ps.executeQuery();
            status = rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
}