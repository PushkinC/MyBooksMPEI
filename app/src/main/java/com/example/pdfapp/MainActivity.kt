package com.example.pdfapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Engineer_cl(v: View){
        intent = Intent(this, ChooseActivity::class.java)
        intent.putExtra("num", "2")
        intent.putExtra("0", arrayOf("Руководство по электрической схеме", "Engineer/Electrical circuit manual.pdf"))
        intent.putExtra("1", arrayOf("Виды, разрезы, сечения", "Engineer/Types, sections, sections.pdf"))
        startActivity(intent)
    }
    fun Linal_cl(v:View){
        intent = Intent(this, ChooseActivity::class.java)
        intent.putExtra("num", "3")
        intent.putExtra("0", arrayOf("TR Булычева Григорьев 2006", "Linal/TR_Булычева Григорьев 2006.pdf"))
        intent.putExtra("1", arrayOf("Проскуряков 3 (сборник задач)", "Linal/проскуряков 3 (сборник задач).pdf"))
        intent.putExtra("2", arrayOf("TR_VM2_2002_part_1", "Linal/TR_VM2_2002_part_1.pdf"))
        startActivity(intent)
    }
    fun Phisics_cl(v:View){
        intent = Intent(this, ChooseActivity::class.java)
        intent.putExtra("num", "4")
        intent.putExtra("0", arrayOf("Описания очных работ", "Phisics/Описания очных работ.pdf"))
        intent.putExtra("1", arrayOf("Сборник задач 2006", "Phisics/Сборник задач 2006.pdf"))
        intent.putExtra("2", arrayOf("Сборник задач 2022", "Phisics/Сборник задач 2022.pdf"))
        intent.putExtra("3", arrayOf("Конспект 22", "Phisics/Конспект_22.pdf"))
        startActivity(intent)
    }
    fun English_cl(v: View){
        intent = Intent(this, ChooseActivity::class.java)
        intent.putExtra("num", "2")
        intent.putExtra("0", arrayOf("Технический английский", "English/Технический_английский_Базовый_курс.pdf"))
        intent.putExtra("1", arrayOf("БАК-Грамматический-практикум", "English/БАК-Грамматический-практикум.pdf"))
        startActivity(intent)
    }

    fun Matan_cl(v: View){
        intent = Intent(this, ChooseActivity::class.java)
        intent.putExtra("num", "5")
        intent.putExtra("0", arrayOf("Сборник задач по математике для втузов ч. 2", "Matan/Сборник задач по математике для втузов ч. 2.pdf"))
        intent.putExtra("1", arrayOf("Таблица производных", "Matan/Таблица производных.pdf"))
        intent.putExtra("2", arrayOf("Эквивалентные функции", "Matan/Эквивалентные функции.pdf"))
        intent.putExtra("3", arrayOf("Учебное поcобие Симушев", "Matan/Учебное поcобие Симушев.pdf"))
        intent.putExtra("4", arrayOf("Таблица интегралов", "Matan/Таблица интегралов.pdf"))
        startActivity(intent)
    }
}