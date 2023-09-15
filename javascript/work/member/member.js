// ID 중복 검사
function idcheck() {
	var id = document.getElementById("id");
	if (id.value == "") {
		alert("ID를 입력하세요.")
		id.focus();
		return false;
	} else {
		var ref = "idcheck.jsp?id=" + id.value;
		// open("팝업창에 실행될 문서명, 윈도우 이름, 여러가지 옵션")
		window.open(ref, "idcheck", "width=300, height=200");
	}
}

// 주민번호 앞자리 다 적은 순간 keyup이벤트 발생으로 뒷자리 focus
function move() {
	var jumin1 = document.getElementById("jumin1");
	var jumin2 = document.getElementById("jumin2");

	if (jumin1.value.length == 6) {
		jumin2.focus();
	}

}

// 도메인 선택
function sel() {
	var domain = document.getElementById("domain");
	var email = document.getElementById("email");
	domain.readOnly = true;      // 읽기만 가능, 사용자가 맘대로 지울수 있기 때문에

	if (email.value == "") { // 직접 입력을 선택한 경우
		domain.readOnly = false; // 직접 입력을 선택했기 때문에 사용자가 적을 수 있게 readOnly기능을 풀었다.
		domain.value = ""; // 값을 지움
		domain.focus();
	} else {
		domain.value = email.value;
	}
}

// 유효성 검사
function check() {
	var id = document.getElementById("id");
	var passwd = document.getElementById("pass");
	var name = document.getElementById("name");
	var jumin1 = document.getElementById("jumin1");
	var jumin2 = document.getElementById("jumin2");
	var mailid = document.getElementById("mailid");
	var domain = document.getElementById("domain");
	var tel1 = document.getElementById("tel1");
	var tel2 = document.getElementById("tel2");
	var tel3 = document.getElementById("tel3");
	var phone1 = document.getElementById("phone1");
	var phone2 = document.getElementById("phone2");
	var phone3 = document.getElementById("phone3");
	var post = document.getElementById("post");
	var address = document.getElementById("address");
	var male = document.getElementById("male");
	var female = document.getElementById("female");
	var h1 = document.getElementById("h1");
	var h2 = document.getElementById("h2");
	var h3 = document.getElementById("h3");
	var h4 = document.getElementById("h4");
	var h5 = document.getElementById("h5");
	var intro = document.getElementById("intro");

	if (id.value == "") {
		alert("ID를 입력하세요.")
		id.focus();
		return false;
	}
	if (passwd.value == "") {
		alert("PW를 입력하세요.")
		passwd.focus();
		return false;
	}
	if (name.value == "") {
		alert("성명을 입력하세요.")
		name.focus();
		return false;
	}
	if (jumin1.value == "") {
		alert("주민번호 앞자리를 입력하세요.")
		jumin1.focus();
		return false;
	}
	if (jumin1.value.length != 6) {
		alert("주민번호 앞자리 6자리를 입력하세요.");
		jumin1.value = "";
		jumin1.focus();
		return false;
	}
	// isNaN() : 문자가 포함되면 true값을 리턴한다.
	if (isNaN(jumin1.value)) {
		alert("숫자만 입력하세요.")
		jumin1.value = "";
		jumin1.focus();
		return false;
	}
	if (jumin2.value == "") {
		alert("주민번호 뒷자리를 입력하세요.")
		jumin2.focus();
		return false;
	}
	if (jumin2.value.length != 7) {
		alert("주민번호 뒷자리 7자리를 입력하세요.");
		jumin2.value = "";
		jumin2.focus();
		return false;
	}
	// isNaN() : 문자가 포함되면 true값을 리턴한다.
	if (isNaN(jumin2.value)) {
		alert("숫자만 입력하세요.")
		jumin2.value = "";
		jumin2.focus();
		return false;
	}

	if (mailid.value == "") {
		alert("이메일 주소를 입력하세요.")
		mailid.focus();
		return false;
	}

	if (domain.value == "") {
		alert("도메인명을 입력하세요.")
		domain.focus();
		return false;
	}

	if (tel1.value == "") {
		alert("전화번호 앞자리를 입력하세요.")
		tel1.focus();
		return false;
	}

	if (isNaN(tel1.value)) {
		alert("숫자만 입력하세요.")
		tel1.value = "";
		tel1.focus();
		return false;
	}

	if (tel2.value == "") {
		alert("전화번호 중간자리를 입력하세요.")
		tel2.focus();
		return false;
	}

	if (isNaN(tel2.value)) {
		alert("숫자만 입력하세요.")
		tel2.value = "";
		tel2.focus();
		return false;
	}

	if (tel3.value == "") {
		alert("전화번호 끝자리를 입력하세요.")
		tel3.focus();
		return false;
	}

	if (isNaN(tel3.value)) {
		alert("숫자만 입력하세요.")
		tel3.value = "";
		tel3.focus();
		return false;
	}

	if (phone1.value == "") {
		alert("핸드폰 번호 앞자리를 선택하세요.")
		phone1.focus();
		return false;
	}
	if (phone2.value == "") {
		alert("핸드폰 중간자리를 선택하세요.")
		phone2.focus();
		return false;
	}

	if (isNaN(phone2.value)) {
		alert("숫자만 입력하세요.")
		phone2.value = "";
		phone2.focus();
		return false;
	}
	if (phone3.value == "") {
		alert("핸드폰 번호 끝자리를 선택하세요.")
		phone3.focus();
		return false;
	}

	if (isNaN(phone3.value)) {
		alert("숫자만 입력하세요.")
		phone3.value = "";
		phone3.focus();
		return false;
	}

	if (post.value == "") {
		alert("우편번호를 입력하세요.")
		post.focus();
		return false;
	}
	if (address.value == "") {
		alert("주소를 입력하세요.")
		address.focus();
		return false;
	}

	if (male.checked == false && female.checked == false) { // 둘다 선택 안한 경우
		alert("성별을 선택 하세요.")
		return false;
	}
	
	// checkbox 2개이상 선택하도록
	var cnt = 0;
	if(h1.checked) cnt++;
	if(h2.checked) cnt++;
	if(h3.checked) cnt++;
	if(h4.checked) cnt++;
	if(h5.checked) cnt++;
	
	if(cnt < 2){
		alert("취미를 2개이상 선택하세요");
		return false;
	}
	
	if(intro.value == ""){
		alert("자기소개를 입력하세요");
		intro.focus;
		return false;
	}
	
	if(intro.value.length > 100){
		alert("자기소개를 100자 이내로 입력하세요.");
		intro.focus;
		return false;
	}
	
}
