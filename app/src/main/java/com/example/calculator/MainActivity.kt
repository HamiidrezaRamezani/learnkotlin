package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun clickButtonEvent(view: View) {

        val selectionButton = view as TextView
        val currentNumber: String = showNumber.text.toString()
        val newNumber = setNextCharacter(currentNumber, selectionButton)
        showNumber.setText(newNumber)
    }

    fun setNextCharacter(oldNumber: String, selectedButton: TextView): String {

        var number = oldNumber
        when (selectedButton.id) {
            btn_17.id -> {
                if (number == "0" || number == "") {
                    number = "0"
                } else {
                    number += "0"
                }
            }

            btn_13.id -> {
                if (number == "0" || number == "") {
                    number = "1"
                } else {
                    number += "1"
                }
            }

            btn_14.id -> {
                if (number == "0" || number == "") {
                    number = "2"
                } else {
                    number += "2"
                }
            }
            btn_15.id -> {
                if (number == "0" || number == "") {
                    number = "3"
                } else {
                    number += "3"
                }
            }
            btn_5.id -> {
                if (number == "0" || number == "") {
                    number = "7"
                } else {
                    number += "7"
                }
            }
            btn_6.id -> {
                if (number == "0" || number == "") {
                    number = "8"
                } else {
                    number += "8"
                }
            }
            btn_7.id -> {
                if (number == "0" || number == "") {
                    number = "9"
                } else {
                    number += "9"
                }
            }
            btn_9.id -> {
                if (number == "0" || number == "") {
                    number = "4"
                } else {
                    number += "4"
                }
            }
            btn_10.id -> {
                if (number == "0" || number == "") {
                    number = "5"
                } else {
                    number += "5"
                }
            }
            btn_11.id -> {
                if (number == "0" || number == "") {
                    number = "6"
                } else {
                    number += "6"
                }
            }
        }
        return number
    }
}