/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.syncope.fit.enduser;

import org.apache.syncope.client.enduser.pages.Login;
import org.apache.wicket.markup.html.form.TextField;
import org.junit.jupiter.api.Test;

public class SelfRegistrationITCase extends AbstractEnduserITCase {

    @Test
    public void selfCreate() {
        TESTER.startPage(Login.class);
        TESTER.assertRenderedPage(Login.class);

        TESTER.clickLink("self-registration");

        TESTER.assertComponent("body:wizard:form:username", TextField.class);
        
//        Component component = findComponentByProp("username", CONTAINER
//                + ":searchContainer:resultTable:tablePanel:groupForm:checkgroup:dataTable", "puccini");
//        assertNotNull(component);
//
//        TESTER.executeAjaxEvent(component.getPageRelativePath(), Constants.ON_CLICK);
//        TESTER.clickLink(TAB_PANEL + "outerObjectsRepeater:1:outer:container:content:togglePanelContainer:container:"
//                + "actions:actions:actionRepeater:0:action:action");
//
//        TESTER.assertComponent(TAB_PANEL + "outerObjectsRepeater:0:outer:form:content:form:view:username:textField",
//                TextField.class);
//
//        FormTester formTester = TESTER.newFormTester(TAB_PANEL + "outerObjectsRepeater:0:outer:form:content:form");
//        assertNotNull(formTester);
//
//        formTester.submit("buttons:next");
//
//        formTester = TESTER.newFormTester(TAB_PANEL + "outerObjectsRepeater:0:outer:form:content:form");
//        assertNotNull(formTester);
//        formTester.submit("buttons:next");
//
//        formTester = TESTER.newFormTester(TAB_PANEL + "outerObjectsRepeater:0:outer:form:content:form");
//        assertNotNull(formTester);
//        formTester.submit("buttons:next");
//
//        formTester = TESTER.newFormTester(TAB_PANEL + "outerObjectsRepeater:0:outer:form:content:form");
//        assertNotNull(formTester);
//        formTester.submit("buttons:next");
//
//        formTester = TESTER.newFormTester(TAB_PANEL + "outerObjectsRepeater:0:outer:form:content:form");
//        assertNotNull(formTester);
//        formTester.submit("buttons:next");
//
//        formTester = TESTER.newFormTester(TAB_PANEL + "outerObjectsRepeater:0:outer:form:content:form");
//        assertNotNull(formTester);
//        formTester.submit("buttons:next");
//
//        formTester = TESTER.newFormTester(TAB_PANEL + "outerObjectsRepeater:0:outer:form:content:form");
//        assertNotNull(formTester);
//        formTester.submit("buttons:next");
//
//        formTester = TESTER.newFormTester(TAB_PANEL + "outerObjectsRepeater:0:outer:form:content:form");
//        assertNotNull(formTester);
//        formTester.submit("buttons:finish");
//
//        TESTER.assertInfoMessages("Operation executed successfully");
//
//        TESTER.assertComponent(TAB_PANEL
//                + "outerObjectsRepeater:0:outer:form:content:customResultBody:resources:firstLevelContainer:first:"
//                + "container:content:group:beans:0:fields:1:field", Label.class);
//
//        TESTER.clickLink(TAB_PANEL + "outerObjectsRepeater:0:outer:form:content:action:actionRepeater:0:action:action");
//
//        component = findComponentByProp("username", CONTAINER
//                + ":searchContainer:resultTable:tablePanel:groupForm:checkgroup:dataTable", "puccini");
//        assertNotNull(component);
    }

    @Test
    public void selfPasswordReset() {
    }

    @Test
    public void selfUpdate() {
        doLogin(ADMIN_UNAME, ADMIN_PWD);
    }

    @Test
    public void mustChangePassword() {
    }
}
