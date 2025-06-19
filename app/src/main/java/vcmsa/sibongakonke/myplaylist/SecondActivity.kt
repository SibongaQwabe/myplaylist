package vcmsa.sibongakonke.myplaylist

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        } //declare
        val songA = intent.getStringExtra("mamas gun")
        val artistA = intent.getStringExtra("erakah badu")
        val rateA = intent.getStringExtra("4")
        val commentA = intent.getStringExtra("good reggae")

        val songB = intent.getStringExtra("paper trails")
        val artistB = intent.getStringExtra("joey")
        val rateB = intent.getStringExtra("3")
        val commentB = intent.getStringExtra("great")

        val songC = intent.getStringExtra("fear")
        val artistC = intent.getStringExtra("k.dot")
        val rateC = intent.getStringExtra("2")
        val commentC = intent.getStringExtra("good rap")

        val songD = intent.getStringExtra("Lithuim")
        val artistD = intent.getStringExtra("Nirvana")
        val rateD = intent.getStringExtra("3")
        val commentD = intent.getStringExtra("good rocknroll")

        //declare the text views
        val tvSongA = findViewById<TextView>(R.id.tvSongA)
        val tvSongB = findViewById<TextView>(R.id.tvSongB)
        val tvSongC = findViewById<TextView>(R.id.tvSongC)
        val tvSongD = findViewById<TextView>(R.id.tvSongD)


// Display in TextViews


        tvSongA.text = "SongA: $songA\nArtist: $artistA\nRating: $rateA\nComment: $commentA"
        tvSongB.text = "SongB: $songB\nArtist: $artistB\nRating: $rateB\nComment: $commentB"
        tvSongC.text = "SongC: $songC\nArtist: $artistC\nRating: $rateC\nComment: $commentC"
        tvSongD.text = "SongD: $songD\nArtist: $artistD\nRating: $rateD\nComment: $commentD"

    }    }