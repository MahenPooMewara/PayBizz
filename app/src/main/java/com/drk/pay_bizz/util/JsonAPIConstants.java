package com.drk.pay_bizz.util;

/**
 * Created by Mahendra Mewara.
 **/
public class JsonAPIConstants {

    /**
     * Login Rest API Constants
     */
    public static final String UID = "uid";
    public static final String PASS = "pass";
    public static final String OTP = "otp";
    public static final String ATOKEN = "Atokn";
    public static final String AKEY = "Akey";
    public static final String RES = "res";

    /**
     * OTP Request Rest Api Constants
     * RQTP : Request Type LURQ or UPRQ,
     * LURQ Login User Otp Request
     * or UPRQ Update Password Otp Request
     */
    public static final String RQTP = "RQTP";

    /**
     * update password request Rest Api Constants
     * ppass : previous password
     * npass : new & confirm password
     */
    public static final String PPass = "ppass";
    public static final String NPass = "npass";

    /**
     * File Uploading Document rest api constants
     * "FName " :  "File Name of default img",
     * "File " :  "file ",
     * "url" : "uploaded document url"
     */
    public static final String FName = "FName";
    public static final String FileS = "File";
    public static final String URL = "url";

    /**
     * Registration Rest API Constants
     * "rid": 789654,
     *  "Afor": "Apply for String",
     *  "UName": "MAHENDRA MEWARA",
     *  "M_no": 9654872155,
     *  "Eid": "email id and string",
     *  "Ano": 788933386785,
     *  "PAN": "Pan Number and 10 digit alphanumeric",
     *  "DOB": "DOB string in format (13-11-2019)",
     *  "GST": "GST string 14 character alphanumeric //optional",
     *  "Add": " Address general string ",
     *  "Street": "Street general string",
     *  "NBY": "nearBy general string",
     *  "CTY": "City general String",
     *  "ST": "state general String",
     *  "Div": "Division general String //optional ",
     *  "DST": "District general String",
     *  "PINC": 743594,
     *  "SHName": "Shop Name general String",
     *  "SHAdd": "Shop Address general String",
     *  "BD": [{
     *    "AcNO": 98423493284,
     *    "HName": "Holder Name: user bank Name string",
     *    "BName": "Bank Name general String",
     *    "BrName": "Bank Branch Name string type",
     *    "IFSC": "Ifsc code general String"
     *    }],
     *   "FU": [{
     *     "IURL": "Image url general String",
     *     "PURL": "Pan file url general string",
     *     "AFURL": "Adhar Front file url as general String",
     *     "ABURL": "Adhar Back file url as general String",
     *     "PACURL": "Passbook & cheque as general String"
     *    }],
     *   "PASS": "Password and confirm password as alphanumeric with special character string",
     *   "lat": "Latidude decimal value",
     *   "long": "Longidude decimal value"
     */
    public static final String rid = "rid";
    public static final String Afor = "Afor";
    public static final String UName = "UName";
    public static final String M_no =   "M_no";
    public static final String Eid =  "Eid";
    public static final String Ano =   "Ano";
    public static final String PAN =   "PAN";
    public static final String DOB =   "DOB";
    public static final String GST =  "GST";
    public static final String Add =   "Add";
    public static final String Street =   "Street";
    public static final String NBY =  "NBY";
    public static final String CTY =  "CTY";
    public static final String ST =  "ST";
    public static final String Div =  "Div";
    public static final String DST =   "DST";
    public static final String PINC =  "PINC";
    public static final String SHName = "SHName";
    public static final String SHAdd = "SHAdd";
    public static final String BD = "BD";
    public static final String AcNO = "AcNO";
    public static final String HName = "HName";
    public static final String BName = "BName";
    public static final String BrName = "BrName";
    public static final String IFSC = "IFSC";
    public static final String FU = "FU";
    public static final String IURL = "IURL";
    public static final String PURL = "PURL";
    public static final String AFURL = "AFURL";
    public static final String ABURL = "ABURL";
    public static final String PACURL = "PACURL";
    public static final String LAT = "lat";
    public static final String LONGI = "long";

