/*
 * Copyright (c) 2019-2020 SAP SE or an SAP affiliate company and XSK contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, v2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-FileCopyrightText: 2019-2020 SAP SE or an SAP affiliate company and XSK contributors
 * SPDX-License-Identifier: Apache-2.0
 */
var securityUser = require('security/v4/user');

exports.getUsername = function () {
    return securityUser.getName();
}

exports.hasAppPrivilege = function (privilegeName) {
    return securityUser.isInRole(privilegeName);
}

exports.hasSystemPrivilege = function (privilegeName) {
    return securityUser.isInRole(privilegeName);
}

exports.assertSystemPrivilege = function (privilegeName) {
    var hasPrivilege = securityUser.isInRole(privilegeName)
    if (!hasPrivilege) {
        throw new NoSuchPrivilegeException(privilegeName);
    }
}

exports.assertAppPrivilege = function (privilegeName) {
    var hasPrivilege = securityUser.isInRole(privilegeName)
    if (!hasPrivilege) {
        throw new NoSuchPrivilegeException(privilegeName);
    }
}

function NoSuchPrivilegeException(privilegeToCheck) {
    this.privilege = privilegeToCheck;
}