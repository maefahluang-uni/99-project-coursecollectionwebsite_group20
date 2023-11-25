let availableKeywords =[
	'The Complete C Programming Course for Beginners',
	'C Programming Tutorial for Beginners',
	'Advanced C Programming Course',
	'Pointers in C for Absolute Beginners Full Course',
	'C Programming Masterclass: Pointers & Advanced C Language',
	'C Data Types (+3 Design Questions) | Sanfoundry',
	'เรียน C Programming ด้วยตัวเอง ฉบับคนไม่เคยเขียนโปรแกรม',
	'C Programming for Beginners | C Programming Tutorial | Learn C | Intellipaat',
	'C Programming All-in-One Tutorial Series (10 HOURS!)',
	'C Programming Tutorial - Full Course (2023)',
	'C Programming Full Course for free',
	'Programming with C Intermediate',
	'Advance C Programming : Pointers (In Depth Hands On)',
	'C++ Tutorial for Beginners ',
	'C++ Programming Course ',
	'Beginning C++Programming From Beginner to Beyond',
	'C++ Programming  C++ Intermediate Level',
	'Cเขียนโปรแกรมภาษา C++',
	'C++ Programming ',
	'CSS basics',
	'Learn CSS - For Beginners',
	'Learn CSS',
	'Learn Intermediate CSS',
	'CSS Intermediate',
	'',
	'',
	'',
	'',
	'',
	'',
	'',
	'',
	'',
	'',
	'',
	'',
	'',
	'',
	'',
//บทเอาเป็นปมว่า คลิกsearchละพิมที่ตั้งไว้ ละกดค้นหา
];
const resultsBox = document.querySelector(".result-box");
const inputBox = document.getElementById("input-box");

inputBox.onkeyup = function(){
	let result = [];
	let input = inputBox.value;
	if( input.length){
		result = availableKeywords.filter((keyword)=>{
		return	keyword.toLowerCase().includes(input.toLowerCase());
		});
		console.log(result)
	}
	display(result);
	if(!result.length){
		resultsBox.innerHTML = '';
	}
	
}
function display(result){
	const content = result.map((list)=>{
		return "<li onclick=selectInput(this)>" + list +"</li>";
	})
	resultsBox.innerHTML = "<ul>" + content.join('') + "</ul>";
}
function selectInput(list){
	inputBox.value = list.innerHTML;
	resultsBox.innerHTML = ''
}