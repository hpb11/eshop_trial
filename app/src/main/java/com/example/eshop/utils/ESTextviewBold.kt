package com.example.eshop.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import java.security.AccessControlContext

class ESTextviewBold (context: Context, attrs: AttributeSet) : AppCompatTextView(context,attrs)  {
    init{
        applyFont()
    }
    private fun applyFont()
    {
        val typeface: Typeface = Typeface.createFromAsset(context.assets,"Montserrat-Bold.ttf")
        setTypeface(typeface)
    }
}