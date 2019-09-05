package com.example.learnmiwok

import android.content.Context
import android.content.Intent
import android.graphics.drawable.Drawable
import android.media.AudioManager
import android.media.Image
import android.media.SoundPool
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class WordAdapter (val context: Context, private val words : ArrayList<Word>,private val colorResourceID : Int) : RecyclerView.Adapter<WordAdapter.ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val v = LayoutInflater.from(parent?.context).inflate(R.layout.list_item,parent,false)
            return ViewHolder(v)
        }

        override fun getItemCount(): Int {
            return words.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {

            val color = ContextCompat.getColor(context, colorResourceID)
            holder?.linearLayout.setBackgroundColor(color)

            val word = words[position]

            var soundPool : SoundPool = SoundPool(2, AudioManager.STREAM_MUSIC,0)
            var sound = soundPool.load(context,word.getmAudioResourceId(),1)


            holder?.miwokTextView.text = word.getMiwokTranslation()
            holder?.defaultTextView.text = word.getDefaultTranslation()
            if(word.getImageResourceId()!=0) {
                holder?.wordImage.setImageResource(word.getImageResourceId())
                holder?.wordImage.visibility = View.VISIBLE
            }
            else
                holder?.wordImage.visibility = View.GONE

            holder.playButton.setOnClickListener {
                soundPool.play(sound, 1.0f, 1.0f, 0, 0, 1f)
            }

        }

        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
            val miwokTextView = itemView.findViewById(R.id.miwok_text_view) as TextView
            val defaultTextView = itemView.findViewById(R.id.default_text_view) as TextView
            val wordImage = itemView.findViewById(R.id.wordImage) as ImageView
            val playButton = itemView.findViewById(R.id.playbutton) as ImageView
            val linearLayout = itemView.findViewById(R.id.text_container) as LinearLayout
        }
    }