EOF > PedidoActivity.kt
package com.seutiao.padaria

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PedidoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedido) // Layout da tela de pedidos

        val productNameEditText: EditText = findViewById(R.id.productNameEditText)
        val quantityEditText: EditText = findViewById(R.id.quantityEditText)
        val priceEditText: EditText = findViewById(R.id.priceEditText)
        val addOrderButton: Button = findViewById(R.id.addOrderButton)

        addOrderButton.setOnClickListener {
            val productName = productNameEditText.text.toString()
            val quantity = quantityEditText.text.toString().toIntOrNull()
            val price = priceEditText.text.toString().toDoubleOrNull()

            if (productName.isNotEmpty() && quantity != null && price != null) {
                val total = quantity * price
                Toast.makeText(this, "Pedido: \$quantity x \$productName (R\$ %.2f)".format(total), Toast.LENGTH_LONG).show()
                // Lógica real aqui para adicionar pedido ao Firebase/banco de dados
            } else {
                Toast.makeText(this, "Preencha todos os campos corretamente.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
EOF