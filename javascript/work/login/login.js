function check(){
		var id = document.getElementById("id");
		var pass = document.getElementById("pass");
		
		if(id.value == ""){
			alert("ID를 입력하세요.");
			id.focus();
			return false;
		}
		
		if(pass.value == ""){
			alert("비밀번호를 입력하세요.");
			pass.focus();
			return false;
		}
	}