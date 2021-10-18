package com.example.companionobject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var userInput: EditText
    lateinit var btnChange: Button
    lateinit var userThem:String
    lateinit var mainLayout: ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView=findViewById(R.id.textView)
        userInput=findViewById(R.id.edTheme)
        btnChange=findViewById(R.id.btnChange)
        mainLayout=findViewById(R.id.CL)

        //step 3: access data whatever you want
        //To Access the data, just call the Class name in another class (Activity) and use dot notation to access its members.
        textView.text=constantValues.textMsg

        btnChange.setOnClickListener(){
            userThem=userInput.text.toString()
            if(userThem.isNotEmpty()){
                background.change(mainLayout,userThem,textView,userInput, btnChange)
            }
        }//end btnChange listener

    }//end onCreate()
}