package com.example.helloword;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class LoginActivity extends Activity {
	Button btnLogin;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_login);
		setContentView(R.layout.login);
		
		//ע���¼��ť�ؼ�
		btnLogin=(Button) this.findViewById(R.id.btnlogin);
		//������¼��ť�ؼ�
		btnLogin.setOnClickListener(new View.OnClickListener(){
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				//�����¼�����
				
				//��Ϣ��������˾
				Toast.makeText(LoginActivity.this, "��ӭ����", 
					Toast.LENGTH_SHORT).show();
				
				//Activity֮����л�
				Intent inten =new Intent(LoginActivity.this,MainActivity.class);
				startActivity(inten);

			}
		});
	}
}

