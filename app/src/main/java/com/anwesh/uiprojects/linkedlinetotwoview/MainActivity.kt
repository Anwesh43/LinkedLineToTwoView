package com.anwesh.uiprojects.linkedlinetotwoview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.linetotwoview.LineToTwoView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LineToTwoView.create(this)
    }
}
