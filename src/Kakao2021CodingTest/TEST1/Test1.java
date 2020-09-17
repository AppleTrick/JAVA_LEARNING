package Kakao2021CodingTest.TEST1;

public class Test1 {
    public static void main(String[] args) {
        // 입력한 문자열
        String new_id = "123456789abcdefg";

        //1. 대문자-> 소문자 변환
        new_id = new_id.toLowerCase();
        System.out.println("1. " + new_id);

        //2. 특수문자 제거
//        String[] changeSequence = {"!","@","#","$","%","^","&","*","(",")","=","+","[","{","}","]","\\","|",";",":","\'","\"",",","<",">","?","/","`","~"};
//        for (String a : changeSequence)
//        {
//            new_id = new_id.replace(a,"");
//        }
        new_id = new_id.replaceAll("[^a-z0-9-_.]","");
        System.out.println("2. " + new_id);


        // 3. .제거
        // 일단 배열에 넣고
        String[] PointChange;
        PointChange = new_id.split("");


        // 포인트 스위치 부분 생성
        boolean PointSwitch = false;

        for (int a = 0; a < new_id.length(); a++) {
            if (PointChange[a].equals(".")){
                if (!PointSwitch){
                    PointSwitch = true;
                }else {
                    PointChange[a]="";
                }
            } else {
                PointSwitch = false;
            }
        }
        // 재생성
        String refactId = "";
        for (String s : PointChange) {
            refactId = refactId.concat(s);
        }
        new_id = refactId;




//        // 임시방편
//       String[] changePoint = {"...",".."};
//        for (String a : changePoint)
//        {
//            new_id = new_id.replace(a,".");
//        }
        System.out.println("3. " + new_id);



        //4-1. 첫문자 . 제거
        if (new_id.indexOf(".")==0){
            new_id = new_id.substring(1);
        }
        //4-2 마지막 . 제거
        if (new_id.length() != 0){
            if (new_id.indexOf(".")==new_id.length()-1){
                new_id = new_id.substring(0,new_id.length()-1);
            }
        }
        System.out.println("4. " + new_id);


        //5. 빈 문자열이 확인
        if (new_id.isBlank()){
            new_id = "a";
        }
        System.out.println("5. " + new_id);

        //6. 문자열 15이하로 제거
        if (new_id.length()>15){
            new_id = new_id.substring(0,15);
        }
        System.out.println("6. " + new_id);

        //6-2 마지막 . 제거 한번더 확인
        if (new_id.indexOf(".")==new_id.length()-1){
            new_id = new_id.substring(0,new_id.length()-1);
        }

        //7. 문자열이 2 이하라면 new_id 의 마지막 문자를 길이가 3 될 때 까지 넣기
        String lastChar;
        if (new_id.length()<=2){
            lastChar = new_id.substring(new_id.length()-1);
            while (new_id.length() < 3){
                new_id = new_id.concat(lastChar);
            }
        }
        System.out.println("7. " + new_id);
    }
}
