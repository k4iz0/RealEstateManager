package ltd.kaizo.realestatemanager.adapter

import android.graphics.Color
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import androidx.core.content.ContextCompat.getColor
import androidx.databinding.BindingAdapter
import ltd.kaizo.realestatemanager.R
import timber.log.Timber

object BindingAdapter {

    @BindingAdapter("emptyWarning")
    fun emptyWarning(view: EditText, textLengthWarningEnabled: Boolean) {
        if (!textLengthWarningEnabled) {
            view.clearOnTextChangedListener()
            return
        }

        view.onTextChanged {
            if (view.text.length < 0) {
                Timber.i("reeeeddd")
                view.setBackgroundColor(getColor(view.context,android.R.color.holo_red_dark))
            } else {
                Timber.i("blueee")
                view.setBackgroundColor(getColor(view.context,R.color.colorPrimary))
            }
        }
    }

    private fun EditText.onTextChanged(action: (CharSequence) -> Unit) {
        addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(string: Editable?) = Unit
            override fun beforeTextChanged(string: CharSequence?, start: Int, count: Int, after: Int) = Unit
            override fun onTextChanged(string: CharSequence?, start: Int, before: Int, count: Int) {
                action(string ?: "")
            }
        })
    }

    private fun EditText.clearOnTextChangedListener() {
        onTextChanged {}
    }
}