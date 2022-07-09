package com.winnie.twitter_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.winnie.twitter_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweets()
    }

    fun displayTweets(){
        var tweet = Twitter("","Winnie Mwangi","#winnie_mwas","Life’s challenges are not supposed to paralyze you, they’re supposed to help you discover who you are.")
        var tweet1 = Twitter("","Damaris Wambui","#damaris_wambo","I’ve got a theory that if you give 100 percent all the time, somehow things will work out in the end.")
        var tweet2 = Twitter("","Robin Jaelhard","#robin_jaelhard","You are the one that possesses the keys to your being. You carry the passport to your own happiness.")
        var tweet3 = Twitter("","Sam Wathigo","#sam_wathigo","Though no one can go back and make a brand new start, anyone can start from now and make a brand new ending.")
        var tweet4 = Twitter("","Joan Wanji","#joan_shee","Once we believe in ourselves, we can risk curiosity, wonder, spontaneous delight, or any experiences that reveals the human spirit.")
        var tweet5 = Twitter("","Winnie Mwangi","#winnie_mwas","Accept responsibility for your life. Know that it is you who will get you where you want to go, no one else.")

        var tweetlist = listOf(tweet,tweet1,tweet2,tweet3,tweet4,tweet5)

        var tweetsAdapter = TweetRvAdapter(tweetlist)
        binding.rvTweets.layoutManager = LinearLayoutManager(this)
        binding.rvTweets.adapter = tweetsAdapter
    }
}