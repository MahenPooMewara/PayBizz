package com.drk.pay_bizz.menus.login;

import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.drk.pay_bizz.util.ArrayListConstants;
import com.drk.pay_bizz.GlobalData;
import com.drk.pay_bizz.R;
import com.drk.pay_bizz.listener.SmsListner;
import com.drk.pay_bizz.menus.services.SmsReceiver;
import com.drk.pay_bizz.util.ValidationAPI;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import static android.content.Context.INPUT_METHOD_SERVICE;

/**
 * Created by Mahendra Mewara.
 */
public class ForgetPasswordFragment extends Fragment implements
        View.OnClickListener {
    String otp_generated,contactNo,id1;
    GlobalData gd = new GlobalData();
    private Button verify_otp;
    TextInputEditText otp_id;
    TextInputEditText user_id;
    AppCompatTextView otp;
    private TextInputLayout otp_il;
    private TextInputLayout new_password_il;
    private TextInputEditText new_password_id;
    private TextInputLayout confirm_password_il;
    private TextInputEditText confirm_password_id;
    private Button search_user;
    private Button resend_otp;
    private Button button_confirm;

    /**
     * onCreateView of ForgetPasswordFragment
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fp_main, container, false);

        setRegisteredId(root);

        //callSMSReterive();
        return root;
    }

    /**
     * callSMSReterive of ForgetPasswordFragment
     */
    private void callSMSReterive() {
        SmsRetrieverClient client = SmsRetriever.getClient(this.getActivity());
        Task<Void> task = client.startSmsRetriever();
        task.addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                // Android will provide message once receive. Start your broadcast receiver.
                IntentFilter filter = new IntentFilter();
                filter.addAction(SmsRetriever.SMS_RETRIEVED_ACTION);
                getActivity().registerReceiver(new SmsReceiver(), filter);
            }
        });
        task.addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                // Failed to start retriever, inspect Exception for more details
            }
        });
    }

    /**
     * setRegisteredId of ForgetPasswordFragment
     * @param root
     */
    private void setRegisteredId(View root) {

        user_id = (TextInputEditText) root.findViewById(R.id.user_id) ;

        search_user = (Button) root.findViewById(R.id.search_user);
        search_user.setOnClickListener(this);

        otp = (AppCompatTextView) root.findViewById(R.id.otp) ;
        otp_il = (TextInputLayout) root.findViewById(R.id.otp_il) ;
        otp_id = (TextInputEditText) root.findViewById(R.id.otp_id);

        verify_otp = (Button) root.findViewById(R.id.verify_otp);
        verify_otp.setOnClickListener(this);

        resend_otp = (Button) root.findViewById(R.id.resend_otp);
        resend_otp.setOnClickListener(this);

        new_password_il = (TextInputLayout) root.findViewById(R.id.new_password_il);
        new_password_id = (TextInputEditText) root.findViewById(R.id.new_password_id) ;

        confirm_password_il = (TextInputLayout) root.findViewById(R.id.confirm_password_il) ;
        confirm_password_id = (TextInputEditText) root.findViewById(R.id.confirm_password_id) ;

        button_confirm = (Button) root.findViewById(R.id.button_confirm);
        button_confirm.setOnClickListener(this);
        //callSMSBinder();
    }

    /**
     * callSMSBinder of ForgetPasswordFragment
     */
    private void callSMSBinder() {
        /*This is important because this will be called every time you receive any sms */
        SmsReceiver.bindListener(new SmsListner() {
            @Override
            public void messageReceived(String messageText) {
                otp_id.setText(messageText);
            }
        });
    }

    /**
     * onClick of ForgetPasswordFragment
     * @param v
     */
    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.search_user:
                if(user_id.getText().toString().trim().length()==0){
                    user_id.setError("user_id is not entered");
                    user_id.requestFocus();
                }else if(user_id.getText().toString().trim().length()<=9){
                    user_id.setError("please give valid 10 digit user_id");
                    user_id.requestFocus();
                }else{
                    setViewOFOTP(View.VISIBLE);
                    search_user.setVisibility(View.GONE);
                }
                break;
            case R.id.button_confirm:
                if(user_id.getText().toString().trim().length()==0){
                    user_id.setError("user_id is not entered");
                    user_id.requestFocus();
                }else if(user_id.getText().toString().trim().length()<=9){
                    user_id.setError("please give valid 10 digit user_id");
                    user_id.requestFocus();
                }else if(new_password_id.getText().toString().trim().length()==0){
                    new_password_id.setError("new password is not entered");
                    new_password_id.requestFocus();
                }else if(new_password_id.getText().toString().trim().length()<=7){
                    new_password_id.setError("please give valid 8 digit New Password");
                    new_password_id.requestFocus();
                }else if(confirm_password_id.getText().toString().trim().length()==0){
                    confirm_password_id.setError("Confirm Password is not entered");
                    confirm_password_id.requestFocus();
                }else if(confirm_password_id.getText().toString().trim().length()<=7){
                    confirm_password_id.setError("please give valid 8 digit Confirm Password");
                    confirm_password_id.requestFocus();
                }else if(!(confirm_password_id.getText().toString().equalsIgnoreCase(
                        new_password_id.getText().toString()))){
                    new_password_id.setError("please give new password and confirm password " +
                            "should be equal");
                    new_password_id.requestFocus();
                    new_password_id.setText(ArrayListConstants.EMPTY_STR);
                    confirm_password_id.setText(ArrayListConstants.EMPTY_STR);
                }else if(!(ValidationAPI.isValidPassword(confirm_password_id.getText().toString()))){
                    new_password_id.setError("please give valid password with one digit, " +
                            "lowercase char, uppercase char and punctuation");
                    new_password_id.requestFocus();
                    new_password_id.setText(ArrayListConstants.EMPTY_STR);
                    confirm_password_id.setText(ArrayListConstants.EMPTY_STR);
                }else{
                    /// Update Password API is call here
                    Navigation.findNavController(getView()).navigate(R.id.login);
                }

                break;
            case R.id.resend_otp:
                if(user_id.getText().toString().trim().length()==0){
                    user_id.setError("user_id is not entered");
                    user_id.requestFocus();
                }else if(user_id.getText().toString().trim().length()<=9){
                    user_id.setError("please give valid 10 digit user_id");
                    user_id.requestFocus();
                }else{
                    otp_id.setText(ArrayListConstants.EMPTY_STR);
                }
                break;
            case R.id.verify_otp:
                if(user_id.getText().toString().trim().length()==0){
                    user_id.setError("user_id is not entered");
                    user_id.requestFocus();
                }else if(user_id.getText().toString().trim().length()<=9){
                    user_id.setError("please give valid 10 digit user_id");
                    user_id.requestFocus();
                }else if(otp_id.getText().toString().trim().length()==0){
                    otp_id.setError("OTP is not entered");
                    otp_id.requestFocus();
                }else if(otp_id.getText().toString().trim().length()<=5){
                    otp_id.setError("please give valid 6 digit otp");
                    otp_id.requestFocus();
                }else {
                    setViewOFOTP(View.GONE);
                    //getAutoOTPFromMSg();
                    new_password_il.setVisibility(View.VISIBLE);
                    confirm_password_il.setVisibility(View.VISIBLE);
                    button_confirm.setVisibility(View.VISIBLE);
                }
                break;

            default: break;
        }

    }

    /**
     * getAutoOTPFromMSg of ForgetPasswordFragment
     */
    private void getAutoOTPFromMSg() {
        try
        {
            InputMethodManager imm=
                    (InputMethodManager)getActivity().getSystemService(INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(),0);
        }
        catch(Exception e)
        {e.printStackTrace();}
        if (otp_id.getText().toString().equals(otp_generated))
        {
            Toast.makeText(this.getActivity(), "OTP Verified " +
                    "Successfully !", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * setViewOFOTP of ForgetPasswordFragment
     * @param visiblity
     */
    private void setViewOFOTP(int visiblity) {
        otp.setVisibility(visiblity);
        otp_il.setVisibility(visiblity);
        verify_otp.setVisibility(visiblity);
        resend_otp.setVisibility(visiblity);

    }
}