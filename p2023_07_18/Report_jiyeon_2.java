package p2023_07_18;

public class Report_jiyeon_2 {
	
	//과제2. 2차원 배열을 이용해서 5명 학생들의 국어, 수학, 영어점수를 저장했을때,
	//과목멸로 총점과 학생별 총점을 출력하는 프로그램을 작성
	//단, 과목명(국어, 영어, 수학), 학생번호를 출력

  public static void main(String[] args) {
   
    int [][]score = { { 85,  60,  70},   //0 행
				      { 90,  95,  80},   //1 행
				      { 75,  80, 100},   //2 행
                      { 80,  70,  95},   //3 행
				      {100,  65,  80}    //4 행
					};
    int [] subject = new int[3]; //과목총점 저장 
    int [] student = new int[5]; //학생의 총점 저장   
        //subject[0]=0, subject[1] =0, subject[2]=0
    	//student[0]=0, subject[1] =0, subject[2] =0,subject[3] =0, subject[4] =0,;
    
    String[] str = {"국어","영어","수학"};
    String [] num = {"학생1","학생2","학생3","학생4","학생5"};
    
    int  r, c;  
	    
    System.out.println("각 과목별 총점구하기 ");
    for(c = 0; c < 3 ; c++){ // 과목         
      for(r = 0; r < 5 ; r++){ //학생      
        subject[c] += score[r][c]; 
      }//subject[c]=subject[c]+score[r][c];
      
      System.out.println(str[c]+ " " + subject[c]);  
    }

    System.out.println("학생별 총점구하기");
    for(r = 0; r < 5 ; r++){    //학생      
      for(c = 0; c < 3 ; c++){  //과목    
        student[r] += score[r][c];  
      }//student[r]=student[r]+score[r][c];
      System.out.println(num[r]+ " " + student[r]);
    }

  }//main() end
}// class end        