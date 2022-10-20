package String_Manipulation;

//1. Extract the transaction ID from the HTML body
//<html>
//<title>Test</title>
//<body>
//Your trnx is successful. Trnx Id is: TXN123456
//</body>
//</html>
//Output: TXN123456

public class Extract_From_HtmlBody {
    public void extractTrasnsactionId(String s){
//        s.indexOf("TNX");
//        System.out.println(s.indexOf("TXN"));
        System.out.println(s.substring(37));

        //s.substring()
    }
    public static void main(String[] args) {
        String s ="Your trnx is successful. Trnx Id is: TXN123456";
        Extract_From_HtmlBody extract_from_htmlBody = new Extract_From_HtmlBody();
        extract_from_htmlBody.extractTrasnsactionId(s);
    }
}
