package com.example.a30daysofcooktok

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class RecipeAdapter(
    private val getActivity: MainActivity,
    private val recipeList: List<OverviewRecipe>) : RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>(){

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecipeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_recipe_item, parent, false)

        return RecipeViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: RecipeViewHolder,
        position: Int
    ) {
        holder.recipeImg.setImageResource(recipeList[position].img)
        holder.recipeName.text = recipeList[position].name
        holder.recipeDescription.text = recipeList[position].description
        holder.day.text = recipeList[position].day

        holder.cardView.setOnClickListener {
            val intent = Intent(holder.itemView.context, RecipeDetailActivity::class.java)
            intent.putExtra("recipeImg", recipeList[position].img)
            intent.putExtra("recipeName", recipeList[position].name)
            intent.putExtra("recipeDescription", recipeList[position].description)
            intent.putExtra("tiktokUrl", recipeList[position].tiktokUrl)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return recipeList.size
    }

    class RecipeViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {
        val recipeImg : ImageView = itemView.findViewById(R.id.recipe_img)
        val recipeName : TextView = itemView.findViewById(R.id.recipe_name)
        val recipeDescription : TextView = itemView.findViewById(R.id.recipe_desc)
        val day : TextView = itemView.findViewById(R.id.day)
        val cardView : CardView = itemView.findViewById(R.id.recipeCardView)
    }

}