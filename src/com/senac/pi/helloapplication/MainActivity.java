package com.senac.pi.helloapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	private EditText nomeEditText;
	private TextView olaTextView;
	private String msg;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		this.nomeEditText = (EditText) findViewById(R.id.nomeEditText);
		this.olaTextView = (TextView) findViewById(R.id.olaTextView);
		this.msg = getResources().getString(R.string.ola);
	}
	
	/*
	public void surpreenderUsusario(View v) {
		Editable texto = this.nomeEditText.getText();
		String saudacao = msg + " " + texto.toString();
		this.olaTextView.setText(saudacao);
		
	}
	*/
	
	public void surpreenderUsusario(View v) {
		Intent intent = new Intent(SaudacaoActivity.ACAO_EXIBIR_SAUDACAO);
		
		intent.addCategory(SaudacaoActivity.CATEGORIA_SAUDACAO);
		
		String texto = nomeEditText.getText().toString();
		intent.putExtra(SaudacaoActivity.EXTRA_NOME_USUARIO, texto);
		
		startActivity(intent);
		
	}

	
}
