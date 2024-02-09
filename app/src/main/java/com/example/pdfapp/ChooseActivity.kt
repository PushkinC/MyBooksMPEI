package com.example.pdfapp


import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity


class ChooseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose)

        val l_layout = findViewById<View>(R.id.linear_layout) as LinearLayout

        val n = intent.getStringExtra("num")!!.toInt()
        for (i in 0..<n){
            val extra = intent.getStringArrayExtra(i.toString())
            val btn = Button(this)
            btn.text = extra!![0]
            btn.background = resources.getDrawable(R.drawable.test)
            btn.setTextColor(Color.parseColor("#000000"))
            btn.width = 300

            if (i != 0) {
                val layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                )

                layoutParams.setMargins(0, 50, 0, 0)
                btn.setLayoutParams(layoutParams)
            }

            l_layout.addView(btn)

            btn.setOnClickListener {
                intent = Intent(this@ChooseActivity, ViewActivity::class.java)

                intent.putExtra("path", extra[1].toString())

                startActivity(intent)
            }
        }
    }



}