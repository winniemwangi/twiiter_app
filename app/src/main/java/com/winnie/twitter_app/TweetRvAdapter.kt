package com.winnie.twitter_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweetRvAdapter(var tweetList:List<Twitter>): RecyclerView.Adapter<TweetsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetsViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.tweets_list_item, parent, false)
        return TweetsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TweetsViewHolder, position: Int) {
        var currentTweet = tweetList.get(position)
        holder.tvDisplay.text = currentTweet.display
        holder.tvHandle.text = currentTweet.handle
        holder.tvtweet.text = currentTweet.tweet

    }

    override fun getItemCount(): Int {
        return tweetList.size
    }
}

class TweetsViewHolder(itemView: View):
    RecyclerView.ViewHolder(itemView){
    var tvDisplay = itemView.findViewById<TextView>(R.id.tvDisplay)
    var tvHandle = itemView.findViewById<TextView>(R.id.tvHandle)
    var tvtweet = itemView.findViewById<TextView>(R.id.tvtweet)
    var imgImage1 = itemView.findViewById<ImageView>(R.id.imgImage1)
    var imgComment = itemView.findViewById<ImageView>(R.id.imgComment)
    var imgFavorite = itemView.findViewById<ImageView>(R.id.imgFavorite)
    var imgRetweet = itemView.findViewById<ImageView>(R.id.imgRetweet)
    var imgShare = itemView.findViewById<ImageView>(R.id.imgShare)


}