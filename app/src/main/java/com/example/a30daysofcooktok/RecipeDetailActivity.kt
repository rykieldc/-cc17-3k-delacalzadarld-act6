package com.example.a30daysofcooktok

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RecipeDetailActivity : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recipe_detail)

        val backButton: Button = findViewById(R.id.back_button)
        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
        }


        val recipeImg = intent.getIntExtra("recipeImg", 0)
        val recipeName = intent.getStringExtra("recipeName")
        val recipeDescription = intent.getStringExtra("recipeDescription")
        val tiktokUrl = intent.getStringExtra("tiktokUrl")


        val recipeImageView: ImageView = findViewById(R.id.recipe_img)
        val recipeNameTextView: TextView = findViewById(R.id.recipe_name)
        val recipeDescriptionTextView: TextView = findViewById(R.id.recipe_desc)
        val recipeWebView: WebView = findViewById(R.id.recipe_vid)
        val webChromeClient = object : WebChromeClient() {}


        recipeImageView.setImageResource(recipeImg)
        recipeNameTextView.text = recipeName
        recipeDescriptionTextView.text = recipeDescription
        recipeWebView.settings.javaScriptEnabled = true
        recipeWebView.loadData(tiktokUrl.toString(), "text/html", "UTF-8")
        recipeWebView.webChromeClient = webChromeClient



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

}