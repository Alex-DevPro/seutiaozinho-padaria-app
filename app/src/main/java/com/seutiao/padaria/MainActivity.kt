EOF > MainActivity.kt
package com.seutiao.padaria

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Suponha que este é o layout da tela principal

        // Exemplo: Botão para ir para Pedidos
        val btnPedidos: Button = findViewById(R.id.btnPedidos) // ID de exemplo
        btnPedidos.setOnClickListener {
            // Lógica para iniciar PedidoActivity
        }

        // Exemplo: Botão para ir para Caixa
        val btnCaixa: Button = findViewById(R.id.btnCaixa) // ID de exemplo
        btnCaixa.setOnClickListener {
            // Lógica para iniciar CaixaActivity
        }
    }
}
EOF