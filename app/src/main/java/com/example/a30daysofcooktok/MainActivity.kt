package com.example.a30daysofcooktok

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var recyclerView : RecyclerView? = null
    private var recipeAdapter : RecipeAdapter? = null
    private var recipeList = mutableListOf<OverviewRecipe>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen()
        Thread.sleep(3250)

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        recipeList = ArrayList()

        recyclerView = findViewById(R.id.rvRecipes)!!
        recipeAdapter = RecipeAdapter(this@MainActivity, recipeList)

        val layoutManager :RecyclerView.LayoutManager = GridLayoutManager(this, 1)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = recipeAdapter

        prepareRecipeListData()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
private fun prepareRecipeListData(){
    var recipe = OverviewRecipe(
        "Tuna Mayo Rice Bowl",
        "This simple yet satisfying dish features a flavorful blend of creamy tuna, mayonnaise, and optional seasonings, nestled between a bed of fluffy rice and wrapped in a sheet of crisp nori seaweed. It's then rolled and sliced into bite-sized pieces, perfect for a quick and easy meal or snack. Customize it with your favorite toppings like avocado, kimchi, or furikake for an extra burst of flavor.",
        "DAY 01",
        R.drawable.recipe01,
        "<iframe src=\"https://www.tiktok.com/embed/v2/7399595962433408274\" width=\"800\" height=\"750\" style=\"max-width:100%;\" allowfullscreen></iframe>"
    )
    recipeList.add(recipe)

    recipe = OverviewRecipe(
        "Milk Pastillas",
        "Milk Pastillas, a traditional Filipino sweet, is making waves on TikTok with its simple elegance and melt-in-your-mouth texture. This confection, made with just condensed milk, powdered milk, and sugar, is surprisingly easy to create and endlessly customizable.",
        "DAY 02",
        R.drawable.recipe02,
        "<iframe src=\"https://www.tiktok.com/embed/v2/7275538354840620293\" width=\"800\" height=\"750\" style=\"max-width:100%;\" allowfullscreen></iframe>"
    )
    recipeList.add(recipe)

    recipe = OverviewRecipe(
        "Creamy Spinach Toast",
        "Inspired by the beloved Angel's Pizza Creamy Spinach Dip, this toast takes the flavors to a whole new level of deliciousness. Toasted bread is generously layered with a creamy spinach and cheese mixture, reminiscent of the iconic dip, creating a symphony of textures and tastes.",
        "DAY 03",
        R.drawable.recipe03,
        "<iframe src=\"https://www.tiktok.com/embed/v2/7370966146503232774\" width=\"800\" height=\"750\" style=\"max-width:100%;\" allowfullscreen></iframe>"
    )
    recipeList.add(recipe)

    recipe = OverviewRecipe(
        "Cucumber Salad",
        "Sometimes you just need to eat an entire cucumber and here's the best way to do it.",
        "DAY 04",
        R.drawable.recipe04,
        "<iframe src=\"https://www.tiktok.com/embed/v2/7428720224842550534\" width=\"800\" height=\"750\" style=\"max-width:100%;\" allowfullscreen></iframe>"
    )
    recipeList.add(recipe)

    recipe = OverviewRecipe(
        "Spam Musubi",
        "Spam Musubi is a classic Hawaiian snack that's taken TikTok by storm! This savory and satisfying treat features grilled slices of Spam nestled atop a block of seasoned sushi rice, all wrapped together with a band of nori seaweed. It's the perfect grab-and-go snack, lunch, or appetizer, and its simple yet delicious flavors have made it a viral sensation.",
        "DAY 05",
        R.drawable.recipe05,
        "<iframe src=\"https://www.tiktok.com/embed/v2/7067813995398368539\" width=\"800\" height=\"750\" style=\"max-width:100%;\" allowfullscreen></iframe>"
    )
    recipeList.add(recipe)

    recipe = OverviewRecipe(
        "Milo Ice Cream Sandwich",
        "This no-churn Milo Ice Cream Sandwich is a delightful frozen treat that's surprisingly easy to make. The creamy, chocolatey ice cream is crafted by simply combining Milo powder, condensed milk, and all-purpose cream. This luscious mixture is then layered between graham crackers, creating a satisfying crunch that complements the smooth, frozen filling. It's a nostalgic and refreshing dessert that's perfect for a quick and easy homemade treat.",
        "DAY 06",
        R.drawable.recipe06,
        "<iframe src=\"https://www.tiktok.com/embed/v2/7089366855919340827\" width=\"800\" height=\"750\" style=\"max-width:100%;\" allowfullscreen></iframe>"
    )
    recipeList.add(recipe)

    recipe = OverviewRecipe(
        "Cheesy Buldak Ramen",
        "This Cheesy Buldak Ramen is taking over TikTok feeds with its irresistible combination of spicy and cheesy goodness! This viral recipe elevates the popular Buldak Ramen by adding a generous layer of melted cheese, creating a creamy and indulgent contrast to the fiery noodles. It's a simple yet satisfying dish that's perfect for spice lovers and cheese enthusiasts alike, and its popularity on TikTok is a testament to its deliciousness.",
        "DAY 07",
        R.drawable.recipe07,
        "<iframe src=\"https://www.tiktok.com/embed/v2/7383238385327951109\" width=\"800\" height=\"750\" style=\"max-width:100%;\" allowfullscreen></iframe>"
    )
    recipeList.add(recipe)

    recipe = OverviewRecipe(
        "Tanghulu",
        "Tanghulu, a traditional Chinese street food, is captivating TikTok users with its glossy, vibrant appearance and satisfying crunch. This sweet treat features skewered fruits, typically strawberries and grapes, coated in a hardened sugar syrup, creating a beautiful and delicious candy-like shell. Its eye-catching visuals and ASMR-worthy sounds have made it a viral sensation, inspiring countless TikTok videos and tempting viewers to try this unique culinary delight.",
        "DAY 08",
        R.drawable.recipe08,
        "<iframe src=\"https://www.tiktok.com/embed/v2/7326892850531028230\" width=\"800\" height=\"750\" style=\"max-width:100%;\" allowfullscreen></iframe>"
    )
    recipeList.add(recipe)

    recipe = OverviewRecipe(
        "Pizza Toastie",
        "A quick and easy snack or meal that delivers all the flavors of pizza in a crispy, golden-brown package. This simple recipe involves layering your favorite pizza toppings between two slices of bread, then air frying to perfection. The result is a warm and gooey toastie with a satisfying crunch, perfect for a quick lunch, snack, or light dinner.",
        "DAY 09",
        R.drawable.recipe09,
        "<iframe src=\"https://www.tiktok.com/embed/v2/7272772615624723744\" width=\"800\" height=\"750\" style=\"max-width:100%;\" allowfullscreen></iframe>"
    )
    recipeList.add(recipe)

    recipe = OverviewRecipe(
        "S'mores",
        "A classic campfire treat that's easy to make at home. This recipe involves toasting marshmallows to golden perfection and sandwiching them between graham crackers with a layer of melted chocolate. The combination of gooey marshmallow, crunchy graham crackers, and rich chocolate creates a symphony of textures and flavors that's sure to delight. Whether you enjoy them around a bonfire or in the comfort of your own kitchen, S'mores are a fun and delicious treat for all ages.",
        "DAY 10",
        R.drawable.recipe10,
        "<iframe src=\"https://www.tiktok.com/embed/v2/7313003569421077766\" width=\"800\" height=\"750\" style=\"max-width:100%;\" allowfullscreen></iframe>"
    )
    recipeList.add(recipe)

    recipe = OverviewRecipe(
        "Crispy Spud",
        "A simple yet satisfying dish featuring crispy, golden-brown potatoes that are perfectly seasoned and cooked to perfection. Whether you prefer them roasted, air-fried, or deep-fried, these potatoes are a versatile side dish or snack that's sure to please. ",
        "DAY 11",
        R.drawable.recipe11,
        "<iframe src=\"https://www.tiktok.com/embed/v2/7407413939090345249\" width=\"800\" height=\"750\" style=\"max-width:100%;\" allowfullscreen></iframe>"
    )
    recipeList.add(recipe)

    recipe = OverviewRecipe(
        "DIY Konu Mini Krunch",
        "A fun and easy treat that's perfect for satisfying your sweet cravings. These bite-sized delights are made by combining condensed milk, Milo powder, and EC Choco Flakes, resulting in a rich, chocolatey, and crunchy snack. Simply mix the ingredients and enjoy! It's a delightful and customizable treat that's perfect for sharing with friends and family.",
        "DAY 12",
        R.drawable.recipe12,
        "<iframe src=\"https://www.tiktok.com/embed/v2/7380287284534332677\" width=\"800\" height=\"750\" style=\"max-width:100%;\" allowfullscreen></iframe>"
    )
    recipeList.add(recipe)

    recipe = OverviewRecipe(
        "Chicken Croquette",
        "These crispy, golden-brown delights are made with a creamy mixture of shredded chicken, mashed potatoes, and aromatic spices, then coated in breadcrumbs and deep-fried to perfection. Their irresistible crunch and savory flavor have captivated TikTok users, making them a must-try for anyone seeking a delicious and satisfying snack.",
        "DAY 13",
        R.drawable.recipe13,
        "<iframe src=\"https://www.tiktok.com/embed/v2/7263339988559990022\" width=\"800\" height=\"750\" style=\"max-width:100%;\" allowfullscreen></iframe>"
    )
    recipeList.add(recipe)

    recipe = OverviewRecipe(
        "Chocolate Strawberries",
        "A classic treat that's both elegant and delicious. Fresh, juicy strawberries are dipped in rich, melted chocolate, creating a perfect balance of sweet and tart flavors. These delightful bites are perfect for special occasions, romantic gestures, or simply indulging in a sweet treat. Customize them with drizzles of white chocolate, sprinkles, or chopped nuts for an extra touch of decadence.",
        "DAY 14",
        R.drawable.recipe14,
        "<iframe src=\"https://www.tiktok.com/embed/v2/7301804658136304928\" width=\"800\" height=\"750\" style=\"max-width:100%;\" allowfullscreen></iframe>"
    )
    recipeList.add(recipe)

    recipe = OverviewRecipe(
        "Baked Sushi",
        "Baked Sushi is the latest food trend taking over TikTok, offering a fun and creative twist on the classic Japanese dish. This viral recipe involves layering sushi rice, your favorite fillings, and savory sauces in a baking dish, then baking until golden brown and bubbly. The result is a warm, comforting, and shareable meal that's perfect for parties or a cozy night in.",
        "DAY 15",
        R.drawable.recipe15,
        "<iframe src=\"https://www.tiktok.com/embed/v2/7333933025916357893\" width=\"800\" height=\"750\" style=\"max-width:100%;\" allowfullscreen></iframe>"
    )
    recipeList.add(recipe)

    recipe = OverviewRecipe(
        "Milo Dalgona",
        "Milo Dalgona is a delightful and frothy beverage inspired by the popular Dalgona coffee trend. This creamy treat is made by whipping together Milo powder, sugar, and hot water until it reaches a light and airy consistency. It's then spooned over milk or your favorite beverage, creating a visually appealing and flavorful drink that's perfect for a sweet pick-me-up.",
        "DAY 16",
        R.drawable.recipe16,
        "<iframe src=\"https://www.tiktok.com/embed/v2/7091625287611452698\" width=\"800\" height=\"750\" style=\"max-width:100%;\" allowfullscreen></iframe>"
    )
    recipeList.add(recipe)

    recipe = OverviewRecipe(
        "Filipino Hotcakes",
        "Filipino Hotcakes are a popular street food delicacy, known for their fluffy texture and irresistible aroma that fills the air. These thin and delicate pancakes are cooked on sizzling hot griddles, creating a slightly crisp exterior and a soft, airy interior. They're often served with a generous drizzle of margarine and sugar, creating a simple yet satisfying treat that's perfect for a quick and delicious snack on the go.",
        "DAY 17",
        R.drawable.recipe17,
        "<iframe src=\"https://www.tiktok.com/embed/v2/7338413869624315141\" width=\"800\" height=\"750\" style=\"max-width:100%;\" allowfullscreen></iframe>"
    )
    recipeList.add(recipe)

    recipe = OverviewRecipe(
        "Spring Seaweed Roll",
        "These Fried Spring Rolls offer a unique twist on the classic appetizer, using nori seaweed sheets instead of traditional wrappers. This innovative approach creates a crispy, umami-rich exterior that perfectly complements the savory fillings inside. Fill them with your favorite stir-fried vegetables, meats, or noodles, then deep-fry to golden perfection. The result is a delightful combination of textures and flavors that will tantalize your taste buds.",
        "DAY 18",
        R.drawable.recipe18,
        "<iframe src=\"https://www.tiktok.com/embed/v2/7389803071074798866\" width=\"800\" height=\"750\" style=\"max-width:100%;\" allowfullscreen></iframe>"
    )
    recipeList.add(recipe)

    recipe = OverviewRecipe(
        "Cream-O Pops",
        "Cream-O Pops are a nostalgic frozen treat that brings back childhood memories with every bite. These creamy and chocolatey popsicles are made with a simple blend of milk, cream, sugar, and cocoa powder, creating a rich and satisfying flavor that's perfect for cooling down on a hot day. Their smooth texture and classic chocolate taste make them a beloved treat for all ages.",
        "DAY 19",
        R.drawable.recipe19,
        "<iframe src=\"https://www.tiktok.com/embed/v2/7071818499638824218\" width=\"800\" height=\"750\" style=\"max-width:100%;\" allowfullscreen></iframe>"
    )
    recipeList.add(recipe)

    recipe = OverviewRecipe(
        "Mozza-dog Corndog",
        "Mozza-dog Corndog is a delightful fusion of savory and cheesy goodness, featuring a juicy hotdog and a generous amount of stretchy mozzarella cheese, all coated in a crispy cornbread batter and deep-fried to golden perfection. This irresistible snack offers a delightful contrast of textures and flavors, with the savory hotdog, gooey mozzarella, and crispy cornbread creating a symphony of deliciousness in every bite. Indulge in this ultimate comfort food that's sure to satisfy your cravings!",
        "DAY 20",
        R.drawable.recipe20,
        "<iframe src=\"https://www.tiktok.com/embed/v2/7059277928638516507\" width=\"800\" height=\"750\" style=\"max-width:100%;\" allowfullscreen></iframe>"
    )
    recipeList.add(recipe)

    recipe = OverviewRecipe(
        "Korean Marinated Eggs",
        "Korean Marinated Eggs, also known as Mayak Gyeran, are a flavorful and addictive side dish that's perfect for adding a savory touch to your meals. These soft-boiled eggs are marinated in a savory and slightly sweet soy sauce-based mixture, infusing them with a burst of umami flavor. Their irresistible taste and texture have earned them the nickname \"Mayak\" (drug) eggs, as they're so addictive you won't be able to stop at just one! Enjoy them as a side dish with rice, noodles, or as a topping for your favorite Korean dishes.",
        "DAY 21",
        R.drawable.recipe21,
        "<iframe src=\"https://www.tiktok.com/embed/v2/7086371545047764251\" width=\"800\" height=\"750\" style=\"max-width:100%;\" allowfullscreen></iframe>"
    )
    recipeList.add(recipe)

    recipe = OverviewRecipe(
        "Churros",
        "A delightful treat that's easier to make at home than you might think. These crispy, golden-brown pastries are made from a simple dough that's piped into hot oil and fried to perfection.",
        "DAY 22",
        R.drawable.recipe22,
        "<iframe src=\"https://www.tiktok.com/embed/v2/7253441850655116549\" width=\"800\" height=\"750\" style=\"max-width:100%;\" allowfullscreen></iframe>"
    )
    recipeList.add(recipe)

    recipe = OverviewRecipe(
        "Cheesy Potato Croquette",
        "Cheesy Potato Croquettes are irresistible bites of comfort food, featuring a creamy mashed potato center infused with melted cheese and savory seasonings. These golden-brown delights are coated in a crispy breadcrumb crust and deep-fried to perfection, creating a satisfying crunch with every bite. Indulge in the warm, cheesy goodness of these croquettes for a truly satisfying snack or side dish.",
        "DAY 23",
        R.drawable.recipe23,
        "<iframe src=\"https://www.tiktok.com/embed/v2/7139849725297069338\" width=\"800\" height=\"750\" style=\"max-width:100%;\" allowfullscreen></iframe>"
    )
    recipeList.add(recipe)

    recipe = OverviewRecipe(
        "Baked Tahong",
        "Baked Tahong is a flavorful and satisfying Filipino dish featuring fresh mussels baked with a savory and aromatic garlic-butter sauce. The mussels are typically topped with cheese and breadcrumbs for a delightful textural contrast. This dish is often enjoyed as an appetizer or pulutan (food paired with alcoholic beverages) and is sure to be a crowd-pleaser.",
        "DAY 24",
        R.drawable.recipe24,
        "<iframe src=\"https://www.tiktok.com/embed/v2/7379090631005572358\" width=\"800\" height=\"750\" style=\"max-width:100%;\" allowfullscreen></iframe>"
    )
    recipeList.add(recipe)

    recipe = OverviewRecipe(
        "Beef Enoki Rolls",
        "A savory and flavorful appetizer or snack featuring thin slices of beef wrapped around bundles of enoki mushrooms. These delightful rolls are typically marinated in a savory sauce, then pan-fried or grilled to perfection. The combination of tender beef, delicate enoki mushrooms, and flavorful marinade creates a harmonious blend of textures and tastes. Enjoy these Beef Enoki Rolls as an appetizer, party snack, or a satisfying addition to your meal.",
        "DAY 25",
        R.drawable.recipe25,
        "<iframe src=\"https://www.tiktok.com/embed/v2/7407658044957412629\" width=\"800\" height=\"750\" style=\"max-width:100%;\" allowfullscreen></iframe>"
    )
    recipeList.add(recipe)

    recipe = OverviewRecipe(
        "Overnight Oats",
        "Overnight Oats are a healthy and convenient breakfast option that's perfect for busy mornings. This simple recipe involves soaking rolled oats in milk or yogurt overnight, allowing them to soften and absorb the flavors. In the morning, you'll have a creamy and delicious breakfast that's ready to enjoy! Customize your overnight oats with your favorite fruits, nuts, seeds, and sweeteners for a personalized and nutritious start to your day.",
        "DAY 26",
        R.drawable.recipe26,
        "<iframe src=\"https://www.tiktok.com/embed/v2/7201851570047307035\" width=\"800\" height=\"750\" style=\"max-width:100%;\" allowfullscreen></iframe>"
    )
    recipeList.add(recipe)

    recipe = OverviewRecipe(
        "Pechay Baguio Rolls",
        "Pechay Baguio Rolls are a delightful and healthy Filipino appetizer or snack featuring fresh pechay leaves wrapped around a savory filling. These rolls are typically filled with a mixture of ground meat, vegetables, and aromatic spices, creating a flavorful and satisfying bite. They are often steamed or lightly pan-fried, preserving the natural sweetness and crunch of the pechay.",
        "DAY 27",
        R.drawable.recipe27,
        "<iframe src=\"https://www.tiktok.com/embed/v2/7378268243280039173\" width=\"800\" height=\"750\" style=\"max-width:100%;\" allowfullscreen></iframe>"
    )
    recipeList.add(recipe)

    recipe = OverviewRecipe(
        "Oreo Mug Cake",
        "Oreo Mug Cake is a quick and easy dessert that satisfies your sweet cravings in minutes. This single-serving treat is made by combining crushed Oreos, a few basic ingredients, and microwaving it to perfection. The result is a warm, gooey, and chocolatey cake with chunks of Oreo cookies throughout.",
        "DAY 28",
        R.drawable.recipe28,
        "<iframe src=\"https://www.tiktok.com/embed/v2/7194213719981755650\" width=\"800\" height=\"750\" style=\"max-width:100%;\" allowfullscreen></iframe>"
    )
    recipeList.add(recipe)

    recipe = OverviewRecipe(
        "Tuna Pie in Lumpia Wrapper",
        "A savory and satisfying snack or appetizer featuring a flavorful tuna filling encased in a crispy lumpia wrapper. This creative twist on traditional tuna pie offers a delightful combination of textures and flavors, with the flaky lumpia wrapper perfectly complementing the savory tuna filling.",
        "DAY 29",
        R.drawable.recipe29,
        "<iframe src=\"https://www.tiktok.com/embed/v2/7091204082861346074\" width=\"800\" height=\"750\" style=\"max-width:100%;\" allowfullscreen></iframe>"
    )
    recipeList.add(recipe)

    recipe = OverviewRecipe(
        "Mango Sticky Rice",
        "A classic Thai dessert that's both sweet and satisfying. This beloved treat features perfectly cooked glutinous rice, drizzled with a rich coconut milk sauce, and paired with slices of ripe, juicy mango. The combination of creamy, sweet, and slightly salty flavors creates a harmonious balance that's sure to delight your taste buds.",
        "DAY 30",
        R.drawable.recipe30,
        "<iframe src=\"https://www.tiktok.com/embed/v2/7259715246422560005\" width=\"800\" height=\"750\" style=\"max-width:100%;\" allowfullscreen></iframe>"
    )
    recipeList.add(recipe)

}
}