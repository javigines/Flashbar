package com.andrognito.flashbar.view

import android.content.Context
import android.support.v7.widget.AppCompatTextView
import android.util.AttributeSet
import com.andrognito.flashbar.R

internal class FbButton : AppCompatTextView {

    constructor(context: Context) : this(context, null)

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, R.style.FbButtonStyle)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
}