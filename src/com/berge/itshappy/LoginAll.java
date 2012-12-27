package com.berge.itshappy;

import java.util.ArrayList;
import java.util.List;

import com.facebook.model.GraphUser;
import com.facebook.widget.LoginButton;
/**
import com.facebook.model.GraphUser;
import com.facebook.widget.LoginButton;
**/
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LoginAll extends Activity {
	private List<String> PERMISSIONS = new ArrayList<String>();
	
	{
		PERMISSIONS.add("publish_actions");
		///PERMISSIONS.add("");
		///PERMISSIONS.add("");
		
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_all);
			
		LoginButton loginFacebookButton = (LoginButton) findViewById(R.id.login_facebook_button);
		//loginFacebookButton.setPublishPermissions(PERMISSIONS);
		loginFacebookButton.setUserInfoChangedCallback(new LoginButton.UserInfoChangedCallback() {
            @Override
            public void onUserInfoFetched(GraphUser user) {
            	ApplicationItsHappy app = ((ApplicationItsHappy)getApplication());
            	app.user = user;
            	if(user != null){
            		startActivity(new Intent(LoginAll.this,MainActivity.class));
            	}
            }
        });  
		
		Button loginItsHappy = (Button)findViewById(R.id.btnLoginItsHappy);
		loginItsHappy.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				startActivity(new Intent(LoginAll.this,MainActivity.class));				
			}
		});
	}

}
