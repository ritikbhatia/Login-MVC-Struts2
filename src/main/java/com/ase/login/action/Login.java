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

package com.ase.login.action;

import com.ase.login.model.*;

import com.opensymphony.xwork2.ActionSupport;

// Base Action class
public class Login extends ActionSupport {
    // create a new login model, to call functions
    Person user = new Person();

    // execute function of conttroller
    // this is invoked first
    public String execute() throws Exception {

        // if username has not been set, prompt for input
        if (user.getUsername() == null || user.getUsername() == "")
            return "input";

        // if model identifies wrong credentials, return error
        if (!Person.validate(user.getUsername(), user.getPassword()))
            return "error";

        return "success";
    }

    // control forwards input information to model, to change username
    public void setUsername(String username) {
        user.setUsername(username);
    }

    // control forwards input information to model, to change password
    public void setPassword(String password) {
        user.setPassword(password);
    }
}
