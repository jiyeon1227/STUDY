$(document).ready(function() {

	// id중복검사
	$("#idcheck").click(function() {
		if ($("#id").val() == "") {
			alert("ID를 입력하세요");
			$("#id").focus();
			return false;
		} else {
			// open("팝업창에 실행될 문서명","윈도우 이름","옵션");
			var ref = "idcheck.jsp?id=" + $("#id").val();
			window.open(ref, "mywin", "width=250, height=150");
		}
	});

	// 주민번호 뒷자리로 포커스 이동
	$("#jumin1").keyup(function() {
		if ($("#jumin1").val().length == 6) {
			$("#jumin2").focus();
		}
	})

	// 도메인 선택
	$("#email").change(function() {// val() -> 값을 구해오고, 값을 설정할 때 사용
		if ($("#email").val() == "") { // '직접입력'을 선택한 경우
			$("#domain").val("").focus(); // val()함수로 값을 지우고, focus()로 포커스
			//					$("#domain").attr("readonly",false);// 읽기전용으로 해제하는 방법 1 -> readonly속성을 false로 설정
			$("#domain").removeAttr("readonly");// 읽기전용으로 해제하는 방법 2 -> removeAttr 함수 사용
		} else {// 도메인명을 선택한 경우
			$("#domain").val($("#email").val()); // 사용자가 선택한 도메인값 가져옴
			//					$("#domain").attr("readonly",true);// 읽기전용으로 설정하는 방법 1 -> readonly 속성을 true로 설정
			$("#domain").attr("readonly", "readonly");// 읽기전용으로 설정하는 방법 2 -> readonly 속성을 readonly속성값으로 설정
		}
	})

	// 유효성 검사
	$("form").submit(function() {// form태그를 구해올 때는 #을 붙이면 안됨 (id를 구해 올 때 #사용)
		// id값 유효성 검사
		if ($("#id").val() == "") {
			alert("ID를 입력하세요.");
			$("#id").focus();
			return false;
		}

		// 비밀번호값 유효성 검사
		if ($("#pass").val() == "") {
			alert("비밀번호를 입력하세요.");
			$("#pass").focus();
			return false;
		}

		// 성명 유효성 검사
		if ($("#name").val() == "") {
			alert("이름을 입력해주쎄용");
			$("#name").focus();
			return false;
		}

		// 주민번호 앞자리 유효성 검사 1 (값을 입력했는지)
		if ($("#jumin1").val() == "") {
			alert("주민번호 앞자리를 입력하십셔");
			$("#jumin1").focus();
			return false;
		}

		// 주민번호 앞자리 유효성 검사 2 (값의 길이검사)
		if ($("#jumin1").val().length != 6) {
			alert("주민번호 앞자리는 6자리를 입력하세열");
			$("#jumin1").val("").focus();
			return false;
		}

		// 주민번호 앞자리 유효성 검사 3 (값이 숫자인지)
		// isNaN() : 문자가 포함되면 true를 리턴
		if (isNaN($("#jumin1").val())) {
			alert("숫자만 입력 가능해용 !");
			$("#jumin1").val("").focus();
			return false;
		}

		// 주민번호 뒷자리 유효성 검사 1 (값을 입력했는지)
		if ($("#jumin2").val() == "") {
			alert("주민번호 뒷자리를 입력하십셔");
			$("#jumin2").focus();
			return false;
		}

		// 주민번호 뒷자리 유효성 검사 2 (값의 길이검사)
		if ($("#jumin2").val().length != 7) {
			alert("주민번호 뒷자리는 7자리를 입력하세열");
			$("#jumin2").val("").focus();
			return false;
		}

		// 주민번호 뒷자리 유효성 검사 3 (값이 숫자인지)
		// isNaN() : 문자가 포함되면 true를 리턴
		if (isNaN($("#jumin2").val())) {
			alert("숫자만 입력 가능해용 !");
			$("#jumin2").val("").focus();
			return false;
		}

		// 이메일 유효성검사
		if ($("#mailid").val() == "") {
			alert("email주소를 입력하쎼용");
			$("#mailid").focus();
			return false;
		}

		// 도메인 유효성검사
		if ($("#domain").val() == "") {
			alert("도메인명을 입력하던가말던가");
			$("#domain").focus();
			return false;
		}

		// 전화번호 앞자리 유효성검사 1
		if ($("#tel1").val() == "") {
			alert("전화번호 앞자리를 입력해야 뭘 하던가 말던가하지");
			$("#tel1").focus();
			return false;
		}

		// 전화번호 앞자리 유효성검사 2 (전화번호 앞자리 숫자인지 문자인지 판별)
		if (isNaN($("#tel1").val())) {
			alert("숫자만 입력해야 전화를 하지;");
			$("#tel").focusS();
			return false;
		}

		// 전화번호 중간자리 유효성검사 1
		if ($("#tel2").val() == "") {
			alert("전화번호 중간자리는 입력 안하니?");
			$("#tel2").focus();
			return false;
		}

		// 전화번호 중간자리 유효성검사 2 (전화번호 앞자리 숫자인지 문자인지 판별)
		if (isNaN($("#tel2").val())) {
			alert("숫자만 입력하시라구요; 아시겠어요?");
			$("#te2").focusS();
			return false;
		}

		// 전화번호 끝자리 유효성검사 1
		if ($("#tel3").val() == "") {
			alert("전화번호 끝자리까지 입력해야지!");
			$("#tel3").focus();
			return false;
		}

		// 전화번호 끝자리 유효성검사 2 (전화번호 앞자리 숫자인지 문자인지 판별)
		if (isNaN($("#tel3").val())) {
			alert("숫자만 입력안하세요?");
			$("#te3").focusS();
			return false;
		}

		// 핸드폰 앞자리 유효성 검사
		if ($("#phone1").val() == "") {
			alert("핸드폰 앞자리 선.택 해주시겠어요?");
			$("#phone1").focus();
			return false;
		}

		// 핸드폰 중간자리 유효성 검사 1
		if ($("#phone2").val() == "") {
			alert("핸드폰 중간자리좀 입력하세요;;");
			$("#phone2").focus();
			return false;
		}

		// 핸드폰 중간자리 유효성 검사 2
		if (isNaN($("#phone2").val())) {
			alert("숫자만 입력가능하세요🙏🏻");
			$("#phone2").val("").focus();
			return false;
		}

		// 핸드폰 끝자리 유효성 검사 1
		if ($("#phone3").val() == "") {
			alert("핸드폰 끝자리 입력부탁드려요");
			$("#phone3").focus();
			return false;
		}

		// 핸드폰 끝자리 유효성 검사 2
		if (isNaN($("#phone3").val())) {
			alert("숫자만 DM부탁드려요");
			$("#phone3").val("").focus();
			return false;
		}

		// 우편번호 유효성 검사
		if ($("#post").val() == "") {
			alert("우편번호 입력해라잉");
			$("#post").focus();
			return false;
		}

		// 주소 유효성 검사
		if ($("#address").val() == "") {
			alert("주소입력안하면,, 안될껄,,,");
			$("#address").focus();
			return false;
		}

		// 라디오 버튼 유효성 검사 방법 1
		/*
		if($("#male").is(":checked") == false && $("#female").is(":checked") == false){ // false와 같다는 말은 선택을 하지 않았다는것
			alert("성별을 선택하세요");
			return false;
		}
		*/

		// 라디오 버튼 유효성 검사 방법 2
		// :radio는 input type=radio로 되어있는 모든 라디오 버튼을 구해오는 필터 선택자
		/*
		if($(":radio").is(":checked") == false){
			alert("성별을 선택하라긔");
			return false;
		}
		*/

		// 라디오 버튼 유효성 검사 방법 3
		if ($("input:radio[name='gender']:checked").length < 1) {// 1보다 작으면 선택을 하지 않은 경우
			// 조건식 제이쿼리문 뜻 : input태그중에서 체크박스를 구해오는데, name값이 hobby인것 중에서 체크된걸 구해와라
			alert("성별을 골라주세용 ~");
			return false;
		}

		// checkbox를 2개 이상 선택하도록 방법1 -> id값으로 처리
		/*
		var cnt = 0;
		if($("#h1").is(":checked")) cnt ++;
		if($("#h2").is(":checked")) cnt ++;
		if($("#h3").is(":checked")) cnt ++;
		if($("#h4").is(":checked")) cnt ++;
		if($("#h5").is(":checked")) cnt ++;
		
		if(cnt < 2){
			alert("취미를 2개이상 선택하세요.");
			return false;
		}
		*/

		// checkbox를 2개 이상 선택하도록 방법2 -> id값 없이 처리
		if ($("input:checkbox[name='hobby']:checked").length < 2) {
			// 조건식 제이쿼리문 뜻 : input태그중에서 체크박스를 구해오는데, name값이 hobby인것 중에서 체크된걸 구해와라
			alert("취미를 2개이상 골라주세용 ~");
			return false;
		}

		// 자기소개 유효성검사
		if ($("#intro").val() == "") {
			alert("소개좀 해주세욥 !!");
			$("#intro").focus();
			return false;
		}

		if ($("#intro").val().length > 100) {
			alert("100자 이내로 입력하셈.");
			$("#intro").focus();
			return false;
		}

	})// submit() end

});