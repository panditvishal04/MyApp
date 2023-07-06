package com.vishal.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
   private lateinit var tvn: TextView
   private lateinit var tvo : TextView
    private lateinit var tvh : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        tvn=findViewById(R.id.tvn)
        tvo=findViewById(R.id.tvo)
        tvh=findViewById(R.id.tvh)
//        setActionBar(toolbar)
        val name= intent.getStringExtra("name")
        val age= intent.getStringExtra("age")
        val height= intent.getStringExtra("height")

        tvn.text="Hello  " + name
        tvo.text="you are "+ age +" years old"
        tvh.text="your height is "  + height
//       val name =intent?.getStringExtra("name")
//        val age =intent?.getIntExtra("age",0)
//        val height =intent?.getIntExtra("height",0)
//        println("name $name age $age height $height")
////       toolbar = findViewById(R.id.toolbar)
//        tvn=findViewById(R.id.tvn)
//        tvo=findViewById(R.id.tvo)
//        tvh=findViewById(R.id.tvh)
//        setActionBar(findViewById(R.id.toolbar))
////        toolbar.title="test"
//        supportActionBar?.title="test"
//        tvn.setText("hello $name")
//        tvo.setText("you are $age years old" )
//        tvh.setText("your height is $height")

    }

//    private fun setActionBar(toolbar: Toolbar?) {
//       var toolbar=findViewById<Toolbar>(R.id.toolbar)
//        toolbar.title="test"
//    }
}