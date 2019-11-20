package com.sumayea.kotlin_recyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById(R.id.recycler_View) as RecyclerView

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val users= ArrayList<User>()

        users.add(User("Sumayea", "Mirpur"))
        users.add(User("Sumayea", "Mirpur"))
        users.add(User("Sumayea", "Mirpur"))
        users.add(User("Sumayea", "Mirpur"))
        users.add(User("Sumayea", "Mirpur"))
        users.add(User("Sumayea", "Mirpur"))
        users.add(User("Sumayea", "Mirpur"))
        users.add(User("Sumayea", "Mirpur"))

        val adapter = CustomAdapter(users)

        recyclerView.adapter = adapter

    }
}
