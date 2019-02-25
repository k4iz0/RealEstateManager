package ltd.kaizo.realestatemanager.utils

import android.widget.EditText
import androidx.databinding.InverseBindingAdapter



class BindingAdapter {

    @androidx.databinding.BindingAdapter("android:text")
    fun setText(view: EditText, value: Int) {
        view.setText(value.toString())
    }

    @InverseBindingAdapter(attribute = "android:text")
    fun getText(view: EditText): Int {
        return view.text.toString().toInt()
    }
}