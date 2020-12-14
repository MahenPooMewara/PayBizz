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
     *  "MNo": 9654872155,
     *  "Eid": "email id and string",
     *  "ANo": 788933386785,
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
     *  "PCOD": 743594,
     *  "SHName": "Shop Name general String",
     *  "SHAdd": "Shop Address general String",
     *  "BD": [{
     *    "ACNO": 98423493284,
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
    public static final String MNo =   "MNo";
    public static final String Eid =  "Eid";
    public static final String ANo =   "Ano";
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
    public static final String PCOD =  "PCOD";
    public static final String SHName = "SHName";
    public static final String SHAdd = "SHAdd";
    public static final String BD = "BD";
    public static final String ACNO = "ACNO";
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
     * "ACode": "Agent Code DRK002565",
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
    public static final String ACode = "ACode";
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

    /**
     * Response_JSON in Case of EBPRR
     * {
     *   "EBPRR": [
     *     {
     *       "TDate": "Transaction date string type ",
     *       "CName": "Consumer Name or Customer Name string type ",
     *       "Amt": "Amount string type ",
     *       "KNo": "K Number string type ",
     *       "DRNo": "DRK Reference number string type ",
     *       "SATS": "Status string type"
     *     },
     *    ......
     *   ],
     *   "TBPT": "Total Bill Pay Today string type",
     *   "TPM": "Total Pay Amount string type",
     *   "TE": "Today earning string type"
     * }
     */
    public static final String EBPRR = "EBPRR";
    public static final String KNo = "KNo";
    public static final String TBPT = "TBPT";

    /**
     * Response_JSON in Case of MTNSR
     *   "MTNSR":
     *     {
     *       "ACNO": "Account Number string type ",
     *       "BName": "Bank Name string type",
     *       "IFSC": "IFS Code string type",
     *       "MNo": "Mobile Number string type ",
     *       "CName": "Customer or Consumer Name string type ",
     *       "BeVa": "Beneficiary Validate string type ",
     *       "TAmt": "Transfer Amount string type ",
     *       "ACT": "Action string type "
     *     }
     */
    public static final String MTNSR = "MTNSR";
    public static final String BeVa = "BeVa";
    public static final String TAmt = "TAmt";
    public static final String ACT = "ACT";

    /**
     * Response_JSON in Case of ASRR
     * {
     *   "ASRR": [
     *     {
     *       "Type": "Type string type ",
     *       "UCode": "Utility Code string type ",
     *       "STY": "Service Type string type ",
     *       "REID": "Reference ID string type ",
     *       "TDate": "Transaction Date string type ",
     *       "BeRe": "Beneficiary or Receiver string type ",
     *       "ACNO": "Account Number string type ",
     *       "Amt": "Amount string type",
     *       "CRCOM": "Charges or commission string type",
     *       "TAmt": "Total Amount string type ",
     *       "RMK": "Remark string type"
     *       }
     */
    public static final String ASRR = "ASRR";
    public static final String Type = "Type";
    public static final String UCode = "UCode";
    public static final String STY = "STY";
    public static final String REID = "REID";
    public static final String BeRe = "BeRe";
    public static final String CRCOM = "CRCOM";

    /**
     * Response_JSON in Case of MTRR
     * {
     *   "MTRR": [
     *     {
     *       "ACNO": "Account Number string type ",
     *       "TDate": "Transaction Date string type ",
     *       "BName": "Bank Name string type",
     *       "IFSC": "IFS Code string type",
     *       "MNo": "Mobile Number string type ",
     *       "CName": "Customer or Consumer Name string type ",
     *       "Amt": "Amount string type ",
     *       "SATS": "Status string type "
     *     },...
     *    ]
     *  }
     */
    public static final String MTRR = "MTRR";

    /**
     * Response JSON Code in case of EBPR
     * {
     *   "EBPR": [
     *     {
     *       "ACode": "Agent Code DRK002565",
     *       "TDate": "Transaction date string type ",
     *       "CName": "Consumer Name or Customer Name string type ",
     *       "Amt": "Amount string type ",
     *       "KNo": "K Number string type ",
     *       "DRNo": "DRK Reference number string type ",
     *       "SATS": "Status string type"
     *     },....
     *     ]
     *  }
     */
    public static final String EBPR = "EBPR";

    /**
     * Response_JSON in Case of LICRR
     * {
     *   "LICRR": [
     *     {
     *     "ACode": "Agent Code DRK002565",
     *     "TDate": "Transaction date string type ",
     *     "CName": "Consumer Name or Customer Name string type ",
     *     "Amt": "Amount string type ",
     *     "DDate": "Due date string type ",
     *     "LIC": "LIC string type ",
     *     "PNo": "Policy Number string type ",
     *     "LICRefNo": "LIC Reference Number string type ",
     *     "DRNo": "DRK Reference number string type ",
     *     "SATS": "Status string type"
     *     },...
     *    ]
     * }
     */
    public static final String LICRR = "LICRR";
    public static final String DDate = "Ddate";
    public static final String LIC = "LIC";
    public static final String LICRefNo = "LICRefNo";

    /**
     * Response_JSON in Case of PANCR
     * {
     *   "PANCR": [
     *     {
     *       "CName": "Customer or Consumer Name string type",
     *       "Type": "Type string type",
     *       "RefNo": "Reference No. string type",
     *       "Amt": "Amount string type",
     *       "IDP": "Identity Proof string type",
     *       "AddP": "Address Proof string type",
     *       "DOBP": "DOB Proof string type",
     *       "F49A1": "Form49A(I) Proof string type",
     *       "F49A2": "Form49A(II) Proof string type",
     *       "Date": "Date string type",
     *       "REC": "Receipt string type",
     *       "SATS": "Status string type"
     *     },..
     *     ]
     *  }
     */
    public static final String PANCR = "PANCR";
    public static final String RefNo = "RefNo";
    public static final String IDP = "IDP";
    public static final String AddP = "AddP";
    public static final String DOBP = "DOBP";
    public static final String F49A1 = "F49A1";
    public static final String F49A2 = "F49A2";
    public static final String Date = "Date";
    public static final String REC = "REC";

    /**
     * Response_JSON in Case of ITRR
     * {
     *   "ITRR": [
     *     {
     *       "TNo": "Transaction Number string type",
     *       "UName": "User Name string type",
     *       "PName": "Plan Name string type",
     *       "CName": "Consumer or Customer Name string type",
     *       "PAmt": "Plan Amount string type",
     *       "PCom": "Plan Commission string type",
     *       "TAmt": "Total Amount string type",
     *       "TDate": "Transaction Date string type",
     *       "SATS": "Status string type"
     *     },...
     *   ]
     * }
     */
    public static final String ITRR = "ITRR";
    public static final String PName = "PName";
    public static final String PAmt = "PAmt";
    public static final String PCom = "PCom";

    /**
     * Response_JSON in Case of ATNX
     * {
     *   "ATNX": [
     *     {
     *       "CName": "Consumer or Customer Name String Type",
     *       "ACode": "Agent Code DRK002565",
     *       "SName": "Service Name String Type",
     *       "OPBal": "Opening Balance String Type",
     *       "Amt": "Amount string type",
     *       "DRCR": "Debit or credit transaction string type",
     *       "GCom": "Gross Commission no string type",
     *       "TDS": "TDS string type",
     *       "NCom": "Net Commission string type",
     *       "CLBAL": "Closing Balance String type",
     *       "SATS": "Status String type",
     *       "RMK": [
     *
     *           "Remarkstringtype",
     *           "Remarkstringtype",
     *           "Remarkstringtype",
     *           "Remarkstringtype",
     *           "RemarkStringtype"
     *
     *       ],
     *       "SDT": "SubmitDateTime09-12-202007: 56: 08PMStringtype",
     *       "ADT": "SubmitDateTime09-12-202007: 56: 08PMStringtype"
     *     },...
     *   ]
     * }
     */
    public static final String ATNX = "ATNX";
    public static final String OPBal = "OPBal";
    public static final String DRCR = "DRCR";
    public static final String GCom = "GCom";
    public static final String TDS = "TDS";
    public static final String NCom = "NCom";
    public static final String CLBAL = "CLBAL";
    public static final String SDT = "SDT";

    /**
     * Response Json for WBReq
     * {
     *     "Res" : 0
     *     "WBal" : "Wallet Balance * Optional"
     * }
     */
    public static final String Res = "Res";
    public static final String WBal = "WBal";

    /**
     * Response Json for PrReq
     * {
     *     "Res" : 0,
     *     "Afor" :  "Apply for String ",
     *     "UName" :  "MAHENDRA MEWARA  Name string type",
     *     "DId" : "Drk id DRK002565"
     *     "MNo" : 9654872155,
     *     "Eid " :  "email id mahendramewara172@gmail.com and string ",
     *     "DOB ": "DOB string in format (13-11-2019) ",
     *     "ANo ":  "Adhar no. numeric value 12 digit ",
     *     "PAN ": "Pan Number and 10 digit alphanumeric ",
     *     "GST ": "GST string 14 character alphanumeric // optional",
     *     "Add ": " Address general string  "
     *     "Street ": "Street general string ",
     *     "NBY ":  "nearBy general string ",
     *     "CTY ": "City general String ",
     *     "ST":  "State general String ",
     *     "Div ": "Division general String ",//optional
     *     "DST ": "District general String ",
     *     "PCOD ":  "Pincode general String ",
     *     "SHName": "Shop Name general String",
     *     "SHAdd": "Shop Address general String",
     *     "SrOf": [
     *            "AePS Service Offered general String","PAN-Apply" ,"DMT","ITR-File","LIC","E-Bill pay"],
     *     "BD ":[{
     *                 "ACNO ": " Acc. No numeric minimum 9 to digit valid ",
     *                 "HName ": "Holder Name : user bank Name string ",
     *                 "BName ": "Bank Name general String ",
     *             "BrName ": "Bank Branch Name general String ",
     *                 "IFSC ": "Ifsc code general String "
     *            }],
     *     "FU":[{
     *                 "IURL": "Image url general String ",
     *                 "PURL": "Pan file url general string * optional ",
     *                  "AFURL": "Adhar Front file url as general String  * optional  ",
     *                 "ABURL": "Adhar Back file url as general String  * optional  ",
     *                "PACURL": "Passbook & cheque as general String  * optional  "
     *            }],
     *     "WBal" : "Wallet Balance * Optional"
     * }
     */
    public static final String PrReq = "PrReq";
    public static final String DId = "DId";
    public static final String SrOf = "SrOf";

    /**
     * API 7. FundReq APi Request JSon
     * {
     *   "ACode": "Agent Code DRK002565",
     *   "BName": "Bank Name string type",
     *   "PMode": "Pay Mode string type",
     *   "TNo": "Transaction No string type",
     *   "TS": "Timestamp string type",
     *   "Amt": "Amount string type",
     *   "Atokn":  "ACode|BName|PMode|TNo|TS|Amt for MD5 Access Token",
     *   "Akey":  "Access Key or Generic Private Key String type"
     * }
     */
    public static final String PMode = "PMode";
    public static final String TS = "TS";

    /**
     * API 9. DRk Gift Card Request Json
     * {
     *     "ACode": "Agent Code DRK002565",
     *     "Amt": "Amount string type",
     *     "TCType": "Transaction Card Type string type",
     *     "CNo": "ICICI Credit card number/Kiosk Number string type *optional",
     *     "Atokn":  "ACode|Amt|TCType|CNo for MD5 Access Token",
     *     "Akey":  "Access Key or Generic Private Key String type"
     * }
     * Description : TCType : DRK Gift card, Ebix Card, Credit card loading and E-Mitra Load.
     */
    public static final String TCType = "TCType";
    public static final String CNo = "CNo";

    /**
     * API 10. AePS Account Request Json
     * {
     *     "ACode": "Agent Code DRK002565",
     *     "BName": "Bank Name string type",
     *     "BrName": "Bank Branch Name string type",
     *     "IFSC": "IFS Code string type",
     *     "AName": "Account Name string type",
     *     "ACNO": "Account No string type",
     *     "Amt": "Amount string type",
     *     "PMode": "Payment Mode or charges apply string type",
     *     "Atokn":  "ACode|BName|BrName|IFSC|AName|ACNo|Amt for MD5 Access Token",
     *     "Akey":  "Access Key or Generic Private Key String type"
     * }
     * Description
     * PMode : 1. IMPS {3.54 Rupees} or 2. NEFT {5.90 Rupees}
     */

    /**
     * API 11. LIc Service Request Json
     * {
     *     "ACode": "Agent Code DRK002565",
     *     "PNo": "Policy number",
     *     "Atokn":  "ACode|PNo for MD5 Access Token",
     *     "Akey":  "Access Key or Generic Private Key String type"
     * }
     */

    /**
     * API 12 Electricity Bill Pay Service Request Json
     * {
     *   "ACode": "Agent Code DRK002565",
     *   "KNo": "K number",
     *   "TMode": "Transaction Mode String type",
     *   "SBRD": "Select Board or distributor board String type",
     *   "AmtP": "Amount Payable string type * optional ",
     *   "DDate": "Due Date String type * optional ",
     *   "CName": "Consumer Name string type * optional ",
     *   "Atokn":  "ACode|KNo|TMode|SBRD|AmtP|DDate|CName for MD5 Access Token",
     *   "Akey":  "Access Key or Generic Private Key String type"
     * }
     * Description : TMode : Online or Manual
     */
    public static final String SBRD = "SBRD";
    public static final String AmtP = "AmtP";

    /**
     * API 13 Money Transfer New Service Request Json
     * {
     *     "ACode": "Agent Code DRK002565",
     *     "SMNo": "Sender Mobile number",
     *     "Atokn":  "ACode|SMNo for MD5 Access Token",
     *     "Akey":  "Access Key or Generic Private Key String type"
     * }
     */
    public static final String SMNo = "SMNo";

    /**
     * 14. Create New Beneficiary Account Request Json
     * {
     *     "ACode": "Agent Code DRK002565",
     *     "SMNo": "Sender Mobile number",
     *     "TOB": "Type of Beneficiary is Airtel DMT Add Beneficiary",
     *     "BEName": "Beneficiary Name ",
     *     "BEAcNo": "Beneficiary Account Number ",
     *     "BName": "Bank Name string type",
     *     "ST": "State Name string type",
     *     "DST": "District Name string type",
     *     "IFSC": "IFSC code or branch code string type",
     *     "BrName": "Bank Branch Name string type",
     *     "BEMNo": "Beneficiary Mobile Number"
     *     "Atokn":  "ACode|SMNo|TOB|BEName|BEAcNo|BName|STS|Dis|IFSC|BrName|BEMNo
     *                             for MD5 Access Token",
     *     "Akey":  "Access Key or Generic Private Key String type"
     * }
     */
    public static final String TOB = "TOB";
    public static final String BEName = "BEName";
    public static final String BEAcNo = "BEAcNo";
    public static final String BEMNo = "BEMNo";

    /**
     * 15. Request Json For Update Bank details one time:
     * {
     *    "ACode": "Agent Code DRK002565",
     *    "ACNO": 98423493284,
     *    "HName": "Holder Name: user bank Name string",
     *    "BName": "Bank Name general String",
     *    "BrName": "Bank Branch Name string type",
     *     "IFSC": "Ifsc code general String",
     *     "Atokn":  "ACode|ACNO|HName|BName|BrName|IFSC for MD5 Access Token",
     *     "Akey":  "Access Key or Generic Private Key String type"
     *  }
     */

    /**
     * 16. Request Json For Update Profile Details
     * {
     *    "ACode": "Agent Code DRK002565",
     *    "Eid": "email id and string",
     *    "DOB": "DOB string in format (13-11-2019)",
     *    "Add": " Address general string ",
     *     "Street": "Street general string",
     *     "NBY": "nearBy general string",
     *     "CTY": "City general String",
     *     "ST": "state general String",
     *     "Div": "Division general String //optional ",
     *     "DST": "District general String",
     *     "PCOD": 743594,
     *     "lat": "Latidude decimal value",
     *     "long": "Longidude decimal value",
     *     "Atokn":  "ACode|Eid|DOB|Add|Street|NBY|CTY|ST|Div|DST|PINC|lat|long for MD5 Access
     *                    Token",
     *      "Akey":  "Access Key or Generic Private Key String type"
     *
     * }
     */

    /**
     * API 16. Give permission to users to update password request for 1st time login
     * and update password after 120 days.
     * {
     *    "ACode": "Agent Code DRK002565",
     *    "PPass" : "previous password",
     *    "npass" : "new & confirm password",
     *    "Atokn":  "ACode|ppass|npass for MD5 Access Token",
     *    "Akey":  "Access Key or Generic Private Key String type"
     * }
     */

    /*75000083155051
    2000841801976*/




















}
