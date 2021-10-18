package com.example.companionobject

import android.graphics.Color
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

//step 1: create class
class background {
    //step 2: create a companion object (object name is optional)
    companion object changeBackground {
        //step 3: write your variable or/and function inside the companion object
        fun change(layout: ConstraintLayout, theme:String, textView:TextView, userInput:EditText, btnChange:Button){
            when{
                theme.equals("Day",true) -> {
                    layout.setBackgroundResource(R.drawable.day1)
                    textView.setTextColor(Color.BLACK)
                    userInput.setTextColor(Color.BLACK)
                    userInput.setHintTextColor(Color.GRAY)
                    btnChange.setTextColor(Color.BLACK)
                    userInput.text.clear()
                }
                theme.equals("Night",true)-> {
                    layout.setBackgroundResource(R.drawable.night)
                    textView.setTextColor(Color.WHITE)
                    userInput.setTextColor(Color.WHITE)
                    userInput.setHintTextColor(Color.WHITE)
                    btnChange.setTextColor(Color.WHITE)
                    userInput.text.clear()
                }
            }//end when
        }//end change()

    }//end companion()
}


