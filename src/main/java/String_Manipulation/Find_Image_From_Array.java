package String_Manipulation;

//7. Find out how many images are in the given array:
//["photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"]
//Output: 3

public class Find_Image_From_Array {
    public void findImage(String[] s){
        int c=0;
        for (int i =0 ; i<s.length ; i++){
            if(s[i].contains("jpg")||s[i].contains("png")){
                c++;
            }
        }
        System.out.println(c);
    }
    public static void main(String[] args) {
        String[] s= {"photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"};

        Find_Image_From_Array find_image_from_array = new Find_Image_From_Array();
        find_image_from_array.findImage(s);
    }
}
