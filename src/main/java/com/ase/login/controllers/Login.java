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

package com.ase.login.controllers;

import com.ase.login.models.*;

public class Login extends Action {

    // create a new login model, to call functions
    LoginModel model = new LoginModel();

    // execute function of conttroller
    // this is invoked first
    public String execute() throws Exception {

        // if username has not been set, prompt for input
        if (model.getUsername() == null)
            return "input";

        // if model identifies wrong credentials, return error
        if (!LoginModel.validate(model.getUsername(), model.getPassword()))
            return "error";

        return "success";
    }

    // control forwards input information to model, to change username
    public void setUsername(String username) {
        model.setUsername(username);
    }

    // control forwards input information to model, to change password
    public void setPassword(String password) {
        model.setPassword(password);
    }
}