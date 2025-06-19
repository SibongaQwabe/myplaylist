package vcmsa.sibongakonke.myplaylist

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        } // declare everything
        val edtSong = findViewById<EditText>(R.id.edtSong)
            val edtArtist = findViewById<EditText>(R.id.edtArtist)
            val edtRate = findViewById<EditText>(R.id.edtRate)
            val edtComment = findViewById<EditText>(R.id.edtComment)
            val btnAddtoplaylist = findViewById<Button>(R.id.btnAddtoplaylist)


            btnAddtoplaylist.setOnClickListener() {
                val songA = edtSong.text.toString()
                val artistA = edtArtist.text.toString()
                val RateA = edtRate.text.toString()
                val CommentA = edtComment.text.toString()
                val songB = edtSong.text.toString()
                val artistB = edtArtist.text.toString()
                val RateB = edtRate.text.toString()
                val CommentB = edtComment.text.toString()
                val songC = edtSong.text.toString()
                val artistC = edtArtist.text.toString()
                val RateC = edtRate.text.toString()
                val CommentC = edtComment.text.toString()
                val songD = edtSong.text.toString()
                val artistD = edtArtist.text.toString()
                val RateD = edtRate.text.toString()
                val CommentD = edtComment.text.toString()

             val intent = Intent(this, SecondActivity::class.java)

        intent.putExtra("songA", "Mamas Gun")
        intent.putExtra("artistA", "Erykah Badu")
        intent.putExtra("rateA", "4")
        intent.putExtra("commentA", "Good Reggae")

        intent.putExtra("songB", "Paper Trails")
        intent.putExtra("artistB", "Joey Badass")
        intent.putExtra("rateB", "3")
        intent.putExtra("commentB", "Great")

        intent.putExtra("songC", "Fear")
        intent.putExtra("artistC", "Kendrick Lamar")
        intent.putExtra("rateC", "2")
        intent.putExtra("commentC", "Good Rap")

        intent.putExtra("songD", "Lithium")
        intent.putExtra("artistD", "Nirvana")
        intent.putExtra("rateD", "3")
        intent.putExtra("commentD", "Good Rock n Roll")

        startActivity(intent)


    }
    }
}