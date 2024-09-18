learnt about UI and how Activity life cycle works,
And increased our basic understanding of different stages of life cycle
and Implemented Toast and snackbar by making following functions:
FOR TOAST, we created showMessage() funciton :
  fun showMessage(msg : String){
        Log.i(TAG, msg)
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

  FOr SNACKBAR, we created showtext() function
    fun showtext(msg: String) {
        Log.i(TAG, msg)
        val rootView = findViewById<TextView>(R.id.text_hello) // You can use a root view instead of TextView
        Snackbar.make(rootView, msg, Snackbar.LENGTH_SHORT).show()
    }
And in UI department , We created an interface with 'Yellow' coloured screen and wiht text " hello world" in centre of application screen.
![WhatsApp Image 2024-09-17 at 17 45 10_456c9af7](https://github.com/user-attachments/assets/749ad6cc-3d98-420d-8064-4d23d60701f1)
![WhatsApp Image 2024-09-17 at 18 21 21_8f2454b7](https://github.com/user-attachments/assets/6eadc1e9-3ce8-488a-90c6-199f186d3d1b)
![WhatsApp Image 2024-09-17 at 18 21 20_85eee997](https://github.com/user-attachments/assets/1b012df4-75db-4f17-8c2c-3f494bbc5130)
