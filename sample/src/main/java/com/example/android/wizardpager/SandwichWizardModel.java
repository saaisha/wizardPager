/*
 * Copyright 2012 Roman Nurik
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.wizardpager;

import android.content.Context;

import com.example.android.wizardpager.pages.CustomerInfoPage;
import com.tech.freak.wizardpager.model.AbstractWizardModel;
import com.tech.freak.wizardpager.model.BranchPage;
import com.tech.freak.wizardpager.model.MultipleFixedChoicePage;
import com.tech.freak.wizardpager.model.NumberPage;
import com.tech.freak.wizardpager.model.PageList;
import com.tech.freak.wizardpager.model.SingleFixedChoicePage;
import com.tech.freak.wizardpager.model.TextPage;

public class SandwichWizardModel extends AbstractWizardModel {
    public SandwichWizardModel(Context context) {
        super(context);
    }

    @Override
    protected PageList onNewRootPageList() {
        return new PageList(new BranchPage(this, "Product").addBranch(
                "Car",
                new MultipleFixedChoicePage(this, "Type").setChoices("Hatchback",
                        "Sedan", "SUV"),

                new SingleFixedChoicePage(this, "Transmission").setChoices(
                        "Manual",
                        "Automatic"),

                new SingleFixedChoicePage(this, "Fuel type").setChoices("Petrol",
                         "Diesel"),

                new MultipleFixedChoicePage(this, "Attachments").setChoices("Aux Cable", "Car Fragrance","Baby seat")
                //,

//                new BranchPage(this, "Toasted?")
//                        .addBranch(
//                                "Yes",
//                                new SingleFixedChoicePage(this, "Toast time")
//                                        .setChoices("30 seconds", "1 minute",
//                                                "2 minutes")).addBranch("No")
//                        .setValue("No")
 )

                .addBranch(
                        "Motorcycles",
                        new SingleFixedChoicePage(this, "Type").setChoices(
                                "Sport", "Cruiser","Scooter").setRequired(true),

                        new MultipleFixedChoicePage(this, "Brand").setChoices(
                                "Harley Davidson", "Yamaha", "Bajaj").setValue("Any brand"),
                        new NumberPage(this, "How Many Helmets do you require ?").setRequired(false)));
//                ,
//                new TextPage(this, "Comments").setRequired(true)
//
//                        .setRequired(true),

//                new CustomerInfoPage(this, "Your info").setRequired(true));
    }
}
