function check(){
		var writer = document.getElementById("writer");
		var pass = document.getElementById("pass");
		var subject = document.getElementById("subject");
		var content = document.getElementById("content");
		
		if(writer.value ==""){
			alert("작성자명을 입력하세요.");
			writer.focus();
			return false;
		}
		
		if(pass.value==""){
			alert("비밀번호를 입력하세요.");
			pass.focus();
			return false;
		}
		
		if(pass.value.length < 2 || pass.value.length > 8){
			alert("비밀번호는 2~8자 이내로 입력하세요");
			pass.value = "";// 입력한 비번 삭제
			pass.focus();
			return false;
		}
		
		if(subject.value == ""){
			alert("제목을 입력 하세요");
			subject.focus();
			return false;
		}
		
		if(subject.value.length > 50){
			alert("제목을 50자 이내로 입력");
			subject.value ="";// 입력한 제목 삭제
			subject.focus();
			return false;
		}
	}