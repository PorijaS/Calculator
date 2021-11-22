package com.example.calculator

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.example.calculator.databinding.ActivityMainBinding
import android.util.Log
import android.view.Display
import android.widget.EditText
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import org.mariuszgromada.math.mxparser.Expression
import java.lang.Exception
import java.text.DecimalFormat


class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        clearBTN.setOnClickListener {
            input.text = ""
            output.text = ""
        }

        bracketLeftBTN.setOnClickListener {
            input.text = addToInputText("(")
        }

        bracketRightBTN.setOnClickListener {
            input.text = addToInputText(")")
        }

        zeroBTN.setOnClickListener {
            input.text = addToInputText("0")
        }

        oneBTN.setOnClickListener {
            input.text = addToInputText("1")
        }

        twoBTN.setOnClickListener {
            input.text = addToInputText("2")
        }

        threeBTN.setOnClickListener {
            input.text = addToInputText("3")
        }

        fourBTN.setOnClickListener {
            input.text = addToInputText("4")
        }

        fiveBTN.setOnClickListener {
            input.text = addToInputText("5")
        }

        sixBTN.setOnClickListener {
            input.text = addToInputText("6")
        }

        sevenBTN.setOnClickListener {
            input.text = addToInputText("7")
        }

        eightBTN.setOnClickListener {
            input.text = addToInputText("8")
        }

        nineBTN.setOnClickListener {
            input.text = addToInputText("9")
        }

        pointBTN.setOnClickListener {
            input.text = addToInputText(".")
        }

        divideBTN.setOnClickListener {
            input.text = addToInputText("÷")
        }

        multiplyBTN.setOnClickListener {
            input.text = addToInputText("×")
        }

        subtractBTN.setOnClickListener {
            input.text = addToInputText("-")
        }

        addBTN.setOnClickListener {
            input.text = addToInputText("+")
        }

        equalBTN.setOnClickListener {
            showResult()
        }


    }

    private fun getInputExpression(): String {
        var expression = input.text.replace(Regex("÷"), "/")
        expression = expression.replace(Regex("×"), "*")
        return expression
    }

    private fun showResult() {
        try {
            val expression = getInputExpression()
            val result = Expression(expression).calculate()
            if (result.isNaN()) {
                // Show Error Message
                output.text = "Error"
                output.setTextColor(ContextCompat.getColor(this, R.color.red))
            } else {
                // Show Result
                output.text = DecimalFormat("0.######").format(result).toString()
                output.setTextColor(ContextCompat.getColor(this, R.color.green))
            }
        } catch (e: Exception) {
            // Show Error Message
            output.text = "Error"
            output.setTextColor(ContextCompat.getColor(this, R.color.red))
        }
    }

    private fun addToInputText(buttonValue: String): String {
        return "${input.text}$buttonValue"
    }

    fun backSpaceAction(view: android.view.View) {
        val length = input.length()
        if (length > 0)
            input.text = input.text.subSequence(0, length - 1)
    }
}