package com.drk.pay_bizz.menus.login;

import android.Manifest;
import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.drk.pay_bizz.util.ArrayListConstants;
import com.drk.pay_bizz.FilePath;
import com.drk.pay_bizz.Pdf;
import com.drk.pay_bizz.PdfAdapter;
import com.drk.pay_bizz.R;
import com.drk.pay_bizz.menus.services.GpsTracker;
import com.drk.pay_bizz.util.ValidationAPI;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import net.gotev.uploadservice.MultipartUploadRequest;
import net.gotev.uploadservice.UploadNotificationConfig;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

/**
 * Created by Mahendra Mewara.
 */
public class RegisterFragment extends Fragment implements
        View.OnClickListener {
    private ArrayAdapter division_adapter;
    private ArrayAdapter district_adapter;
    private TextInputEditText dob_id;

    /**
     * Image Uploading
     **/
    //Declaring views
    private Button buttonChooseImage;
    private Button buttonUploadImage;
    private ImageView imageView;
    private EditText editTextImage;

    //Image request code
    private int PICK_IMAGE_REQUEST = 1;

    //storage permission code
    private static final int STORAGE_PERMISSION_CODE_IMG = 123;

    //Bitmap to get image from gallery
    private Bitmap bitmap;

    //Uri to store the image uri
    private Uri filePathImage;

    //Declaring views
    private Button buttonChoosePDF;
    private Button buttonUploadPDF;

    private EditText editTextPDF;

    public static final String UPLOAD_URL = "http://internetfaqs.net/AndroidPdfUpload/upload.php";
    public static final String PDF_FETCH_URL = "http://internetfaqs.net/AndroidPdfUpload/getPdfs.php";


    //Pdf request code
    private int PICK_PDF_REQUEST = 2;

    //storage permission code
    private static final int STORAGE_PERMISSION_CODE = 124;


    //Uri to store the image uri
    private Uri filePathPDF;

    ImageView imageViewPDF;

    //ListView to show the fetched Pdfs from the server
    ListView listView;

    //button to fetch the intiate the fetching of pdfs.
    Button buttonFetch;

    //Progress bar to check the progress of obtaining pdfs
    ProgressDialog progressDialog;

    //an array to hold the different pdf objects
    ArrayList<Pdf> pdfList = new ArrayList<Pdf>();

    //pdf adapter

    PdfAdapter pdfAdapter;
    private CheckBox checkBoxValid;
    private TextInputLayout ref_id_il;
    private TextInputEditText ref_id;
    private AutoCompleteTextView apply_for_id;
    private TextInputEditText username;
    private TextInputEditText mob_no;
    private TextInputEditText email_id;
    private TextInputEditText adhar_no_id;
    private TextInputEditText pan_no_id;
    private TextInputEditText gst_number_id;
    private TextInputEditText address_id;
    private TextInputEditText street_id;
    private TextInputEditText nearby_id;
    private TextInputEditText city_id;
    private AutoCompleteTextView state_id;
    private AutoCompleteTextView division_id;
    private AutoCompleteTextView district;
    private TextInputEditText pincode_id;
    private TextInputEditText acc_no_id;
    private TextInputEditText holder_name_id;
    private TextInputEditText bank_name_id;
    private TextInputEditText ifsc_code_id;
    private Button button_Submit;
    private int keyDel;
    private String a;
    private TextInputEditText password_id;
    private TextInputEditText confirm_password_id;
    private Button tvLatitude;
    private Button tvLongitude;
    private GpsTracker gpsTracker;
    private View root;

    /**
     * onCreateView of RegisterFragment
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_register, container, false);
        setRegisteredId(root);
        //handleIntent(getActivity().getIntent());

        try {
            if (ContextCompat.checkSelfPermission(this.getActivity(),
                    android.Manifest.permission.ACCESS_FINE_LOCATION) !=
                    PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this.getActivity(), new String[]{
                        android.Manifest.permission.ACCESS_FINE_LOCATION}, 101);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Retrieve the value
        try {
            String value = getArguments().getString("KEY");
            ref_id_il.setVisibility(View.VISIBLE);
            ref_id.setText(value);
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        return root;
    }

    /*protected void onNewIntent(Intent intent) {
        super.getActivity().onNewIntent(intent);
        handleIntent(intent);
    }*/

    /**
     * handleIntent of RegisterFragment
     * @param intent
     */
    private void handleIntent(Intent intent) {
        String appLinkAction = intent.getAction();
        Uri appLinkData = intent.getData();
        if (Intent.ACTION_VIEW.equals(appLinkAction) && appLinkData != null) {
            String referal_id = appLinkData.getLastPathSegment();
            String array1[] = referal_id.split("=");
            for (String temp : array1) {
                System.out.println(temp);
            }
            /*Uri appData = Uri.parse("content://http://testPayBiz.com").buildUpon()
                    .appendPath(recipeId).build();*/
            //showRecipe(appData);
            if (!referal_id.equalsIgnoreCase(ArrayListConstants.EMPTY_STR)) {
                //ref_id_il.setVisibility(View.VISIBLE);
                //ref_id.setText(array1[1]);

            }
        }
    }

    /**
     * setRegisteredId of RegisterFragment
     * @param root
     */
    private void setRegisteredId(View root) {
        ref_id_il = root.findViewById(R.id.ref_id_il);

        ref_id = (TextInputEditText) root.findViewById(R.id.ref_id);

        //Creating the ArrayAdapter instance having the apply for list
        ArrayAdapter apply_for_adapter = new ArrayAdapter(this.getActivity(),
                android.R.layout.simple_spinner_item,
                ArrayListConstants.APPLY_FOR_LIST);
        apply_for_adapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);

        //Setting the ArrayAdapter data on the Spinner
        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        apply_for_id = (AutoCompleteTextView) root.findViewById(R.id.apply_for_id);
        apply_for_id.setThreshold(1);
        apply_for_id.setAdapter(apply_for_adapter);

        username = (TextInputEditText) root.findViewById(R.id.username);

        mob_no = (TextInputEditText) root.findViewById(R.id.mob_no);

        email_id = (TextInputEditText) root.findViewById(R.id.email_id);

        adhar_no_id = (TextInputEditText) root.findViewById(R.id.adhar_no_id);
        adhar_no_id.addTextChangedListener(new TextWatcher() {
            int len;

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                if (len > adhar_no_id.getText().length()) {
                    len--;
                    return;
                }
                len = adhar_no_id.getText().length();

                if (len == 5 || len == 10) {
                    String number = adhar_no_id.getText().toString();
                    String dash = number.charAt(number.length() - 1) == '-' ? "" : "-";
                    number = number.substring(0, (len - 1)) + dash + number.substring((len - 1),
                            number.length());
                    adhar_no_id.setText(number);
                    adhar_no_id.setSelection(number.length());
                }
            }
        });

        pan_no_id = (TextInputEditText) root.findViewById(R.id.pan_no_id);

        dob_id = root.findViewById(R.id.dob_id);
        dob_id.setOnClickListener(this);

        gst_number_id = (TextInputEditText) root.findViewById(R.id.gst_number_id);

        address_id = (TextInputEditText) root.findViewById(R.id.address_id);

        street_id = (TextInputEditText) root.findViewById(R.id.street_id);

        nearby_id = (TextInputEditText) root.findViewById(R.id.nearby_id);

        city_id = (TextInputEditText) root.findViewById(R.id.city_id);

        ArrayAdapter state_ut_adapter = new ArrayAdapter(this.getActivity(),
                android.R.layout.simple_spinner_item,
                ArrayListConstants.STATE_AND_UNION_TERRITORIES_LIST);
        state_ut_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        state_ut_adapter.notifyDataSetChanged();

        //Setting the ArrayAdapter data on the Spinner
        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        state_id = root.findViewById(R.id.state_id);
        state_id.setThreshold(1);
        state_id.setAdapter(state_ut_adapter);
        state_id.setOnItemClickListener(new MyClickListener(state_id));

        division_id = (AutoCompleteTextView) root.findViewById(R.id.division_id);
        //Setting the ArrayAdapter data on the Spinner
        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        division_id.setThreshold(1);
        division_id.setOnItemClickListener(new MyClickListener(division_id));

        district = (AutoCompleteTextView) root.findViewById(R.id.district);
        //Setting the ArrayAdapter data on the Spinner
        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        district.setThreshold(1);

        pincode_id = (TextInputEditText) root.findViewById(R.id.pincode_id);

        acc_no_id = (TextInputEditText) root.findViewById(R.id.acc_no_id);

        holder_name_id = (TextInputEditText) root.findViewById(R.id.holder_name_id);

        bank_name_id = (TextInputEditText) root.findViewById(R.id.bank_name_id);

        ifsc_code_id = (TextInputEditText) root.findViewById(R.id.ifsc_code_id);

        setListOnSelectState(root);

        //Requesting storage permission
        requestStoragePermission();

        //Initializing views
        buttonChooseImage = (Button) root.findViewById(R.id.buttonChooseImage);
        buttonUploadImage = (Button) root.findViewById(R.id.buttonUploadImage);
        imageView = (ImageView) root.findViewById(R.id.imageView);
        editTextImage = (EditText) root.findViewById(R.id.editTextImageName);

        //Setting clicklistener
        buttonChooseImage.setOnClickListener(this);
        buttonUploadImage.setOnClickListener(this);

        //Initializing views
        buttonChoosePDF = (Button) root.findViewById(R.id.buttonChoosePDF);
        buttonUploadPDF = (Button) root.findViewById(R.id.buttonUploadPDF);
        imageViewPDF = (ImageView) root.findViewById(R.id.imageViewPdf);

        editTextPDF = (EditText) root.findViewById(R.id.editTextPDFName);

        //Setting clicklistener
        buttonChoosePDF.setOnClickListener(this);
        buttonUploadPDF.setOnClickListener(this);

        //initializing ListView
        listView = (ListView) root.findViewById(R.id.listView);

        //initializing buttonFetch
        buttonFetch = (Button) root.findViewById(R.id.buttonFetchPdf);
        buttonFetch.setOnClickListener(this);

        //initializing progressDialog
        progressDialog = new ProgressDialog(this.getActivity());

        //setting listView on item click listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Pdf pdf = (Pdf) parent.getItemAtPosition(position);
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(pdf.getUrl()));
                startActivity(intent);

            }
        });

        password_id = (TextInputEditText) root.findViewById(R.id.password_id);
        confirm_password_id = (TextInputEditText) root.findViewById(R.id.confirm_password_id);

        tvLatitude = (Button) root.findViewById(R.id.latitude);
        tvLongitude = (Button) root.findViewById(R.id.longitude);

        checkBoxValid = (CheckBox) root.findViewById(R.id.checkBoxValid);

        button_Submit = (Button) root.findViewById(R.id.button_Submit);
        button_Submit.setOnClickListener(this);

        getLocation(button_Submit);

    }

    /**
     * getLocation of RegisterFragment
     * @param view
     */
    public void getLocation(View view) {
        gpsTracker = new GpsTracker(this.getActivity());
        if (gpsTracker.canGetLocation()) {
            double latitude = gpsTracker.getLatitude();
            double longitude = gpsTracker.getLongitude();
            tvLatitude.setText(String.valueOf(latitude));
            tvLongitude.setText(String.valueOf(longitude));
        } else {
            gpsTracker.showSettingsAlert();
        }
    }

    /**
     * setListOnSelectState of RegisterFragment
     * @param root
     */
    public void setListOnSelectState(View root) {
        division_adapter = new ArrayAdapter(this.getActivity(), android.R.layout.simple_spinner_item,
                getStateBasedDivision(state_id.getText()));
        division_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        division_id.setAdapter(division_adapter);

        TextInputLayout division_til = root.findViewById(R.id.division_il);
        String[] check;
        if (state_id.getText().toString().equals("Goa")) {
            division_til.setVisibility(View.VISIBLE);
            check = getDistrictList(state_id.getText(), division_id.getText().toString());
        } else if (state_id.getText().toString().equals("Jammu and Kashmir")) {
            division_til.setVisibility(View.VISIBLE);
            check = getDistrictList(state_id.getText(), division_id.getText().toString());
        } else {
            division_til.setVisibility(View.GONE);
            check = getDistrictList(state_id.getText(), ArrayListConstants.EMPTY_STR);
        }
        //Creating the ArrayAdapter instance having the district list
        district_adapter = new ArrayAdapter(this.getActivity(), android.R.layout.simple_spinner_item,
                check);
        district_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        district.setAdapter(district_adapter);
    }

    /**
     * getDistrictList of RegisterFragment
     * @param states
     * @param divs
     * @return
     */
    String[] getDistrictList(Editable states, String divs) {
        String[] result;
        switch (states.toString()) {
            case "Andaman and Nicobar Islands":
                result = ArrayListConstants.DL_ANIsland;
                break;
            case "Andhra Pradesh":
                result = ArrayListConstants.DL_Andhra;
                break;
            case "Arunachal Pradesh":
                result = ArrayListConstants.DL_Arunachal;
                break;
            case "Assam":
                result = ArrayListConstants.DL_Assam;
                break;
            case "Bihar":
                result = ArrayListConstants.DL_Bihar;
                break;
            case "Chhattisgarh":
                result = ArrayListConstants.DL_Chhattisgarh;
                break;
            case "Dadra and Nagar Haveli and Daman and Diu":
                result = ArrayListConstants.DL_DNHDD;
                break;
            case "Delhi":
                result = ArrayListConstants.DL_Delhi;
                break;
            case "Goa":
                result = getDivisionBased(divs);
                break;
            case "Gujarat":
                result = ArrayListConstants.DL_Gujarat;
                break;
            case "Haryana":
                result = ArrayListConstants.DL_Haryana;
                break;
            case "Himachal Pradesh":
                result = ArrayListConstants.DL_HP;
                break;
            case "Jammu and Kashmir":
                result = getDivisionBased(divs);
                break;
            case "Jharkhand":
                result = ArrayListConstants.DL_Jharkhand;
                break;
            case "Karnataka":
                result = ArrayListConstants.DL_Karnataka;
                break;
            case "Kerala":
                result = ArrayListConstants.DL_Kerala;
                break;
            case "Madhya Pradesh":
                result = ArrayListConstants.DL_MP;
                break;
            case "Maharashtra":
                result = ArrayListConstants.DL_Maharashtra;
                break;
            case "Manipur":
                result = ArrayListConstants.DL_Manipur;
                break;
            case "Meghalaya":
                result = ArrayListConstants.DL_Meghalaya;
                break;
            case "Mizoram":
                result = ArrayListConstants.DL_Mizoram;
                break;
            case "Nagaland":
                result = ArrayListConstants.DL_Nagaland;
                break;
            case "Odisha":
                result = ArrayListConstants.DL_Odisha;
                break;
            case "Punjab":
                result = ArrayListConstants.DL_Punjab;
                break;
            case "Rajasthan":
                result = ArrayListConstants.DISTRICT_LIST_RAJ;
                break;
            case "Sikkim":
                result = ArrayListConstants.DL_Sikkim;
                break;
            case "Tamil Nadu":
                result = ArrayListConstants.DL_Tamil_Nadu;
                break;
            case "Telangana":
                result = ArrayListConstants.DL_Telangana;
                break;
            case "Tripura":
                result = ArrayListConstants.DL_Tripura;
                break;
            case "Uttar Pradesh":
                result = ArrayListConstants.DL_UP;
                break;
            case "Uttarakhand":
                result = ArrayListConstants.DL_Uttarakhand;
                break;
            case "West Bengal":
                result = ArrayListConstants.DL_WB;
                break;
            default:
                result = ArrayListConstants.DISTRICT_LIST_RAJ;
                break;
        }
        return result;
    }

    /**
     * getDivisionBased of RegisterFragment
     * @param divs
     * @return
     */
    String[] getDivisionBased(String divs) {
        String[] result;
        switch (divs) {
            case "Jammu Division":
                result = ArrayListConstants.DL_JammuDivision;
                break;
            case "Kashmir Division":
                result = ArrayListConstants.DL_KashmirDivision;
                break;
            case "North Goa":
                result = ArrayListConstants.Tehsils_talukas_N_Goa;
                break;
            case "South Goa":
                result = ArrayListConstants.Tehsils_talukas_S_Goa;
                break;
            default:
                result = ArrayListConstants.DL_JammuDivision;
                break;
        }
        return result;
    }

    /**
     * getStateBasedDivision of RegisterFragment
     * @param divs
     * @return
     */
    String[] getStateBasedDivision(Editable divs) {
        String[] result;
        switch (divs.toString()) {
            case "Goa":
                result = ArrayListConstants.DL_Goa;
                break;
            case "Jammu and Kashmir":
                result = ArrayListConstants.Division_JK;
                break;
            default:
                result = ArrayListConstants.DL_Goa;
                break;
        }
        return result;
    }

    /**
     * onClick of RegisterFragment
     * @param v
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.dob_id:
                showDatePicker();
                // open datepicker dialog.
                // set date picker for current date
                // add pickerListener listner to date picker
                //new DatePickerDialog(this.getActivity(), pickerListener, year, month,day);
                break;
            case R.id.buttonChooseImage:
                showFileChooser("image/*", "Select Picture");
                break;

            case R.id.buttonUploadImage:
                //uploadMultipart();
                break;
            case R.id.buttonChoosePDF:
                showFileChooser("application/pdf", "Select PDF");
                break;

            case R.id.buttonUploadPDF:
                // uploadMultipartPDF();
                break;

            case R.id.buttonFetchPdf:
                getPdfs();
                break;

            case R.id.button_Submit:
                if (apply_for_id.getText().toString().trim().length() == 0) {
                    apply_for_id.setError("please select valid apply for");
                    apply_for_id.requestFocus();
                } else if (!ValidationAPI.isValidApplyFor(apply_for_id.getText().toString())) {
                    apply_for_id.setError("please give valid apply for");
                    apply_for_id.requestFocus();
                } else if (username.getText().toString().trim().length() == 0) {
                    username.setError("username is not entered");
                    username.requestFocus();
                } else if (username.getText().toString().trim().length() <= 7) {
                    username.setError("please give valid 8 character username");
                    username.requestFocus();
                } else if (mob_no.getText().toString().trim().length() == 0) {
                    mob_no.setError("mob_no is not entered");
                    mob_no.requestFocus();
                } else if (mob_no.getText().toString().trim().length() <= 9) {
                    mob_no.setError("please give valid 10 digit mob_no");
                    mob_no.requestFocus();
                } else if (email_id.getText().toString().trim().length() == 0) {
                    email_id.setError("email id is not entered");
                    email_id.requestFocus();
                } else if (!ValidationAPI.isValidEmail(email_id.getText().toString())) {
                    email_id.setError("please give valid email id");
                    email_id.requestFocus();
                } else if (adhar_no_id.getText().toString().trim().length() == 0) {
                    adhar_no_id.setError("adhar no is not entered");
                    adhar_no_id.requestFocus();
                } else if (adhar_no_id.getText().toString().trim().length() <= 11) {
                    adhar_no_id.setError("please give valid 12 digit adhar no");
                    adhar_no_id.requestFocus();
                } else if (!ValidationAPI.isValidAadharNumber(adhar_no_id.getText().toString())) {
                    adhar_no_id.setError("please give valid adhar no");
                    adhar_no_id.requestFocus();
                } else if (pan_no_id.getText().toString().trim().length() == 0) {
                    pan_no_id.setError("pan no  is not entered");
                    pan_no_id.requestFocus();
                } else if (pan_no_id.getText().toString().trim().length() <= 9) {
                    pan_no_id.setError("please give valid 10 character alphanumeric pan number");
                    pan_no_id.requestFocus();
                } else if (!ValidationAPI.isValidPanCardNo(pan_no_id.getText().toString())) {
                    pan_no_id.setError("please give valid pan no");
                    pan_no_id.requestFocus();
                } else if (!ValidationAPI.validateJavaDate(dob_id.getText().toString())) {
                    dob_id.setError("please give valid date of birth");
                    dob_id.requestFocus();
                } else if (gst_number_id.getText().toString().trim().length() == 0) {
                    gst_number_id.setError("GST number is not entered");
                    gst_number_id.requestFocus();
                } else if (gst_number_id.getText().toString().trim().length() <= 14) {
                    gst_number_id.setError("please give valid 15 character alphanumeric GST number");
                    gst_number_id.requestFocus();
                } else if (!ValidationAPI.isValidGSTNo(gst_number_id.getText().toString())) {
                    gst_number_id.setError("please give valid GST no");
                    gst_number_id.requestFocus();
                } else if (city_id.getText().toString().trim().length() == 0) {
                    city_id.setError("City is not entered");
                    city_id.requestFocus();
                } else if (state_id.getText().toString().trim().length() == 0) {
                    state_id.setError("please select valid State");
                    state_id.requestFocus();
                } else if (!ValidationAPI.isValidState(state_id.getText().toString())) {
                    state_id.setError("please give valid State");
                    state_id.requestFocus();
                } else if (division_id.getVisibility() == View.VISIBLE &&
                        division_id.getText().toString().trim().length() == 0) {
                    division_id.setError("please select valid division");
                    division_id.requestFocus();
                } else if (!ValidationAPI.isValidDivision(division_id.getText().toString())) {
                    division_id.setError("please give valid Division");
                    division_id.requestFocus();
                } else if (district.getText().toString().trim().length() == 0) {
                    district.setError("please select valid district");
                    district.requestFocus();
                } else if (!ValidationAPI.isValidDistrict(district.getText().toString())) {
                    district.setError("please give valid district");
                    district.requestFocus();
                } else if (pincode_id.getText().toString().trim().length() == 0) {
                    pincode_id.setError("Pin-code is not entered");
                    pincode_id.requestFocus();
                } else if (pincode_id.getText().toString().trim().length() <= 5) {
                    pincode_id.setError("please give valid 6 digits pin-code");
                    pincode_id.requestFocus();
                } else if (acc_no_id.getText().toString().trim().length() == 0) {
                    acc_no_id.setError("Account No. is not entered");
                    acc_no_id.requestFocus();
                } else if (acc_no_id.getText().toString().trim().length() <= 8) {
                    acc_no_id.setError("please give valid 9-18 digits account number");
                    acc_no_id.requestFocus();
                } else if (holder_name_id.getText().toString().trim().length() == 0) {
                    holder_name_id.setError("Account Holder name is not entered");
                    holder_name_id.requestFocus();
                } else if (bank_name_id.getText().toString().trim().length() == 0) {
                    bank_name_id.setError("Bank name is not entered");
                    bank_name_id.requestFocus();
                } else if (ifsc_code_id.getText().toString().trim().length() == 0) {
                    ifsc_code_id.setError("IFSC code is not entered");
                    ifsc_code_id.requestFocus();
                } else if (ifsc_code_id.getText().toString().trim().length() <= 10) {
                    ifsc_code_id.setError("please give valid 11 alphanumeric IFSC code");
                    ifsc_code_id.requestFocus();
                } else if (!ValidationAPI.isValidIFSCode(ifsc_code_id.getText().toString())) {
                    ifsc_code_id.setError("Please give valid IFSC code");
                    ifsc_code_id.requestFocus();
                } else if (password_id.getText().toString().trim().length() == 0) {
                    password_id.setError("Password is not entered");
                    password_id.requestFocus();
                } else if (password_id.getText().toString().trim().length() <= 7) {
                    password_id.setError("please give valid 8 digit Password");
                    password_id.requestFocus();
                } else if (confirm_password_id.getText().toString().trim().length() == 0) {
                    confirm_password_id.setError("Confirm Password is not entered");
                    confirm_password_id.requestFocus();
                } else if (confirm_password_id.getText().toString().trim().length() <= 7) {
                    confirm_password_id.setError("please give valid 8 digit Confirm Password");
                    confirm_password_id.requestFocus();
                } else if (!(confirm_password_id.getText().toString().equalsIgnoreCase(
                        password_id.getText().toString()))) {
                    confirm_password_id.setError("please give password and confirm password " +
                            "should be equal");
                    confirm_password_id.requestFocus();
                    password_id.setText(ArrayListConstants.EMPTY_STR);
                    confirm_password_id.setText(ArrayListConstants.EMPTY_STR);
                } else if (!checkBoxValid.isChecked()) {
                    Toast.makeText(this.getActivity(), "Please check box to further " +
                            "register you in Pay Bizz", Toast.LENGTH_SHORT).show();
                } else {
                    //finish();
                    Navigation.findNavController(getView()).navigate(R.id.login);

                }

                break;

        }
    }

    /**
     * showDatePicker of RegisterFragment
     */
    private void showDatePicker() {
        DatePickerFragment date = new DatePickerFragment();
        /**
         * Set Up Current Date Into dialog
         */
        Calendar calender = Calendar.getInstance();
        Bundle args = new Bundle();
        args.putInt("year", calender.get(Calendar.YEAR));
        args.putInt("month", calender.get(Calendar.MONTH));
        args.putInt("day", calender.get(Calendar.DAY_OF_MONTH));
        date.setArguments(args);
        /**
         * Set Call back to capture selected date
         */
        date.setCallBack(ondate);
        if (getFragmentManager() == null) throw new AssertionError();
        date.show(getFragmentManager(), "Date Picker");
    }

    DatePickerDialog.OnDateSetListener ondate = new DatePickerDialog.OnDateSetListener() {

        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {

            dob_id.setText(String.valueOf(dayOfMonth) + "-" + String.valueOf(monthOfYear + 1)
                    + "-" + String.valueOf(year));
        }
    };


    /**
     * uploadMultipart of RegisterFragment
     * This is the method responsible for image upload
     * We need the full image path and the name for the image in this method
     **/
    public void uploadMultipart() {
        //getting name for the image
        String name = editTextImage.getText().toString().trim();

        //getting the actual path of the image
        String path = getPath(filePathImage);

        //Uploading code
        try {
            String uploadId = UUID.randomUUID().toString();

            //Creating a multi part request
            new MultipartUploadRequest(this.getActivity(), uploadId, ArrayListConstants.UPLOAD_URL)
                    .addFileToUpload(path, "image") //Adding file
                    .addParameter("name", name) //Adding text parameter to the request
                    .setNotificationConfig(new UploadNotificationConfig())
                    .setMaxRetries(2)
                    .startUpload(); //Starting the upload

        } catch (Exception exc) {
            Toast.makeText(this.getActivity(), exc.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * uploadMultipartPDF of RegisterFragment
     * This is the method responsible for pdf upload
     * We need the full pdf path and the name for the pdf in this method
     **/
    public void uploadMultipartPDF() {
        //getting name for the image
        String name = editTextPDF.getText().toString().trim();

        //getting the actual path of the image
        String path = FilePath.getPath(this.getActivity(), filePathPDF);

        if (path == null) {

            Toast.makeText(this.getActivity(), "Please move your pdf file to " +
                    "internal storage and retry", Toast.LENGTH_LONG).show();
        } else {
            //Uploading code
            try {
                String uploadId = UUID.randomUUID().toString();

                //Creating a multi part request
                new MultipartUploadRequest(this.getActivity(), uploadId, UPLOAD_URL)
                        .addFileToUpload(path, "pdf") //Adding file
                        .addParameter("name", name) //Adding text parameter to the request
                        .setNotificationConfig(new UploadNotificationConfig())
                        .setMaxRetries(2)
                        .startUpload(); //Starting the upload

            } catch (Exception exc) {
                Toast.makeText(this.getActivity(), exc.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }

    /**
     * showFileChooser of RegisterFragment
     * method to show file chooser
     * @param setType
     * @param select_type
     */
    void showFileChooser(String setType, String select_type) {
        Intent intent = new Intent();
        intent.setType(setType);//);
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, select_type), PICK_IMAGE_REQUEST);
    }

    /**
     *  onActivityResult of RegisterFragment
     *  handling the image chooser activity result
     * @param requestCode
     * @param resultCode
     * @param data
     */
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PICK_IMAGE_REQUEST && resultCode == getActivity().RESULT_OK && data != null &&
                data.getData() != null) {
            filePathImage = data.getData();
            try {
                bitmap = MediaStore.Images.Media.getBitmap(getActivity().getContentResolver(), filePathImage);
                imageView.setImageBitmap(bitmap);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        else if (requestCode == PICK_PDF_REQUEST && resultCode == getActivity().RESULT_OK && data != null &&
                data.getData() != null) {
            filePathPDF = data.getData();
        }
    }

    /**
     * getPath of RegisterFragment
     * method to get the file path from uri
     * @param uri
     * @return
     */
    public String getPath(Uri uri) {
        Cursor cursor = getActivity().getContentResolver().query(uri, null, null,
                null, null);
        cursor.moveToFirst();
        String document_id = cursor.getString(0);
        document_id = document_id.substring(document_id.lastIndexOf(":") + 1);
        cursor.close();

        cursor = getActivity().getContentResolver().query(
                android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
                null, MediaStore.Images.Media._ID + " = ? ",
                new String[]{document_id}, null);
        cursor.moveToFirst();
        String path = cursor.getString(cursor.getColumnIndex(MediaStore.Images.Media.DATA));
        cursor.close();

        return path;
    }

    /**
     * requestStoragePermission of RegisterFragment
     * Requesting permission
     */
    void requestStoragePermission() {
        if (ContextCompat.checkSelfPermission(this.getActivity(),
                Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED)
            return;

        if (ActivityCompat.shouldShowRequestPermissionRationale(this.getActivity(),
                Manifest.permission.READ_EXTERNAL_STORAGE)) {
            //If the user has denied the permission previously your code will come to this block
            //Here you can explain why you need this permission
            //Explain here why you need this permission
        }
        //And finally ask for the permission
        ActivityCompat.requestPermissions(this.getActivity(), new String[]{
                Manifest.permission.READ_EXTERNAL_STORAGE}, STORAGE_PERMISSION_CODE_IMG);
    }

    /**
     * onRequestPermissionsResult of RegisterFragment
     * This method will be called when the user will tap on allow or deny
     * @param requestCode
     * @param permissions
     * @param grantResults
     */
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {

        //Checking the request code of our request
        if (requestCode == STORAGE_PERMISSION_CODE_IMG) {

            //If permission is granted
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                //Displaying a toast
                Toast.makeText(this.getActivity(), "Permission granted now you can read " +
                                "the storage",
                        Toast.LENGTH_LONG).show();
            } else {
                //Displaying another toast if permission is not granted
                Toast.makeText(this.getActivity(), "Oops you just denied the permission",
                        Toast.LENGTH_LONG).show();
            }
        }

        //Checking the request code of our request
        else if (requestCode == STORAGE_PERMISSION_CODE) {

            //If permission is granted
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                //Displaying a toast
                Toast.makeText(this.getActivity(), "Permission granted now you " +
                        "can read the storage", Toast.LENGTH_LONG).show();
            } else {
                //Displaying another toast if permission is not granted
                Toast.makeText(this.getActivity(), "Oops you just denied the permission",
                        Toast.LENGTH_LONG).show();
            }
        }
    }

    /**
     * getPdfs of RegisterFragment
     */
    void getPdfs() {

        progressDialog.setMessage("Fetching Pdfs... Please Wait");
        progressDialog.show();
        StringRequest stringRequest = new StringRequest(Request.Method.POST, PDF_FETCH_URL,

                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {


                        progressDialog.dismiss();
                        try {
                            JSONObject obj = new JSONObject(response);
                            Toast.makeText(getContext(), obj.getString(
                                    "message"), Toast.LENGTH_SHORT).show();

                            JSONArray jsonArray = obj.getJSONArray("pdfs");

                            for (int i = 0; i < jsonArray.length(); i++) {

                                //Declaring a json object corresponding to every pdf object in our json Array
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                //Declaring a Pdf object to add it to the ArrayList  pdfList
                                Pdf pdf = new Pdf();
                                String pdfName = jsonObject.getString("name");
                                String pdfUrl = jsonObject.getString("url");
                                pdf.setName(pdfName);
                                pdf.setUrl(pdfUrl);
                                pdfList.add(pdf);

                            }

                            pdfAdapter = new PdfAdapter(getActivity(),
                                    R.layout.list_layout, pdfList);

                            listView.setAdapter(pdfAdapter);

                            pdfAdapter.notifyDataSetChanged();

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                    }
                },

                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        );

        RequestQueue request = Volley.newRequestQueue(this.getActivity());
        request.add(stringRequest);

    }

    /**
     * MyClickListener of RegisterFragment
     */
    public class MyClickListener implements AdapterView.OnItemClickListener {

        AutoCompleteTextView ac;

        /**
         * Constructor of MyClickListener of RegisterFragment
         * @param myAc
         */
        public MyClickListener(AutoCompleteTextView myAc) {
            ac = myAc;
        }

        /**
         * onItemClick of MyClickListener of RegisterFragment
         * @param adapterView
         * @param view
         * @param i
         * @param l
         */
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            switch (ac.getId()) {
                case R.id.state_id:
                    division_id.setText(ArrayListConstants.EMPTY_STR);
                    district.setText(ArrayListConstants.EMPTY_STR);
                    setListOnSelectState(root);
                    break;

                case R.id.division_id:
                    setListOnSelectState(root);
                    break;
            }

        }

    }
}