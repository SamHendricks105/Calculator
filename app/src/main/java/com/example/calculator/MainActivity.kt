package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AbsListView
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

        var Sum=0;
        var Sum2=0;
        var WhichSum =1; //1 means Sum and 2 means Sum2
        var WhichOp =0 // 1=(+) 2=(-) 3=(*) 4=(/)
        val operationStack = ArrayDeque(listOf(0))//1 =(+),2 =(-),3 =(*),4 =(/)
        fun Clear(view: View){
            val displayText: TextView = findViewById(/* id = */ R.id.textView)
            Sum=0;
            Sum2=0;
            WhichSum =1 // Now when a number button is pushed sum will be impacted
            displayText.setText(Sum.toString())

        }



        fun pushNine(view: View) {

            val displayText: TextView = findViewById(/* id = */ R.id.textView)

            if (WhichSum == 1) {
                    if (Sum != 0)
                    {
                        Sum *= 10
                    }
                        Sum += 9
                    }
            else if(WhichSum == 2)
            {
                if (Sum2 != 0)
                {
                    Sum2 *= 10
                }
                Sum2 += 9

            }
            if(WhichSum ==1) //if which == 1 an opertion button has not been pressed.
            {
                displayText.setText(Sum.toString())
            }

            else if (WhichSum ==2)// if which sum = 2 an operation button hs been pressed
            {
                if(WhichOp ==1)
                {
                    OpSum(view)
                }
                if(WhichOp ==2)
                {
                    OpSub(view)
                }
                if(WhichOp ==3)
                {
                    OpMul(view)
                }
                if(WhichOp ==4)
                {
                    OpDiv(view)
                }
            }

            }
        fun pushEight(view: View) {
            val displayText: TextView = findViewById(/* id = */ R.id.textView)

            if (WhichSum == 1) {
                if (Sum != 0)
                {
                    Sum *= 10
                }
                Sum += 8
            }
            else if(WhichSum == 2)
            {
                if (Sum2 != 0)
                {
                    Sum2 *= 10
                }
                Sum2 += 8

            }
            if(WhichSum ==1) //if which == 1 an opertion button has not been pressed.
            {
                displayText.setText(Sum.toString())
            }

            else if (WhichSum ==2)// if which sum = 2 an operation button hs been pressed
            {
                if(WhichOp ==1)
                {
                    OpSum(view)
                }
                if(WhichOp ==2)
                {
                    OpSub(view)
                }
                if(WhichOp ==3)
                {
                    OpMul(view)
                }
                if(WhichOp ==4)
                {
                    OpDiv(view)
                }
            }
        }
        fun pushSeven(view: View) {
            val displayText: TextView = findViewById(/* id = */ R.id.textView)

            if (WhichSum == 1) {
                if (Sum != 0)
                {
                    Sum *= 10
                }
                Sum += 7
            }
            else if(WhichSum == 2)
            {
                if (Sum2 != 0)
                {
                    Sum2 *= 10
                }
                Sum2 += 7

            }
            if(WhichSum ==1) //if which == 1 an opertion button has not been pressed.
            {
                displayText.setText(Sum.toString())
            }

            else if (WhichSum ==2)// if which sum = 2 an operation button hs been pressed
            {
                if(WhichOp ==1)
                {
                    OpSum(view)
                }
                if(WhichOp ==2)
                {
                    OpSub(view)
                }
                if(WhichOp ==3)
                {
                    OpMul(view)
                }
                if(WhichOp ==4)
                {
                    OpDiv(view)
                }
            }
        }
        fun pushSix(view: View) {
            val displayText: TextView = findViewById(/* id = */ R.id.textView)

            if (WhichSum == 1) {
                if (Sum != 0)
                {
                    Sum *= 10
                }
                Sum += 6
            }
            else if(WhichSum == 2)
            {
                if (Sum2 != 0)
                {
                    Sum2 *= 10
                }
                Sum2 += 6

            }
            if(WhichSum ==1) //if which == 1 an opertion button has not been pressed.
            {
                displayText.setText(Sum.toString())
            }

            else if (WhichSum ==2)// if which sum = 2 an operation button hs been pressed
            {
                if(WhichOp ==1)
                {
                    OpSum(view)
                }
                if(WhichOp ==2)
                {
                    OpSub(view)
                }
                if(WhichOp ==3)
                {
                    OpMul(view)
                }
                if(WhichOp ==4)
                {
                    OpDiv(view)
                }
            }
        }
        fun pushFive(view: View) {
            val displayText: TextView = findViewById(/* id = */ R.id.textView)

            if (WhichSum == 1) {
                if (Sum != 0)
                {
                    Sum *= 10
                }
                Sum += 5
            }
            else if(WhichSum == 2)
            {
                if (Sum2 != 0)
                {
                    Sum2 *= 10
                }
                Sum2 += 5

            }
            if(WhichSum ==1) //if which == 1 an opertion button has not been pressed.
            {
                displayText.setText(Sum.toString())
            }

            else if (WhichSum ==2)// if which sum = 2 an operation button hs been pressed
            {
                if(WhichOp ==1)
                {
                    OpSum(view)
                }
                if(WhichOp ==2)
                {
                    OpSub(view)
                }
                if(WhichOp ==3)
                {
                    OpMul(view)
                }
                if(WhichOp ==4)
                {
                    OpDiv(view)
                }
            }
        }
        fun pushFour(view: View) {
            val displayText: TextView = findViewById(/* id = */ R.id.textView)

            if (WhichSum == 1) {
                if (Sum != 0)
                {
                    Sum *= 10
                }
                Sum += 4
            }
            else if(WhichSum == 2)
            {
                if (Sum2 != 0)
                {
                    Sum2 *= 10
                }
                Sum2 += 4

            }
            if(WhichSum ==1) //if which == 1 an opertion button has not been pressed.
            {
                displayText.setText(Sum.toString())
            }

            else if (WhichSum ==2)// if which sum = 2 an operation button hs been pressed
            {
                if(WhichOp ==1)
                {
                    OpSum(view)
                }
                if(WhichOp ==2)
                {
                    OpSub(view)
                }
                if(WhichOp ==3)
                {
                    OpMul(view)
                }
                if(WhichOp ==4)
                {
                    OpDiv(view)
                }
            }
        }
        fun pushThree(view: View) {
            val displayText: TextView = findViewById(/* id = */ R.id.textView)

            if (WhichSum == 1) {
                if (Sum != 0)
                {
                    Sum *= 10
                }
                Sum += 3
            }
            else if(WhichSum == 2)
            {
                if (Sum2 != 0)
                {
                    Sum2 *= 10
                }
                Sum2 += 3

            }
            if(WhichSum ==1) //if which == 1 an opertion button has not been pressed.
            {
                displayText.setText(Sum.toString())
            }

            else if (WhichSum ==2)// if which sum = 2 an operation button hs been pressed
            {
                if(WhichOp ==1)
                {
                    OpSum(view)
                }
                if(WhichOp ==2)
                {
                    OpSub(view)
                }
                if(WhichOp ==3)
                {
                    OpMul(view)
                }
                if(WhichOp ==4)
                {
                    OpDiv(view)
                }
            }
        }
        fun pushTwo(view: View) {
            val displayText: TextView = findViewById(/* id = */ R.id.textView)

            if (WhichSum == 1) {
                if (Sum != 0)
                {
                    Sum *= 10
                }
                Sum += 2
            }
            else if(WhichSum == 2)
            {
                if (Sum2 != 0)
                {
                    Sum2 *= 10
                }
                Sum2 += 2

            }
            if(WhichSum ==1) //if which == 1 an opertion button has not been pressed.
            {
                displayText.setText(Sum.toString())
            }

            else if (WhichSum ==2)// if which sum = 2 an operation button hs been pressed
            {
                if(WhichOp ==1)
                {
                    OpSum(view)
                }
                if(WhichOp ==2)
                {
                    OpSub(view)
                }
                if(WhichOp ==3)
                {
                    OpMul(view)
                }
                if(WhichOp ==4)
                {
                    OpDiv(view)
                }
            }
        }
        fun pushOne(view: View) {
            val displayText: TextView = findViewById(/* id = */ R.id.textView)

            if (WhichSum == 1) {
                if (Sum != 0)
                {
                    Sum *= 10
                }
                Sum += 1
            }
            else if(WhichSum == 2)
            {
                if (Sum2 != 0)
                {
                    Sum2 *= 10
                }
                Sum2 += 1

            }
            if(WhichSum ==1) //if which == 1 an opertion button has not been pressed.
            {
                displayText.setText(Sum.toString())
            }

            else if (WhichSum ==2)// if which sum = 2 an operation button hs been pressed
            {
                if(WhichOp ==1)
                {
                    OpSum(view)
                }
                if(WhichOp ==2)
                {
                    OpSub(view)
                }
                if(WhichOp ==3)
                {
                    OpMul(view)
                }
                if(WhichOp ==4)
                {
                    OpDiv(view)
                }
            }
        }
    fun pushZero(view: View) {
        val displayText: TextView = findViewById(/* id = */ R.id.textView)

        if (WhichSum == 1) {
            if (Sum != 0)
            {
                Sum *= 10
            }
            Sum += 0
        }
        else if(WhichSum == 2)
        {
            if (Sum2 != 0)
            {
                Sum2 *= 10
            }
            Sum2 += 0

        }
        if(WhichSum ==1) //if which == 1 an opertion button has not been pressed.
        {
            displayText.setText(Sum.toString())
        }

        else if (WhichSum ==2)// if which sum = 2 an operation button hs been pressed
        {
            if(WhichOp ==1)
            {
                OpSum(view)
            }
            if(WhichOp ==2)
            {
                OpSub(view)
            }
            if(WhichOp ==3)
            {
                OpMul(view)
            }
            if(WhichOp ==4)
            {
                OpDiv(view)
            }
        }
    }



    fun OpSum(view: View) {
        WhichSum = 2// now when the user inputs numbers it will be for the second number
        WhichOp =1 // Operation set to +
        val displayText: TextView = findViewById(/* id = */ R.id.textView)
        displayText.setText("$Sum + $Sum2")

    }
    fun OpMul(view: View) {
        WhichSum = 2// now when the user inputs numbers it will be for the second number
        WhichOp =3 // Operation set to *
        val displayText: TextView = findViewById(/* id = */ R.id.textView)
        displayText.setText("$Sum * $Sum2")
    }
    fun OpDiv(view: View) {
        WhichSum = 2// now when the user inputs numbers it will be for the second number
        WhichOp =4 // Operation set to /
        val displayText: TextView = findViewById(/* id = */ R.id.textView)
        displayText.setText("$Sum / $Sum2")
    }
    fun OpSub(view: View) {
        WhichSum = 2// now when the user inputs numbers it will be for the second number
        WhichOp =2 // Operation set to -
        val displayText: TextView = findViewById(/* id = */ R.id.textView)
        displayText.setText("$Sum - $Sum2")
    }




    fun Equal(view: View) {
        val displayText: TextView = findViewById(/* id = */ R.id.textView)
        if(WhichOp ==1)
        {
            Sum = Sum + Sum2

        }
        if(WhichOp ==2)
        {
            Sum = Sum - Sum2
        }
        if(WhichOp ==3)
        {
            Sum = Sum * Sum2
        }
        if(WhichOp ==4)
        {
            Sum = Sum / Sum2
        }
        WhichSum =1
        Sum2 =0
        displayText.setText("$Sum")

    }




}