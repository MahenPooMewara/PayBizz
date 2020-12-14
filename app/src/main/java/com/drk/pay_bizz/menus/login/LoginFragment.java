package com.drk.pay_bizz.menus.login;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.drk.pay_bizz.R;
import com.drk.pay_bizz.util.PayBizzAppAPI;
import com.google.android.material.textfield.TextInputEditText;

/**
 * Created by Mahendra Mewara.
 */
public class LoginFragment extends Fragment implements
        View.OnClickListener{


    TextInputEditText user_id ;

    TextInputEditText password_id ;

    TextInputEditText caption_id ;

    AppCompatTextView caption;

    String caption_str;

    /**
     * onCreateView of LoginFragment
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.login_main, container, false);
        setRegisteredId(root);
        return root;
    }


    /**
     * setRegisteredId of LoginFragment
     * @param root
     */
    private void setRegisteredId(View root) {

            user_id = (TextInputEditText) root.findViewById(R.id.user_id);

            password_id = (TextInputEditText) root.findViewById(R.id.password_id);

            caption = (AppCompatTextView) root.findViewById(R.id.caption);

            setCaptionView();

            caption_id = (TextInputEditText) root.findViewById(R.id.caption_id);

            ImageView caption_img = (ImageView) root.findViewById(R.id.caption_img) ;
            caption_img.setOnClickListener(this);

            Button button_login = (Button) root.findViewById(R.id.button_login);
            button_login.setOnClickListener(this);

            Button button_forget_password = (Button) root.findViewById(R.id.button_forget_password);
            button_forget_password.setOnClickListener(this);

            Button button_register = (Button) root.findViewById(R.id.button_register);
            button_register.setOnClickListener(this);
        }

    /**
     * setCaptionView of LoginFragment
     */
    private void setCaptionView() {
            caption_str = PayBizzAppAPI.randomString(8);
            caption.setText(caption_str);
        }

    /**
     * onClick of LoginFragment
     * @param v
     */
    @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_register:
                    Navigation.findNavController(getView()).navigate(R.id.register);
                    break;

                case R.id.button_forget_password:
                    Navigation.findNavController(getView()).navigate(R.id.forget_password);
                    break;

                case R.id.button_login:
                    if(user_id.getText().toString().trim().length()==0){
                        user_id.setError("user_id is not entered");
                        user_id.requestFocus();
                    }else if(user_id.getText().toString().trim().length()<=9){
                        user_id.setError("please give valid 10 digit user_id");
                        user_id.requestFocus();
                    }else if(password_id.getText().toString().trim().length()==0){
                        password_id.setError("Password is not entered");
                        password_id.requestFocus();
                    }else if(password_id.getText().toString().trim().length()<=7){
                        password_id.setError("please give valid 8 digit Password");
                        password_id.requestFocus();
                    }else if(caption_id.getText().toString().trim().length()==0){
                        caption_id.setError("caption is not entered");
                        caption_id.requestFocus();
                    }else if(caption_id.getText().toString().trim().length()<=7){
                        caption_id.setError("please give valid 8 digit caption");
                        caption_id.requestFocus();
                    }else if(!(caption_id.getText().toString().equals(caption_str))){
                        caption_id.setError("please give valid caption");
                        caption_id.requestFocus();
                    }else {
                        Navigation.findNavController(getView()).navigate(R.id.nav_home);
                    }
                    break;

                case R.id.caption_img: setCaptionView(); break;
                default: break;
            }
        }
}