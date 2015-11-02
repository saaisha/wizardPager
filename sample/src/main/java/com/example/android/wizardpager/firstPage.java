package com.example.android.wizardpager;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.github.amlcurran.showcaseview.ShowcaseView;
import com.github.amlcurran.showcaseview.targets.ActionItemTarget;
import com.github.amlcurran.showcaseview.targets.ActionViewTarget;
import com.github.amlcurran.showcaseview.targets.ViewTarget;
import com.software.shell.fab.ActionButton;

import java.lang.annotation.Target;

/**
 * Created by saaishasingh on 8/11/15.
 */
public class firstPage extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_page);
        ActionButton actionButton = (ActionButton) findViewById(R.id.action_button);
        actionButton.setButtonColor(Color.parseColor("#F96357"));
        actionButton.setImageResource(R.drawable.genie32);
        actionButton.show();
        new ShowcaseView.Builder(this)
                .setTarget(new ViewTarget(actionButton))
                .setContentTitle("Welcome")
                .setContentText("Click on the find my product wizard so we can assist you in finding exactly what you are looking for!")
                .hideOnTouchOutside()
                .build();
    }

    public void goToWizard(View view)
    {
        Intent toWizard = new Intent(firstPage.this,MainActivity.class);
        startActivity(toWizard);
    }
}
