package com.drk.pay_bizz.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Mahendra Mewara
 */
public class ValidationAPI {

    /**
     * MD5_STR of ValidationAPI
     * @param str
     * @return
     */
    public static String MD5_STR(String str){
        String result = "Default MD5 object creation issue";
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        md.update(str.getBytes());
        byte[] digest = md.digest();
        StringBuffer sb = new StringBuffer();
        for (byte b : digest) {
            sb.append(String.format("%02x", b & 0xff));
        }

        System.out.println("original:" + str);
        System.out.println("digested(hex):" + sb.toString());
        result = sb.toString();
        return result;
    }

    /**
     * isValidApplyFor of ValidationAPI
     * @param str
     * @return
     */
    public static boolean isValidApplyFor(String str) {
        boolean result;
        switch (str) {
            case "Agent" :
            case "Distributor" :
            case "Sub-Distributor" :
                result =  true; break;
            default:  result =  false; break;
        }
        return result;
    }

    /**
     * isValidState of ValidationAPI
     * @param str
     * @return
     */
    public static boolean isValidState(String str) {
        boolean result;
        switch (str) {
            case "Andaman and Nicobar Islands":
            case "Andhra Pradesh":
            case "Arunachal Pradesh":
            case "Assam":
            case "Bihar":
            case "Chhattisgarh":
            case "Dadra and Nagar Haveli and Daman and Diu":
            case "Delhi":
            case "Goa":
            case "Gujarat":
            case "Haryana":
            case "Himachal Pradesh":
            case "Jammu and Kashmir":
            case "Jharkhand":
            case "Karnataka":
            case "Kerala":
            case "Madhya Pradesh":
            case "Maharashtra":
            case "Manipur":
            case "Meghalaya":
            case "Mizoram":
            case "Nagaland":
            case "Odisha":
            case "Punjab":
            case "Rajasthan":
            case "Sikkim":
            case "Tamil Nadu":
            case "Telangana":
            case "Tripura":
            case "Uttar Pradesh":
            case "Uttarakhand":
            case "West Bengal" :
                result =  true; break;
            default:  result =  false; break;
        }
        return result;
    }

    /**
     * isValidGSTNo of ValidationAPI
     * Function to validate
     * GST (Goods and Services Tax) number.
     * @param str
     * @return
     */
    public static boolean isValidGSTNo(String str)
    {
        // Regex to check valid
        // GST (Goods and Services Tax) number
        String regex = "^[0-9]{2}[A-Z]{5}[0-9]{4}"
                + "[A-Z]{1}[1-9A-Z]{1}"
                + "Z[0-9A-Z]{1}$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the string is empty
        // return false
        if (str == null) {
            return false;
        }

        // Pattern class contains matcher()
        // method to find the matching
        // between the given string
        // and the regular expression.
        Matcher m = p.matcher(str);

        // Return if the string
        // matched the ReGex
        return m.matches();
    }

    /**
     * validateJavaDate of ValidationAPI
     * @param strDate
     * @return
     */
    public static boolean validateJavaDate(String strDate)
    {
        /* Check if date is 'null' */
        if (strDate.trim().equals(""))
        {
            return true;
        }
        /* Date is not 'null' */
        else
        {
            /*
             * Set preferred date format,
             * For example MM-dd-yyyy, MM.dd.yyyy,dd.MM.yyyy etc.*/
            SimpleDateFormat sdfrmt = new SimpleDateFormat("MM-dd-yyyy");
            sdfrmt.setLenient(false);
            /* Create Date object
             * parse the string into date
             */
            try
            {
                Date javaDate = sdfrmt.parse(strDate);
                System.out.println(strDate+" is valid date format");
            }
            /* Date format is invalid */
            catch (ParseException e)
            {
                System.out.println(strDate+" is Invalid Date format");
                return false;
            }
            /* Return true if date format is valid */
            return true;
        }
    }

