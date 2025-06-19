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
ass SecondActivity : AppCompatActivity() {
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

Description
This app allows users to view a pre-filled playlist of songs. The app consists of two activities:

MainActivity: Simulates collecting song information (currently hardcoded).

SecondActivity: Receives song data from MainActivity and displays it (you need to ensure SecondActivity is implemented).

The app demonstrates:

Basic UI interaction in Android

Passing data between activities using Intent

Use of EditText, Button, and Intent.putExtra()

Technologies Used
Kotlin

Android SDK

Android Studio

XML Layouts

MainActivity Code Breakdown
UI Elements:

EditText fields: Song, Artist, Rating, Comment

Button: Add to Playlist

Functionality:

On clicking the Add to Playlist button, an Intent is created to start SecondActivity.

Four song entries are added using intent.putExtra() with hardcoded data.

The entered values from EditText are not currently used — can be updated to support user input in the future.
 To Do
 Use actual user input from EditText instead of hardcoded song values.

 Implement SecondActivity to retrieve and display the passed data.

 Add data validation for user inputs.


