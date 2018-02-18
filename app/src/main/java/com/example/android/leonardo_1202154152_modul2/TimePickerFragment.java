package com.example.android.leonardo_1202154152_modul2;


import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v4.app.DialogFragment;
import android.app.TimePickerDialog;
import android.widget.TimePicker;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 */
public class TimePickerFragment extends DialogFragment
        implements TimePickerDialog.OnTimeSetListener {

    //Untuk mengembalikan nilai yang dipilih melalui timefragment
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        return new TimePickerDialog(getActivity(), this, hour, minute,
                DateFormat.is24HourFormat(getActivity()));
    }

    //Ketika waktu sudah diset maka akan memanggil method processDatePickerResult yang ada di TakeAwayActivity
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        TakeAwayActivity activity = (TakeAwayActivity) getActivity();
        activity.processTimePickerResult(hourOfDay, minute);
    }
}