    /**
     * isValidPanCardNo of ValidationAPI
     * Function to validate the PAN Card number.
     * @param panCardNo
     * @return
     */
    public static boolean isValidPanCardNo(String panCardNo)
    {

        // Regex to check valid PAN Card number.
        String regex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the PAN Card number
        // is empty return false
        if (panCardNo == null) {
            return false;
        }

        // Pattern class contains matcher() method
        // to find matching between given
        // PAN Card number using regular expression.
        Matcher m = p.matcher(panCardNo);

        // Return if the PAN Card number
        // matched the ReGex
        return m.matches();
    }

    /**
     * isValidAadharNumber of ValidationAPI
     * Function to validate Aadhar number.
     * @param str
     * @return
     */
    public static boolean isValidAadharNumber(String str){
        // Regex to check valid Aadhar number.
        String regex = "^[2-9]{1}[0-9]{3}[-]{1}[0-9]{4}[-]{1}[0-9]{4}$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the string is empty
        // return false
        if (str == null) {
            return false;
        }

        // Pattern class contains matcher() method
        // to find matching between given string
        // and regular expression.
        Matcher m = p.matcher(str);

        // Return if the string
        // matched the ReGex
        return m.matches();
    }

    /**
     * isValidEmail of ValidationAPI
     * @param email
     * @return
     */
    public static boolean isValidEmail(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    /**
     * isValidDivision of ValidationAPI
     * @param str
     * @return
     */
    public static boolean isValidDivision(String str) {
        boolean result;
        switch (str) {
            case "Jammu Division":
            case "Kashmir Division":
            case "North Goa":
            case "South Goa":
                result =  true; break;
            default:  result =  false; break;
        }
        return result;
    }

    /**
     * isValidDistrict of ValidationAPI
     * @param str
     * @return
     */
    public static boolean isValidDistrict(String str) {
        boolean result;
        switch (str) {
            case "Ajmer" :
            case "Alwar" :
            case "Banswara" :
            case "Baran" :
            case "Barmer" :
            case "Bharatpur" :
            case "Bhilwara" :
            case "Bikaner" :
            case "Bundi" :
            case "Chittorgarh" :
            case "Churu" :
            case "Dausa" :
            case "Dholpur" :
            case "Dungarpur" :
            case "Hanumangarh" :
            case "Jaipur" :
            case "Jaisalmer" :
            case "Jalore" :
            case "Jhalawar" :
            case "Jhunjhunu" :
            case "Jodhpur" :
            case "Karauli" :
            case "Kota" :
            case "Nagaur" :
            case "Pali" :
            case "Pratapgarh" :
            case "Rajsamand" :
            case "Sawai Madhopur" :
            case "Sikar" :
            case "Sirohi" :
            case "Sri Ganganagar" :
            case "Tonk" :
            case "Udaipur" :
            case "Anantapur" :
            case "Chittoor" :
            case "East Godavari" :
            case "Guntur" :
            case "Kadapa" :
            case "Krishna" :
            case "Kurnool" :
            case "Nellore" :
            case "Prakasam" :
            case "Srikakulam" :
            case "Visakhapatnam" :
            case "Vizianagaram" :
            case "West Godavari" :
            case "Anjaw" :
            case "Changlang" :
            case "Dibang Valley" :
            case "East Kameng" :
            case "East Siang" :
            case "Kamle" :
            case "Kra Daadi" :
            case "Kurung Kumey" :
            case "Lepa-Rada" :
            case "Lohit" :
            case "Longding" :
            case "Lower Dibang Valley" :
            case "Lower Siang" :
            case "Lower Subansiri" :
            case "Namsai" :
            case "Pakke-Kessang" :
            case "Papum Pare" :
            case "Shi-Yomi" :
            case "Siang" :
            case "Tawang" :
            case "Tirap" :
            case "Upper Siang" :
            case "Upper Subansiri" :
            case "West Kameng" :
            case "West Siang" :
            case "Baska" :
            case "Barpeta" :
            case "Biswanath" :
            case "Bongaigaon" :
            case "Cachar" :
            case "Charaideo" :
            case "Chirang" :
            case "Darrang" :
            case "Dhemaji" :
            case "Dhubri" :
            case "Dibrugarh" :
            case "Dima Hasao" :
            case "Goalpara" :
            case "Golaghat" :
            case "Hailakandi" :
            case "Hojai" :
            case "Jorhat" :
            case "Kamrup Metropolitan" :
            case "Kamrup" :
            case "Karbi Anglong" :
            case "Karimganj" :
            case "Kokrajhar" :
            case "Lakhimpur" :
            case "Majuli" :
            case "Morigaon" :
            case "Nagaon" :
            case "Nalbari" :
            case "Sivasagar" :
            case "Sonitpur" :
            case "South Salmara Mankachar" :
            case "Tinsukia" :
            case "Udalguri" :
            case "West Karbi Anglong" :
            case "Araria" :
            case "Arwal" :
            case "Aurangabad" :
            case "Banka" :
            case "Begusarai" :
            case "Bhagalpur" :
            case "Bhojpur" :
            case "Buxar" :
            case "Darbhanga" :
            case "Gaya" :
            case "Gopalganj" :
            case "Jamui" :
            case "Jehanabad" :
            case "Kaimur" :
            case "Katihar" :
            case "Khagaria" :
            case "Kishanganj" :
            case "Lakhisarai" :
            case "Madhepura" :
            case "Madhubani" :
            case "Munger" :
            case "Muzaffarpur" :
            case "Nalanda" :
            case "Nawada" :
            case "Pashchim Champaran" :
            case "Patna" :
            case "Purba Champaran" :
            case "Purnia" :
            case "Rohtas" :
            case "Saharsa" :
            case "Samastipur" :
            case "Saran" :
            case "Sheikhpura" :
            case "Sheohar" :
            case "Sitamarhi" :
            case "Siwan" :
            case "Supaul" :
            case "Vaishali" :
            case "Balod" :
            case "Baloda Bazar" :
            case "Balrampur" :
            case "Bastar" :
            case "Bemetara" :
            case "Bijapur" :
            case "Bilaspur" :
            case "Dantewada (South Bastar)" :
            case "Dhamtari" :
            case "Durg" :
            case "Gariyaband" :
            case "Janjgir-Champa" :
            case "Jashpur" :
            case "Kabirdham (Kawardha)" :
            case "Kanker (North Bastar)" :
            case "Kondagaon" :
            case "Korba" :
            case "Korea (Koriya)" :
            case "Mahasamund" :
            case "Mungeli" :
            case "Narayanpur" :
            case "Raigarh" :
            case "Raipur" :
            case "Rajnandgaon" :
            case "Sukma" :
            case "Surajpur" :
            case "Surguja" :
            case "Bicholim" :
            case "Pernem" :
            case "Sattari" :
            case "Tiswadi" :
            case "PondaNorth Goa" :
            case "Mormugao" :
            case "Salcette" :
            case "Sanguem" :
            case "Quepem" :
            case "Dharbandora":
            case "Ahmedabad" :
            case "Amreli" :
            case "Anand" :
            case "Aravalli" :
            case "Banaskantha" :
            case "Bharuch" :
            case "Bhavnagar" :
            case "Botad" :
            case "Chhota Udaipur" :
            case "Dahod" :
            case "Dang" :
            case "Devbhoomi Dwarka" :
            case "Gandhinagar" :
            case "Gir Somnath" :
            case "Jamnagar" :
            case "Junagadh" :
            case "Kutch" :
            case "Kheda" :
            case "Mahisagar" :
            case "Mehsana" :
            case "Morbi" :
            case "Narmada" :
            case "Navsari" :
            case "Panchmahal" :
            case "Patan" :
            case "Porbandar" :
            case "Rajkot" :
            case "Sabarkantha" :
            case "Surat" :
            case "Surendranagar" :
            case "Tapi" :
            case "Vadodara" :
            case "Valsad" :
            case "Ambala" :
            case "Bhiwani" :
            case "Charkhi Dadri" :
            case "Faridabad" :
            case "Fatehabad" :
            case "Gurugram" :
            case "Hisar" :
            case "Jhajjar" :
            case "Jind" :
            case "Kaithal" :
            case "Karnal" :
            case "Kurukshetra" :
            case "Mahendragarh" :
            case "Nuh" :
            case "Palwal" :
            case "Panchkula" :
            case "Panipat" :
            case "Rewari" :
            case "Rohtak" :
            case "Sirsa" :
            case "Sonipat" :
            case "Yamunanagar" :
            case "Chamba" :
            case "Kangra" :
            case "Kinnaur" :
            case "Kullu" :
            case "Lahaul and Spiti" :
            case "Mandi" :
            case "Shimla" :
            case "Sirmaur" :
            case "Solan" :
            case "Una" :
            case "Garhwa" :
            case "Palamu" :
            case "Latehar" :
            case "Chatra" :
            case "Hazaribagh" :
            case "Koderma" :
            case "Giridih" :
            case "Ramgarh" :
            case "Bokaro" :
            case "Dhanbad" :
            case "Gumla" :
            case "Lohardaga" :
            case "Simdega" :
            case "Ranchi" :
            case "Khunti" :
            case "West Singhbhum" :
            case "Saraikela Kharsawan" :
            case "East Singhbhum" :
            case "Jamtara" :
            case "Deoghar" :
            case "Dumka" :
            case "Pakur" :
            case "Godda" :
            case "Sahebganj" :
            case "Bagalkot" :
            case "Ballari (Bellary)" :
            case "Belagavi (Belgaum)" :
            case "Bengaluru (Bangalore) Rural" :
            case "Bengaluru (Bangalore) Urban" :
            case "Bidar" :
            case "Chamarajanagar" :
            case "Chikballapur" :
            case "Chikkamagaluru (Chikmagalur)" :
            case "Chitradurga" :
            case "Dakshina Kannada" :
            case "Davangere" :
            case "Dharwad" :
            case "Gadag" :
            case "Hassan" :
            case "Haveri" :
            case "Kalaburagi (Gulbarga)" :
            case "Kodagu" :
            case "Kolar" :
            case "Koppal" :
            case "Mandya" :
            case "Mysuru (Mysore)" :
            case "Raichur" :
            case "Ramanagara" :
            case "Shivamogga (Shimoga)" :
            case "Tumakuru (Tumkur)" :
            case "Udupi" :
            case "Uttara Kannada (Karwar)" :
            case "Vijayapura (Bijapur)" :
            case "Yadgir" :
            case "Alappuzha" :
            case "Ernakulam" :
            case "Idukki" :
            case "Kannur" :
            case "Kasaragod" :
            case "Kollam" :
            case "Kottayam" :
            case "Kozhikode" :
            case "Malappuram" :
            case "Palakkad" :
            case "Pathanamthitta" :
            case "Thiruvananthapuram" :
            case "Thrissur" :
            case "Wayanad" :
            case "Agar Malwa" :
            case "Alirajpur" :
            case "Anuppur" :
            case "Ashoknagar" :
            case "Balaghat" :
            case "Barwani" :
            case "Betul" :
            case "Bhind" :
            case "Bhopal" :
            case "Burhanpur" :
            case "Chhatarpur" :
            case "Chhindwara" :
            case "Damoh" :
            case "Datia" :
            case "Dewas" :
            case "Dhar" :
            case "Dindori" :
            case "Guna" :
            case "Gwalior" :
            case "Harda" :
            case "Hoshangabad" :
            case "Indore" :
            case "Jabalpur" :
            case "Jhabua" :
            case "Katni" :
            case "Khandwa" :
            case "Khargone" :
            case "Mandla" :
            case "Mandsaur" :
            case "Morena" :
            case "Narsinghpur" :
            case "Neemuch" :
            case "Niwari" :
            case "Panna" :
            case "Raisen" :
            case "Rajgarh" :
            case "Ratlam" :
            case "Rewa" :
            case "Sagar" :
            case "Satna" :
            case "Sehore" :
            case "Seoni" :
            case "Shahdol" :
            case "Shajapur" :
            case "Sheopur" :
            case "Shivpuri" :
            case "Sidhi" :
            case "Singrauli" :
            case "Tikamgarh" :
            case "Ujjain" :
            case "Umaria" :
            case "Vidisha" :
            case "Ahmednagar" :
            case "Akola" :
            case "Amravati" :
            case "Beed" :
            case "Bhandara" :
            case "Buldhana" :
            case "Chandrapur" :
            case "Dhule" :
            case "Gadchiroli" :
            case "Gondia" :
            case "Hingoli" :
            case "Jalgaon" :
            case "Jalna" :
            case "Kolhapur" :
            case "Latur" :
            case "Mumbai City" :
            case "Mumbai Suburban" :
            case "Nagpur" :
            case "Nanded" :
            case "Nandurbar" :
            case "Nashik" :
            case "Osmanabad" :
            case "Palghar" :
            case "Parbhani" :
            case "Pune" :
            case "Raigad" :
            case "Ratnagiri" :
            case "Sangli" :
            case "Satara" :
            case "Sindhudurg" :
            case "Solapur" :
            case "Thane" :
            case "Wardha" :
            case "Washim" :
            case "Yavatmal" :
            case "Bishnupur" :
            case "Chandel" :
            case "Churachandpur" :
            case "Imphal East" :
            case "Imphal West" :
            case "Jiribam" :
            case "Kakching" :
            case "Kamjong" :
            case "Kangpokpi" :
            case "Noney" :
            case "Pherzawl" :
            case "Senapati" :
            case "Tamenglong" :
            case "Tengnoupal" :
            case "Thoubal" :
            case "Ukhrul" :
            case "Ampati" :
            case "Baghmara" :
            case "Jowai" :
            case "Khliehriat" :
            case "Mawkyrwat" :
            case "Nongpoh" :
            case "Nongstoin" :
            case "Resubelpara" :
            case "Shillong" :
            case "Tura" :
            case "Williamnagar" :
            case "Aizawl" :
            case "Kolasib" :
            case "Lawngtlai" :
            case "Lunglei" :
            case "Mamit" :
            case "Saiha" :
            case "Serchhip" :
            case "Champhai" :
            case "Hnahthial" :
            case "Khawzawl" :
            case "Saitual" :
            case "Dimapur" :
            case "Kiphire" :
            case "Kohima" :
            case "Longleng" :
            case "Mokokchung" :
            case "Mon" :
            case "Peren" :
            case "Phek" :
            case "Tuensang" :
            case "Wokha" :
            case "Zunheboto" :
            case "Angul" :
            case "Balangir" :
            case "Balasore" :
            case "Bargarh" :
            case "Bhadrak" :
            case "Boudh" :
            case "Cuttack" :
            case "Deogarh" :
            case "Dhenkanal" :
            case "Gajapati" :
            case "Ganjam" :
            case "Jagatsinghapur" :
            case "Jajpur" :
            case "Jharsuguda" :
            case "Kalahandi" :
            case "Kandhamal" :
            case "Kendrapara" :
            case "Kendujhar (Keonjhar)" :
            case "Khordha" :
            case "Koraput" :
            case "Malkangiri" :
            case "Mayurbhanj" :
            case "Nabarangpur" :
            case "Nayagarh" :
            case "Nuapada" :
            case "Puri" :
            case "Rayagada" :
            case "Sambalpur" :
            case "Sonepur" :
            case "Sundargarh" :
            case "Amritsar" :
            case "Barnala" :
            case "Bathinda" :
            case "Faridkot" :
            case "Fatehgarh Sahib" :
            case "Fazilka" :
            case "Ferozepur" :
            case "Gurdaspur" :
            case "Hoshiarpur" :
            case "Jalandhar" :
            case "Kapurthala" :
            case "Ludhiana" :
            case "Mansa" :
            case "Moga" :
            case "Muktsar" :
            case "Nawanshahr (Shahid Bhagat Singh Nagar)" :
            case "Pathankot" :
            case "Patiala" :
            case "Rupnagar" :
            case "Sahibzada Ajit Singh Nagar (Mohali)" :
            case "Sangrur" :
            case "Tarn Taran" :
            case "Gangtok" :
            case "Geyzing" :
            case "Mangan" :
            case "Namchi" :
            case "Ariyalur" :
            case "Chengalpattu" :
            case "Chennai" :
            case "Coimbatore" :
            case "Cuddalore" :
            case "Dharmapuri" :
            case "Dindigul" :
            case "Erode" :
            case "Kallakurichi" :
            case "Kanchipuram" :
            case "Kanyakumari" :
            case "Karur" :
            case "Krishnagiri" :
            case "Madurai" :
            case "Nagapattinam" :
            case "Namakkal" :
            case "Nilgiris" :
            case "Perambalur" :
            case "Pudukkottai" :
            case "Ramanathapuram" :
            case "Ranipet" :
            case "Salem" :
            case "Sivaganga" :
            case "Tenkasi" :
            case "Thanjavur" :
            case "Theni" :
            case "Thoothukudi (Tuticorin)" :
            case "Tiruchirappalli" :
            case "Tirunelveli" :
            case "Tirupathur" :
            case "Tiruppur" :
            case "Tiruvallur" :
            case "Tiruvannamalai" :
            case "Tiruvarur" :
            case "Vellore" :
            case "Viluppuram" :
            case "Virudhunagar" :
            case "Adilabad" :
            case "Bhadradri Kothagudem" :
            case "Hyderabad" :
            case "Jagtial" :
            case "Jangaon" :
            case "Jayashankar Bhupalapally" :
            case "Jogulamba Gadwal" :
            case "Kamareddy" :
            case "Karimnagar" :
            case "Khammam" :
            case "Kumarambheem Asifabad" :
            case "Mahabubabad" :
            case "Mahabubnagar" :
            case "Mancherial" :
            case "Medak" :
            case "Medchal–Malkajgiri" :
            case "Nagarkurnool" :
            case "Nalgonda" :
            case "Nirmal" :
            case "Nizamabad" :
            case "Peddapalli" :
            case "Rajanna Sircilla" :
            case "Ranga Reddy" :
            case "Sangareddy" :
            case "Siddipet" :
            case "Suryapet" :
            case "Vikarabad" :
            case "Wanaparthy" :
            case "Warangal Rural" :
            case "Warangal Urban" :
            case "Yadadri Bhuvanagiri" :
            case "Dhalai" :
            case "Sipahijala" :
            case "Khowai" :
            case "Gomati" :
            case "Unakoti" :
            case "North Tripura" :
            case "South Tripura" :
            case "West Tripura" :
            case "Agra" :
            case "Aligarh" :
            case "Allahabad" :
            case "Ambedkar Nagar" :
            case "Amethi" :
            case "Amroha" :
            case "Auraiya" :
            case "Azamgarh" :
            case "Badaun" :
            case "Bagpat" :
            case "Bahraich" :
            case "Ballia" :
            case "Banda" :
            case "Barabanki" :
            case "Bareilly" :
            case "Basti" :
            case "Bijnor" :
            case "Bulandshahr" :
            case "Chandauli (Varanasi Dehat)" :
            case "Chitrakoot" :
            case "Deoria" :
            case "Etah" :
            case "Etawah" :
            case "Faizabad" :
            case "Farrukhabad" :
            case "Fatehpur" :
            case "Firozabad" :
            case "Gautam Buddha Nagar" :
            case "Ghaziabad" :
            case "Ghazipur" :
            case "Gonda" :
            case "Gorakhpur" :
            case "Hamirpur" :
            case "Hapur" :
            case "Hardoi" :
            case "Hathras" :
            case "Jalaun" :
            case "Jaunpur" :
            case "Jhansi" :
            case "Kannauj" :
            case "Kanpur Dehat" :
            case "Kanpur Nagar" :
            case "Kasganj" :
            case "Kaushambi" :
            case "Kushinagar" :
            case "Lakhimpur Kheri" :
            case "Lalitpur" :
            case "Lucknow" :
            case "Maharajganj" :
            case "Mahoba" :
            case "Mainpuri" :
            case "Mathura" :
            case "Mau" :
            case "Meerut" :
            case "Mirzapur" :
            case "Moradabad" :
            case "Muzaffarnagar" :
            case "Pilibhit" :
            case "Rae Bareli" :
            case "Rampur" :
            case "Saharanpur" :
            case "Sant Kabir Nagar" :
            case "Sant Ravidas Nagar" :
            case "Sambhal" :
            case "Shahjahanpur" :
            case "Shamli" :
            case "Shravasti" :
            case "Siddharthnagar" :
            case "Sitapur" :
            case "Sonbhadra" :
            case "Sultanpur" :
            case "Unnao" :
            case "Varanasi (Kashi)" :
            case "Almora" :
            case "Bageshwar" :
            case "Chamoli" :
            case "Champawat" :
            case "Dehradun" :
            case "Haridwar" :
            case "Nainital" :
            case "Pauri Garhwal" :
            case "Pithoragarh" :
            case "Rudraprayag" :
            case "Tehri Garhwal" :
            case "Udham Singh Nagar" :
            case "Uttarkashi" :
            case "Alipurduar" :
            case "Bankura" :
            case "Birbhum" :
            case "Cooch Behar" :
            case "Dakshin Dinajpur (South Dinajpur)" :
            case "Darjeeling" :
            case "Hooghly" :
            case "Howrah" :
            case "Jalpaiguri" :
            case "Jhargram" :
            case "Kalimpong" :
            case "Kolkata" :
            case "Malda" :
            case "Murshidabad" :
            case "Nadia" :
            case "North 24 Parganas" :
            case "Paschim Medinipur (West Medinipur)" :
            case "Paschim (West) Burdwan (Bardhaman)" :
            case "Purba Burdwan (Bardhaman)" :
            case "Purba Medinipur (East Medinipur)" :
            case "Purulia" :
            case "South 24 Parganas" :
            case "Uttar Dinajpur (North Dinajpur)" :
            case "Nicobar" :
            case "North and Middle Andaman" :
            case "South Andaman" :
            case "Doda" :
            case "Jammu" :
            case "Kathua" :
            case "Kishtwar" :
            case "Poonch" :
            case "Rajouri" :
            case "Ramban" :
            case "Reasi" :
            case "Samba" :
            case "Udhampur" :
            case "Anantnag" :
            case "Bandipora" :
            case "Baramulla" :
            case "Budgam" :
            case "Ganderbal" :
            case "Kulgam" :
            case "Kupwara" :
            case "Pulwama" :
            case "Shopian" :
            case "Srinagar" :
            case "Daman" :
            case "Diu" :
            case "Dadra and Nagar Haveli" :
            case "New Delhi" :
            case "Central Delhi" :
            case "East Delhi" :
            case "North Delhi" :
            case "North East Delhi" :
            case "North West Delhi" :
            case "Shahdara" :
            case "South Delhi" :
            case "South East Delhi" :
            case "South West Delhi" :
            case "West Delhi" :
                result =  true; break;
            default:  result =  false; break;
        }
        return result;
    }

    /**
     * isValidIFSCode of ValidationAPI
     * Function to validate
     * IFSC (Indian Financial System) Code using regular expression.
     * @param str
     * @return
     */
    public static boolean isValidIFSCode(String str)
    {
        // Regex to check valid IFSC Code.
        String regex
                = "^[A-Z]{4}0[A-Z0-9]{6}$";

        // Compile the ReGex
        Pattern p
                = Pattern.compile(regex);

        // If the string is empty
        // return false
        if (str == null) {
            return false;
        }

        // Pattern class contains matcher()
        // method to find matching between
        // the given string and
        // the regular expression.
        Matcher m = p.matcher(str);

        // Return if the string
        // matched the ReGex
        return m.matches();
    }

    /**
     * onlyDigits of ValidationAPI
     * Function to check if a string
     * contains only digits
     * @param str
     * @param n
     * @return
     */
    public boolean onlyDigits(String str, int n)
    {
        // Traverse the string from
        // start to end
        for (int i = 0; i < n; i++) {

            // Check if character is
            // digit from 0-9
            // then return true
            // else false
            if (str.charAt(i) >= '0'
                    && str.charAt(i) <= '9') {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }

    /**
     * digit + lowercase char + uppercase char + punctuation + symbol
      */
    private static final String PASSWORD_PATTERN =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";

    private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

    /**
     * isValidPassword of ValidationAPI
     * @param password
     * @return
     */
    public static boolean isValidPassword(final String password) {
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

}
