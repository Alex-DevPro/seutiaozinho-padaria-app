EOF > LoginActivity.kt
package com.seutiao.padaria

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login) // Layout da tela de login

        val usernameEditText: EditText = findViewById(R.id.usernameEditText)
        val passwordEditText: EditText = findViewById(R.id.passwordEditText)
        val loginButton: Button = findViewById(R.id.loginButton)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Simples autenticação hardcoded para demonstração
            if (username == "admin" && password == "123") {
                Toast.makeText(this, "Login bem-sucedido!", Toast.LENGTH_SHORT).show()
                // Aqui, em um app real, você iniciaria a MainActivity
            } else {
                Toast.makeText(this, "Usuário ou senha incorretos.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
EOF