    /**
     * "ACode ": "Agent Code DRK002565",
     * "RQtP " : "PayUGW or  FundREQ or  GFTCREP or AAREQ or UPCSREQ
     * Or LICSREQ or EBPRR or MTNSR or ASRR or EBPR or LICRR or PANCR
     * Or ITRR Or  ATnx or WBReq or PrReq",
     * 1. PayUGW : PayUPayment Gateway Request Report
     * 2. FundREQ : Fund Request Report
     * 3. GFTCREP : GIFT Card Request Report
     * 4. AAREQ : Aeps Account Request Report
     * 5. UPCSREQ : UTI PAN Coupon Service Request Report
     * 6. LICSREQ : LIC Premium Service Request Report.
     * 7. EBPRR : Electricity Bill Pay Service Request Report
     * 8. MTNSR : Money Transfer New Service Request Report
     * 9. ASRR : AEPS Service Request Report
     * 10. EBPR : Electricity Bill Pay Request Report
     * 11. LICRR: LIC Request Report
     * 12. PANCR : PAN Card Report
     * 13. ITRR : Income Tax Return Report
     * 14. ATNX: All Transaction Report
     * 15 WBReq : Wallet Balance Request
     * 16 PrReq : Profile Request
     * "DFrom": "Date From String Type * optional",
     * "DTo": "Date To String Type * optional ",
     *  "Sts": "Status (Success or Reject or All) String Type * optional ",
     *  "UName": "UserName To String Type * optional ",
     *  "SName" : "Service Name like fund request type * optional ",
     *  "Atokn":  "ACode|RQtP|DFrom|DTo|Sts|UName|SName for MD5 Access Token",
     *  "Akey":  "Access Key or Generic Private Key String type"
     */
    public static final String DFrom = "DFrom";
    public static final String DTo = "DTo";
    public static final String SATS = "Sts";
    public static final String SName = "SName";

    /**
     * Response_JSON in Case of PayUGW
     * "PayUGW ":
     *  {
     *      "TDate": "Transaction date string type ",
     *      "Amt": "How much amount you can add string type ",
     *      "TMode": "Which type of transaction mode string type ",
     *      "SATS": "Status string type ",
     *      "TNo": "Transaction number string type "
     *  }
     */
    public static final String PayUGW = "PayUGW";
    public static final String TDate = "TDate";
    public static final String Amt = "Amt";
    public static final String TMode = "TMode";
    public static final String TNo = "TNo";

    /**
     * Response_JSON in Case of FundREQ
     * "FundREQ": [
     *     {
     *       "Amt": "Amount string type",
     *       "RDate": "Request Date string type",
     *       "TMode": "Transaction mode string type",
     *       "BName": "Bank Name string type",
     *       "TNo": "Transaction number string type",
     *       "SATS": "Status string type ",
     *       "ADate": "Action date string type"
     *     }
     *     "AName": "Account Name JODHPUR DRK PRIVATE LIMITED string type",
     *     "AIFSC": "Account IFSC ICIC0000104 string type",
     *     "ACNO": "Account No. DRKJDRK002565 string type"
     */
    public static final String FundREQ = "FundREQ";
    public static final String RDate = "RDate";
    public static final String ADate = "ADate";
    public static final String AName = "AName";
    public static final String AIFSC = "AIFSC";
    public static final String ACNO = "ACNO";

    /**
     * Response_JSON in Case of GFTCREP
     *   "GFTCREP":
     *     {
     *       "CAmt": "Card Amount string type",
     *       "RFor": "Request For string type",
     *       "RVal": "Request Value string type",
     *       "RDate": "Request Date string type",
     *       "ADate": "Action date string type",
     *       "SATS": "Status string type ",
     *       "RMK": "Remark string type"
     *     }
     */
    public static final String GFTCREP = "GFTCREP";
    public static final String CAmt = "CAmt";
    public static final String RFor = "RFor";
    public static final String RVal = "RVal";
    public static final String RMK = "RMK";

    /**
     * Response_JSON in Case of AAREQ
     *   "AAREQ":
     *     {
     *       "Amt": "Amount string type",
     *       "TType": "Transaction type string type",
     *       "DT": "Date Time string type",
     *       "SATS": "Status string type "
     *     }
     */
    public static final String AAREQ = "AAREQ";
    public static final String TType = "TType";
    public static final String DT = "DT";

    /**
     * Response_JSON in Case of UPCSREQ
     *   "UPCSREQ":
     *     {
     *       "NOC": "Number of Coupon string type",
     *       "Amt": "Amount string type",
     *       "DT": "Date Time string type",
     *       "SATS": "Status string type",
     *       "RMK": "Remark string type",
     *       "ADT": "Action Date Time string type"
     *     }
     */
    public static final String UPCSREQ = "UPCSREQ";
    public static final String NOC = "NOC";
    public static final String ADT = "ADT";

    /**
     * Response_JSON in Case of LICSREQ
     * {
     *   "LICSREQ": [
     *     {
     *       "TDate": "Transaction date string type ",
     *       "CName": "Consumer Name or Customer Name string type ",
     *       "Amt": "Amount string type ",
     *       "PNo": "Policy Number string type ",
     *       "DRNo": "DRK Reference number string type ",
     *       "SATS": "Status string type"
     *     }
     *   ],
     *   "TLPT": "Total LIC Pay Today string type",
     *   "TPM": "Total Pay Amount string type",
     *   "TE": "Today earning string type"
     * }
     */
    public static final String LICSREQ = "LICSREQ";
    public static final String CName = "CName";
    public static final String PNo = "PNo";
    public static final String DRNo = "DRNo";
    public static final String TLPT = "TLPT";
    public static final String TPM = "TPM";
    public static final String TE = "TE";









}
