package com.example.android.leonardo_1202154152_modul2;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 */
public class DatePickerFragment extends DialogFragment
        implements DatePickerDialog.OnDateSetListener {

    //Untuk mengembalikan nilai yang dipilih melalui datefragment
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    //Ketika tanggal sudah diset maka akan memanggil method processDatePickerResult yang ada di TakeAwayActivity
    @Override
    public void onDateSet(DatePicker view, int year, int month, int day) {
        TakeAwayActivity activity = (TakeAwayActivity) getActivity();
        activity.processDatePickerResult(year, month, day);
    }
}
