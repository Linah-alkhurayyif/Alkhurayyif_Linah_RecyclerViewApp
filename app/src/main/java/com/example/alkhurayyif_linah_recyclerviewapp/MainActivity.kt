package com.example.alkhurayyif_linah_recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var tasks:ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tasks = ArrayList<String>()
        val RecyclerView = findViewById<RecyclerView>(R.id.RecyclerView)
        val Addbtn =findViewById<Button>(R.id.Addbtn)
        Addbtn.setOnClickListener{
            addTask()
            }
        RecyclerView.adapter = RecyclerViewAdapter(tasks)
        RecyclerView.layoutManager  = LinearLayoutManager(this)

    }
    fun addTask(){
        val AddTask = findViewById<EditText>(R.id.AddTask)
        var editText = AddTask.text.toString()
        Log.d("MainActivity",editText)
        tasks.add(AddTask.text.toString())
    }
}