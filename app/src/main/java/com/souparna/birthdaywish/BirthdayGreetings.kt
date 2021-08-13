package com.souparna.birthdaywish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greetings.*

class BirthdayGreetings : AppCompatActivity() {
    companion object {
        const val NAME_PASSED = "name_passed"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greetings)

        val name = intent.getStringExtra(NAME_PASSED)

        showBirthdayMessage.text = "Happy Birthday\n $name 🎉🎊🎈"
    }
}