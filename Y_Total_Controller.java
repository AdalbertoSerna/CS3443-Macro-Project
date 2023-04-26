package edu.utsa.cs3443.macrocounter.Model;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;

import edu.utsa.cs3443.macrocounter.y_total_activity;

public class Y_Total_Controller implements View.OnClickListener {

    y_total_activity activity;
    public Y_Total_Controller(y_total_activity activity){
        this.activity = activity;
    }

    @Override
    public void onClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);

        builder.setMessage("This will erase all of today's data. Continue?");

        builder.setTitle("ALERT!");

        builder.setCancelable(false);

        builder.setPositiveButton("Ok",(DialogInterface.OnClickListener) (dialog, which)-> {
            
        });
        builder.setNegativeButton("cancel",(DialogInterface.OnClickListener) (dialog,which)->{
            dialog.cancel();
        });
    }
}
