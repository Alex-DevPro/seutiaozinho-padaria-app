EOF > CaixaActivity.kt
package com.seutiao.padaria

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CaixaActivity : AppCompatActivity() {
    private var caixaAtual = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_caixa) // Layout da tela de caixa

        val valorVendaEditText: EditText = findViewById(R.id.valorVendaEditText)
        val calcularTrocoButton: Button = findViewById(R.id.calcularTrocoButton)
        val valorPagoEditText: EditText = findViewById(R.id.valorPagoEditText)
        val trocoTextView: TextView = findViewById(R.id.trocoTextView)
        val registrarEntradaButton: Button = findViewById(R.id.registrarEntradaButton)
        val caixaAtualTextView: TextView = findViewById(R.id.caixaAtualTextView)

        registrarEntradaButton.setOnClickListener {
            val valor = valorVendaEditText.text.toString().toDoubleOrNull()
            if (valor != null && valor > 0) {
                caixaAtual += valor
                caixaAtualTextView.text = "Caixa Atual: R\$ %.2f".format(caixaAtual)
                Toast.makeText(this, "Entrada de R\$ %.2f registrada.".format(valor), Toast.LENGTH_SHORT).show()
                valorVendaEditText.setText("") // Limpa o campo
            } else {
                Toast.makeText(this, "Insira um valor válido para a venda.", Toast.LENGTH_SHORT).show()
            }
        }

        calcularTrocoButton.setOnClickListener {
            val valorVenda = valorVendaEditText.text.toString().toDoubleOrNull()
            val valorPago = valorPagoEditText.text.toString().toDoubleOrNull()

            if (valorVenda != null && valorPago != null && valorPago >= valorVenda) {
                val troco = valorPago - valorVenda
                trocoTextView.text = "Troco: R\$ %.2f".format(troco)
            } else {
                trocoTextView.text = "Troco: R\$ 0.00"
                Toast.makeText(this, "Valores inválidos ou pago menor que a venda.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
EOF